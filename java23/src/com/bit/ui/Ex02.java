package com.bit.ui;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class Ex02 extends Frame{
	
	public Ex02() {
		
		Panel p1=new Panel();
		
		Choice cho =new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.addItem("item5");
		
		java.awt.List list1=new List(3,true);
		list1.add("item1");
		list1.add("item2");
		list1.add("item3");
		list1.add("item4");
		list1.add("item5");
		
		p1.add(cho);
		p1.add(list1);
		add(p1);
		setSize(400,300);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}

}









