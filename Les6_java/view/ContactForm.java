package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class ContactForm extends JFrame {
    protected JButton admin_button, user_button;

    public ContactForm() {
        super("VendingMachine");
        super.setBounds(600, 400, 300, 250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(2, 1, 5, 10));

        admin_button = new JButton("Admin");
        user_button = new JButton("User");

        container.add(admin_button);
        container.add(user_button);

        admin_button.addActionListener(new AdminButtonEventManager());
        user_button.addActionListener(new UserButtonEventManager());
    }

    class AdminButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            PanelAdmin formAdmin = null;
            try {
                formAdmin = new PanelAdmin();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            formAdmin.setVisible(true);
        }
    }

    class UserButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            PanelUser formUser = null;
            try {
                formUser = new PanelUser();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            formUser.setVisible(true);
        }
    }
}