package com.bit.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex03 extends Frame{
	
	public Ex03() {
		
//		FlowLayout layout=new FlowLayout();
//		GridLayout layout=new GridLayout(2,3);//����,����
		BorderLayout layout=new BorderLayout();
		this.setLayout(layout);
		
		Button btn1=new Button("��ư1");
		Button btn2=new Button("��ư2");
		Button btn3=new Button("��ư3");
		Button btn4=new Button("��ư4");
		Button btn5=new Button("��ư5");
//		Button btn6=new Button("��ư6");
//		Button btn7=new Button("��ư7");
		
		add(btn1,BorderLayout.CENTER);
		add(btn2,BorderLayout.NORTH);
		add(btn3,BorderLayout.SOUTH);
		add(btn4,BorderLayout.EAST);
		add(btn5,BorderLayout.WEST);
//		add("Center",btn1);
//		add("North",btn2);
//		add("South",btn3);
//		add("East",btn4);
//		add("West",btn5);
//		add(btn6);
//		add(btn7);
		
		setSize(300,400);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();
	}

}
