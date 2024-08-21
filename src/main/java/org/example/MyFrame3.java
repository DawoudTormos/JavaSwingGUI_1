package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame3 extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JProgressBar progressBar;
    Timer timer;
    int progress = 0;

    public MyFrame3() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        // Progress Bar Setup
        progressBar = new JProgressBar(0, 100);
        progressBar.setPreferredSize(new Dimension(350, 30));
        progressBar.setStringPainted(true);
        progressBar.setValue(0);
        this.add(progressBar);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            progress = 0;
            progressBar.setValue(progress);
            if (timer != null && timer.isRunning()) {
                timer.stop();
            }
            timer = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    progress += 5;
                    progressBar.setValue(progress);
                    if (progress >= 100) {
                        timer.stop();
                        JOptionPane.showMessageDialog(null, "File loaded successfully!");
                    }
                }
            });
            timer.start();
        }
        if (e.getSource() == saveItem) {
            System.out.println("*beep boop* you saved a file");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
}
