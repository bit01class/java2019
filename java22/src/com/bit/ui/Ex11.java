package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex11 extends Frame{
	
	public Ex11() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		String[] msg={"7","8","9"
				,"4","5","6"
				,"1","2","3"
				,"0","-","+","="};
		Button[] btns=new Button[msg.length];
		
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(msg[i]);
		}
		setting(gbc);
		add(btns[0],gbc);
		setting(gbc);
		gbc.gridx=1;
		add(btns[1],gbc);
		setting(gbc);
		gbc.gridx=2;
		add(btns[2],gbc);
		setting(gbc);
		gbc.gridy=1;
		add(btns[3],gbc);
		setting(gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		add(btns[4],gbc);
		setting(gbc);
		gbc.gridx=2;
		gbc.gridy=1;
		add(btns[5],gbc);
		setting(gbc);
		gbc.gridy=2;
		add(btns[6],gbc);
		setting(gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		add(btns[7],gbc);
		setting(gbc);
		gbc.gridx=2;
		gbc.gridy=2;
		add(btns[8],gbc);
		setting(gbc);
		gbc.gridy=3;
		gbc.gridwidth=2;
		add(btns[9],gbc);
		setting(gbc);
		gbc.gridx=2;
		gbc.gridy=3;
		add(btns[10],gbc);
		setting(gbc);
		gbc.gridx=3;
		gbc.gridheight=2;
		add(btns[11],gbc);
		setting(gbc);
		gbc.gridx=3;
		gbc.gridy=2;
		gbc.gridheight=2;
		add(btns[12],gbc);

		setSize(400,400);
		setLocation(100-1280,100);
		setVisible(true);
	}
	
	public void setting(GridBagConstraints gbc){
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();

	}

}













