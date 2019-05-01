package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex10 extends Frame{
	
	public Ex10() {
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.7;
		gbc.weighty=1.0;
		Button btn1=new Button("1");
		Button btn2=new Button("2");
		
		add(btn1,gbc);
		gbc.gridx=1;
		gbc.weightx=0.3;
		add(btn2,gbc);
		
		setLocation(100-1280,100);
		setSize(200,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10 me=new Ex10();

	}

}
