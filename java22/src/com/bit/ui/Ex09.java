package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex09 extends Frame{
	
	public Ex09() {
		
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		Button btn3=new Button("3");
		Button btn4=new Button("4");
		Button btn5=new Button("5");
		Button btn6=new Button("6");
		Button btn7=new Button("7");
		Button btn8=new Button("8");
		Button btn9=new Button("9");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn1,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn2,gbc);
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn3,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn4,gbc);
		
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn5,gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn6,gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn7,gbc);
//		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		add(btn8,gbc);
//		
//		gbc.gridx=2;
//		gbc.gridy=3;
//		gbc.gridwidth=1;
//		gbc.gridheight=1;
//		gbc.weightx=1.0;
//		gbc.weighty=1.0;
//		add(btn9,gbc);
		
		setSize(300,400);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09 me = new Ex09();

	}

}
