package io.github.skylinebnr334.Store_BuppanManager.App;

import io.github.skylinebnr334.Store_BuppanManager.App.Models.BuppanRegisterModel;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.SettingModel;
import io.github.skylinebnr334.Store_BuppanManager.App.view.BuppanRegisterView;
import io.github.skylinebnr334.Store_BuppanManager.App.view.MainView;
import io.github.skylinebnr334.Store_BuppanManager.App.view.SettingView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;

public class Main {
    private final static  Logger logger= LogManager.getLogger(Main.class);
    public static void main(String[] args){
        logger.info("Start!");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                start();
            }
        });
    }
    public static void start(){
        //MainModel model=new MainModel();
        //MainView view=new MainView(model);
        //view.setVisible(true);
        /*SettingModel model=new SettingModel();
        SettingView view=new SettingView(model);*/
        BuppanRegisterModel model=new BuppanRegisterModel();
        BuppanRegisterView view=new BuppanRegisterView(model);
        view.setVisible(true);
    }
}
