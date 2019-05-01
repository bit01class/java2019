package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex06 extends Frame{

	public Ex06() {

		GridLayout layout=new GridLayout(4,3);
		setLayout(layout);
		
		String[] msg={"7","8","9"
					,"4","5","6"
					,"1","2","3"
					,"0",".","="};
		
		for(int i=0; i<msg.length; i++){
			Button btn=new Button(msg[i]);
			add(btn);
		}
		setSize(300,400);
		setLocation(100-1280,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex06 me=new Ex06();
	}

}
