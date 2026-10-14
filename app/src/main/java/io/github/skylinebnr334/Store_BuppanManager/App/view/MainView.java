package io.github.skylinebnr334.Store_BuppanManager.App.view;

import io.github.skylinebnr334.Store_BuppanManager.App.Controller.MainController;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;

import javax.swing.*;

public class MainView extends JFrame {
    // MVC Code

    private final MainController controller=new MainController();


    //Layout Parts

    private JPanel panel;
    private JLabel label;

    //end

    public MainView(){

    }
    public void initComponent(){
        panel=new JPanel();
        label=new JLabel("test");
        panel.add(label);
        this.add(panel);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public MainView(MainModel model){
        controller.setModel(model);
        initComponent();
    }
}
