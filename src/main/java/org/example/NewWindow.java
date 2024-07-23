package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame implements ActionListener {

    AbsolutePositioningLayoutFrame frame = new AbsolutePositioningLayoutFrame(600,600);

    ModernJButton backBtn = new ModernJButton("Get to Prev Page");

    public NewWindow() {
        backBtn.setBounds(230,230,150,60);
        backBtn.removeActionListener(backBtn.getActionListeners()[0]);// deleting the only default actionLister in the ModernJButton class
        backBtn.addActionListener(this);
        frame.add(backBtn);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backBtn) {
            frame.dispose();
            MainWindow mainWindow = new MainWindow();
        }
    }
}
