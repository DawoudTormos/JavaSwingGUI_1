package org.example;

import javax.swing.*;


/*
uses null layout to absolutely position components using px coordinates
 */
public class AbsolutePositioningLayoutFrame extends JFrame {
    public AbsolutePositioningLayoutFrame(int width, int height) {
        this.setTitle("Absolute Positioning Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize( width, height);
        this.setLayout(null);
        this.setVisible(true);

    }
}
