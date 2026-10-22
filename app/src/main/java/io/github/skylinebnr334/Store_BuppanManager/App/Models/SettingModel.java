package io.github.skylinebnr334.Store_BuppanManager.App.Models;

import java.io.OutputStream;

public class SettingModel {
    private String _dbstore="defaultdb.db";
    public String getDBStore(){
        return _dbstore;
    }
    public void setDBStore(String v){
        _dbstore=v;
    }

}
