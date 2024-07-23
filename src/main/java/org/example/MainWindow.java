package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow implements ActionListener {

    AbsolutePositioningLayoutFrame frame = new AbsolutePositioningLayoutFrame(600,600);

    ModernJButton nextBtn = new ModernJButton("Get to next Page");

    public MainWindow() {
        nextBtn.setBounds(230,230,150,60);
        nextBtn.removeActionListener(nextBtn.getActionListeners()[0]);// deleting the only default actionLister in the ModernJButton class
        nextBtn.addActionListener(this);
        frame.add(nextBtn);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn) {
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
}
