package io.github.skylinebnr334.Store_BuppanManager.App.view;

import io.github.skylinebnr334.Store_BuppanManager.App.Controller.BuppanRegisterController;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.BuppanRegisterModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;

public class BuppanRegisterView extends JFrame {
    private final Logger logger= LogManager.getLogger(BuppanRegisterView.class);
    private final BuppanRegisterController controller=new BuppanRegisterController();


    private JPanel mainpanel;


    public void initComponent() {
        logger.info("initializing component");

        mainpanel=new JPanel();
        mainpanel.setLayout(null);
        this.add(mainpanel);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public BuppanRegisterView(){

    }
    public BuppanRegisterView(BuppanRegisterModel model)
    {
        controller.setModel(model);
        initComponent();
    }

}
