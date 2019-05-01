package com.bit.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex02 extends Frame{
	
	public Ex02() {
		java.awt.FlowLayout layout=new FlowLayout();
		setLayout(layout);
		
		Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		
		add(btn1);
		add(btn2);
		
		setSize(300,200);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me =new Ex02();

	}

}
