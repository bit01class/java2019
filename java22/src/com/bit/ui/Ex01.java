package com.bit.ui;

import java.awt.Frame;

public class Ex01 {

	public static void main(String[] args) {
		int x=100;
		int y=100;
		java.awt.Frame frame=new Frame();
		
		frame.setSize(300, 300);
		frame.setLocation(x-1280, y);
		
		frame.setVisible(true);
		
		for(int i=0; i<100; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			x+=5;
			y+=5;
			frame.setLocation(x-1280, y);
		}
	}

}









