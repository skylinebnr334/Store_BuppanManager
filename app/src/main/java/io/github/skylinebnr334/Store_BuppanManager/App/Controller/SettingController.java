package io.github.skylinebnr334.Store_BuppanManager.App.Controller;

import io.github.skylinebnr334.Store_BuppanManager.App.Models.SettingModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.EventListener;
import java.util.EventObject;
import java.util.Properties;
import java.util.Vector;

public class SettingController {
    private final Logger logger= LogManager.getLogger(SettingController.class);
    public interface DBStoreListner extends EventListener{
        public void DBStoreChanged(DBStoreChangeEvent e);
    }
    private final Vector<DBStoreListner> _dbstorechangedlistners=new Vector();
    public class DBStoreChangeEvent extends EventObject{
        private final String dbStore;
        public String getDbStore(){
            return dbStore;
        }
        public DBStoreChangeEvent(Object src,String dbStore){
            super(src);
            this.dbStore=dbStore;
        }
    }

    public void addDbStoreChangedListner(DBStoreListner l){
        if(!_dbstorechangedlistners.contains(l)){
            _dbstorechangedlistners.add(l);
        }
    }
    public void removeDbStoreChangedListner(DBStoreListner l){
        _dbstorechangedlistners.remove(l);
    }
    private void _fireDbStoreChanged(String dbStore){
        for(DBStoreListner listner:_dbstorechangedlistners){
            listner.DBStoreChanged(new DBStoreChangeEvent(this,dbStore));
        }

    }
    private SettingModel model;
    public SettingController(){

    }
    public void setModel(SettingModel m){
        model=m;
    }
    public SettingModel getModel(){
        return model;
    }
    public void LoadSetting(){
        logger.info("loading settings");
        Properties props=new Properties();
        try(Reader reader=new FileReader("config.properties")){
            props.load(reader);
            model.setDBStore(props.getProperty("db_store","defaultdb.db"));
            _fireDbStoreChanged(model.getDBStore());
            return;
        }catch (IOException e){
            logger.error(e);
        }
        model.setDBStore("defaultdb.db");
        _fireDbStoreChanged(model.getDBStore());
    }
    public void SaveSetting(){
        logger.info("Saving settings");
        try(Writer writer=new FileWriter("config.properties")){
            Properties props=new Properties();
            props.setProperty("db_store",model.getDBStore());
            props.store(writer,"");

        }catch (IOException e){

            logger.error(e);
        }
    };
    public boolean setDBStore(String dbStore){
        if(dbStore==null){
            return false;
        }
        if(dbStore==""){
            return false;
        }
        model.setDBStore(dbStore);
        _fireDbStoreChanged(dbStore);
        return true;
    }
    public String getDBStore(){
        return model.getDBStore();
    }

}
