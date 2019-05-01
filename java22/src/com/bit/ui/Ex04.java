package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex04 extends Frame{

	public Ex04() {
		
		GridLayout layout=new GridLayout(2,1);
		setLayout(layout);
		
		Panel p1=new Panel();

		GridLayout layout2=new GridLayout(3,1);
		p1.setLayout(layout2);
		Panel p2=new Panel();
		Button btn1=new Button("버튼1");
		p1.add(btn1);
		Button btn2=new Button("버튼2");
		p2.add(btn2);
		
		add(p1);
		add(p2);
		
		setSize(300,400);
		setLocation(100-1280,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex04 me =new Ex04();
	}

}
