package riskView.map;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;



@SuppressWarnings("serial")
public class LaunchGame extends java.awt.Frame
    {
	  private JLabel label = new JLabel("Enter No of Players: ");
	  private JLabel label1 = new JLabel ("Select a map file :");
	  private JTextField textField = new JTextField(20);
	  private JButton button = new JButton("OK");
	  private JFileChooser filechooser = new JFileChooser();
	  public LaunchGame()
	    {
		  JFrame frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(375,100);
			frame.add(label, BorderLayout.WEST);
			frame.add(label1, BorderLayout.LINE_START);
			frame.add(textField, BorderLayout.EAST);
			frame.add(button, BorderLayout.PAGE_END);
			label.setVisible(true);
			label1.setHorizontalAlignment(HEIGHT);
			textField.setVisible(true);
			button.setBounds(50, 50, 75,50);
			button.setVisible(true);
			
			filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			int result = filechooser.showOpenDialog(this);
			if (result == JFileChooser.APPROVE_OPTION) {
			    File selectedFile = filechooser.getSelectedFile();
			    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
			
			    textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
			String text = textField.getText();
		    System.out.println(text);
			    }
			});
	    }
    }
    }

	 