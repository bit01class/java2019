package com.bit.event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex01 extends Frame implements MouseMotionListener{
	
	public Ex01() {
		
		addMouseMotionListener(this);
		
		
		setSize(500,500);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}

	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		int wx=e.getXOnScreen();
		int wy=e.getYOnScreen();
		System.out.println(wx+","+wy);
	}

	public void mouseMoved(MouseEvent e) {
//		System.out.println("mouseMoved...");
	}

}
















