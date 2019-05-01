package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex05 extends Frame{
	
	public Ex05() {
		
		GridLayout layout=new GridLayout(4,3);
		setLayout(layout);
		
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		Button btn5=new Button("5");
		Button btn6=new Button("6");
		Button btn7=new Button("7");
		Button btn8=new Button("8");
		Button btn9=new Button("9");
		Button btn0=new Button("0");
		Button btn10=new Button("*");
		Button btn11=new Button("#");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		add(btn0);
		add(btn11);
		
		setSize(300,400);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();
	}

}
