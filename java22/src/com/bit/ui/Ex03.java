package com.bit.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex03 extends Frame{
	
	public Ex03() {
		
//		FlowLayout layout=new FlowLayout();
//		GridLayout layout=new GridLayout(2,3);//세로,가로
		BorderLayout layout=new BorderLayout();
		this.setLayout(layout);
		
		Button btn1=new Button("버튼1");
		Button btn2=new Button("버튼2");
		Button btn3=new Button("버튼3");
		Button btn4=new Button("버튼4");
		Button btn5=new Button("버튼5");
//		Button btn6=new Button("버튼6");
//		Button btn7=new Button("버튼7");
		
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
