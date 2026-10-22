package io.github.skylinebnr334.Store_BuppanManager.App.view;

import io.github.skylinebnr334.Store_BuppanManager.App.Controller.MainController;
import io.github.skylinebnr334.Store_BuppanManager.App.Controller.SettingController;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.MainModel;
import io.github.skylinebnr334.Store_BuppanManager.App.Models.SettingModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingView extends JFrame {
    private final Logger logger= LogManager.getLogger(SettingView.class);

    // MVC Code

    private final SettingController controller=new SettingController();


    //Layout Parts

    private JPanel mainpanel;
    private JLabel label1;
    private JTextField dbTextField;
    private JLabel label2;
    private GridBagLayout gblayout;
    private JButton SaveButton;
    private JButton CancelButton;
    //end

    public SettingView(){

    }
    public void initComponent(){
        logger.info("initializing component");
        mainpanel=new JPanel();
        gblayout=new GridBagLayout();
        label1=new JLabel("DB Store");
        label2=new JLabel("DB ");
        dbTextField=new JTextField();
        SaveButton=new JButton("Save");
        CancelButton=new JButton("Cancel");
        /*
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gblayout.setConstraints(label1, gbc);
        mainpanel.add(label1);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gblayout.setConstraints(dbTextField,gbc);
        mainpanel.add(dbTextField);
        mainpanel.setLayout(gblayout);

         */

        mainpanel.setLayout(null);

        label1.setBounds(10,10,80,20);
        dbTextField.setBounds(100,10,200,20);
        SaveButton.setBounds(700,500,80,20);
        CancelButton.setBounds(600,500,80,20);
        mainpanel.add(label1);
        mainpanel.add(dbTextField);
        mainpanel.add(SaveButton);
        mainpanel.add(CancelButton);
        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setDBStore(dbTextField.getText());
                controller.SaveSetting();
            }
        });
        this.add(mainpanel);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controller.addDbStoreChangedListner(new SettingController.DBStoreListner() {
            @Override
            public void DBStoreChanged(SettingController.DBStoreChangeEvent e) {
                dbTextField.setText(e.getDbStore());
            }
        });


        controller.LoadSetting();
    }
    public SettingView(SettingModel model){
        controller.setModel(model);
        initComponent();
    }
}
