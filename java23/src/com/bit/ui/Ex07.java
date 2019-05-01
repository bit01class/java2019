package com.bit.ui;

import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex07 extends Frame{
	
	public Ex07() {
		setTitle("부모창");
		setSize(500,300);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me = new Ex07();
		
		FileDialog dia=new FileDialog(me,"자식창",FileDialog.SAVE);
		dia.setSize(300,200);
		dia.setLocation(200-1280, 200);
		dia.setVisible(true);
		System.out.println(dia.getDirectory());
		System.out.println(dia.getFile());
	}

}















