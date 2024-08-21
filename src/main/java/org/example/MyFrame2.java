package org.example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame2 extends JFrame implements ActionListener, ChangeListener {

    JButton submitButton;
    JTextField nameField, ageField;
    JRadioButton maleRadio, femaleRadio;
    JComboBox<String> countryComboBox;
    JCheckBox subscribeCheckBox;
    JSlider ageSlider;
    JLabel ageLabel;

    public MyFrame2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        this.setTitle("User Profile Setup");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Name Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(250, 40));
        nameField.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.add(nameField, gbc);

        // Age Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new JLabel("Age:"), gbc);

        gbc.gridx = 1;
        ageField = new JTextField();
        ageField.setPreferredSize(new Dimension(250, 40));
        ageField.setFont(new Font("Consolas", Font.PLAIN, 20));
        this.add(ageField, gbc);

        // Gender Label and Radio Buttons
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(new JLabel("Gender:"), gbc);

        gbc.gridx = 1;
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        this.add(maleRadio, gbc);

        gbc.gridy = 3;
        this.add(femaleRadio, gbc);

        // Country Label and ComboBox
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(new JLabel("Country:"), gbc);

        gbc.gridx = 1;
        String[] countries = {"USA", "Canada", "UK", "Australia", "Other"};
        countryComboBox = new JComboBox<>(countries);
        this.add(countryComboBox, gbc);

        // Subscription CheckBox
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        subscribeCheckBox = new JCheckBox("Subscribe to newsletter");
        this.add(subscribeCheckBox, gbc);

        // Age Slider
        gbc.gridx = 0;
        gbc.gridy = 6;
        this.add(new JLabel("Age (Slider):"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        ageSlider = new JSlider(0, 100, 25);
        ageSlider.setPreferredSize(new Dimension(250, 40));
        ageSlider.setPaintTicks(true);
        ageSlider.setMinorTickSpacing(5);
        ageSlider.setPaintTrack(true);
        ageSlider.setMajorTickSpacing(25);
        ageSlider.setPaintLabels(true);
        ageSlider.addChangeListener(this);
        this.add(ageSlider, gbc);

        gbc.gridy = 7;
        ageLabel = new JLabel("Age: 25");
        this.add(ageLabel, gbc);

        // Submit Button
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        this.add(submitButton, gbc);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = maleRadio.isSelected() ? "Male" : (femaleRadio.isSelected() ? "Female" : "Not specified");
            String country = (String) countryComboBox.getSelectedItem();
            boolean isSubscribed = subscribeCheckBox.isSelected();
            String subscriptionStatus = isSubscribed ? "Yes" : "No";

            // Output the collected information to the console
            System.out.println("User Profile:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Country: " + country);
            System.out.println("Subscribed: " + subscriptionStatus);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == ageSlider) {
            ageLabel.setText("Age: " + ageSlider.getValue());
        }
    }
}
