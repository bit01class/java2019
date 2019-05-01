package com.bit.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex09 extends WindowAdapter{
	static Frame frame;
	
	public void windowClosing(WindowEvent e) {
		frame.dispose();
	}

	public static void main(String[] args) {
		frame=new Frame();
		frame.addWindowListener(new Ex09());
		
		frame.setBounds(100-1280,100,500,400);
		frame.setVisible(true);

	}

}










