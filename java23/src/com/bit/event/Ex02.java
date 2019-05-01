package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener{
	
	public Ex02() {
		
		Panel p=new Panel();
		
		Button btn=new Button("버튼");
		p.addMouseListener(this);
		p.add(btn);
		
		add(p);
		setSize(600,500);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭"+e.getX()+","+e.getY());
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("누르고");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("올라옴");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 위로옴");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 빠져나감");
	}

}













