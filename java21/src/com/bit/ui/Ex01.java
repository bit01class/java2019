package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 {

	public static void main(String[] args) {
		java.awt.Frame frame=new Frame();
//		java.awt.Button btn=new Button();
		javax.swing.JButton btn=new JButton();
		frame.add(btn);
		
		
		
//		javax.swing.JFrame frame=new JFrame();
		frame.setSize(500, 300);
		frame.setLocation(200-1280, 200);
		frame.setVisible(true);
		
		
	}

}
