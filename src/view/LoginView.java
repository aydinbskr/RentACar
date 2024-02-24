package view;

import core.Helper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JPanel container;
    private JPanel w_top;
    private JLabel lbl_title1;
    private JLabel lbl_title2;
    private JPanel w_bottom;
    private JLabel lbl_username;
    private JTextField txt_username;
    private JLabel lbl_pass;
    private JButton btn_login;
    private JTextField txt_pass;

    public LoginView(){
        this.add(container);
        this.setTitle("Rent a Car");
        this.setSize(400, 400);
        this.setLocation(
                (Toolkit.getDefaultToolkit().getScreenSize().width - this.getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - this.getHeight()) / 2
        );
        this.setVisible(true);

        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList={this.txt_username,this.txt_pass};
            if (Helper.isFieldListEmpty(checkFieldList)){
                Helper.showMessage("fill");
            }
        });
    }
}
