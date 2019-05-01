package com.bit.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class Ex05 extends Frame{
	
	public Ex05() {
		int x=8;
		int y=30;
		
		setLayout(null);
		
		Label la1=new Label("성 명");
		la1.setBackground(Color.green);
		la1.setSize(100, 50);
		la1.setLocation(x+0, y+0);
		add(la1);

		Label la2=new Label("주민등록번호");
		la2.setBackground(Color.red);
		la2.setSize(120, 50);
		la2.setLocation(x+0, y+30);
		add(la2);
		
		Label la3=new Label("주 소");
		la3.setBackground(Color.blue);
		la3.setSize(150, 50);
		la3.setLocation(x+0, y+50);
		add(la3);
		
		//Toolkit tool = getToolkit();
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		
		Dimension screen = tool.getScreenSize();
//		setSize(300,500);
//		Dimension mysize = getSize();
		
		Dimension dim=new Dimension();
		dim.setSize(300, 500);
		setSize(dim);
		
		setLocation(screen.width/2-300/2
				,screen.height/2-500/2);
		setVisible(true);
		setResizable(false);
		
		System.out.println(getAlignmentX()+":"+getAlignmentY());
	}

	public static void main(String[] args) {
		new Ex05();

	}

}
