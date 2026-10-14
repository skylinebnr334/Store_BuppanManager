package io.github.skylinebnr334.Store_BuppanManager.App.Controller;

import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;

public class MainController {
    private MainModel model;
    public MainController(){

    }
    public void setModel(MainModel m){
        model=m;
    }
    public MainModel getModel(){
        return model;
    }
}
