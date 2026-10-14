package io.github.skylinebnr334.Store_BuppanManager.App;

import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;
import io.github.skylinebnr334.Store_BuppanManager.App.view.MainView;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        System.out.println("main");
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                start();
            }
        });
    }
    public static void start(){
        MainModel model=new MainModel();
        MainView view=new MainView(model);
        view.setVisible(true);
    }
}
