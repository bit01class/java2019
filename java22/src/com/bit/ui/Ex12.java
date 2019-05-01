package com.bit.ui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


public class Ex12 extends Frame {
	static TextField tf;
	static TextArea ta;
	public Ex12() {
		setTitle("프로그램 제목");
		Panel p1=new Panel();
		
		Label la=new Label();
		la.setText("id:");
		p1.add(la);
		
		tf=new TextField(10);
		tf.setEchoChar('#');
		p1.add(tf);
		
		ta=new TextArea("",5,30,TextArea.SCROLLBARS_NONE);
		
		p1.add(ta);
		
		Button btn=new Button();
		btn.setLabel("로그인");
		//System.out.println(btn.getLabel());
		
		p1.add(btn);
		
		add(p1);
		
		setSize(500,500);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex12 me = new Ex12();
		try {
			Thread.sleep(5000);
			System.out.println(ta.getText());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
