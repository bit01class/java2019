package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex02 extends Frame implements MouseListener{
	
	public Ex02() {
		
		Panel p=new Panel();
		
		Button btn=new Button("��ư");
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
		System.out.println("Ŭ��"+e.getX()+","+e.getY());
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("������");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("�ö��");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺�� ���ο�");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("���콺�� ��������");
	}

}













