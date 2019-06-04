package com.sbs;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(1000, 1000);
		JButton jb = new JButton("Welcome!");
		JPanel north = new JPanel();
		north.add(jb);
		add(north, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		

	}
}
