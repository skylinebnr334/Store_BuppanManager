package io.github.skylinebnr334.Store_BuppanManager.App.view;

import io.github.skylinebnr334.Store_BuppanManager.App.Controller.MainController;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    // MVC Code

    private final MainController controller=new MainController();


    //Layout Parts

    private JPanel mainpanel;
    //private JLabel label;
    private JButton AppRunButton;
    private JButton SettingButton;
    //end

    public MainView(){

    }
    public void initComponent(){
        mainpanel=new JPanel();
        //label=new JLabel("test");
        SettingButton=new JButton("Setting");
        AppRunButton=new JButton("App");
        //mainpanel.add(label);
        mainpanel.setLayout(new GridLayout(1,3));
        mainpanel.add(AppRunButton);
        mainpanel.add(SettingButton);
        this.add(mainpanel);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public MainView(MainModel model){
        controller.setModel(model);
        initComponent();
    }
}
