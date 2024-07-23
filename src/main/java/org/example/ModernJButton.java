package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ModernJButton extends JButton {
    private final Color normalColor = new Color(45, 45, 45);
    private final  Color hoverColor = new Color(70, 70, 70);

    public ModernJButton(String text) {
        super(text);
        setBackground(normalColor);
        addActionListener((e)-> System.out.println("clicked:\t" + ((JButton)e.getSource()).getText()));
        setContentAreaFilled(false);
        setFocusPainted(false);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 13));
        setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        setOpaque(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
                setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(normalColor);
                setOpaque(true);
            }
        });
    }
}