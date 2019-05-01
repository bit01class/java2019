package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class Ex05 extends Frame implements FocusListener {
	TextField tfId,tfPw;
	public Ex05() {
		Panel p=new Panel();
		
		p.setLayout(new GridLayout(6,1));
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		
		Label laId=new Label("id:");
		Label laPw=new Label("pw:");
		
		tfId=new TextField("id를 입력하세요",15);
		tfPw=new TextField("pw를 입력하세요",15);
		tfPw.addFocusListener(this);
		tfPw.setEchoChar('*');
		
		Button btn1=new Button("로그인");
		Button btn2=new Button("취소");
		
		p1.add(laId);
		p1.add(tfId);
		p2.add(laPw);
		p2.add(tfPw);
		p3.add(btn1);
		p3.add(btn2);
		p.add(new Label());
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		add(p);
		
		setBounds(100-1280,100,500,300);
		setVisible(true);
		
		btn1.requestFocus();// 포커스 지정
	}
	

	public static void main(String[] args) {
		Ex05 me = new Ex05();
	}


	@Override
	public void focusGained(FocusEvent e) {
//		System.out.println("focusGained");
		if(tfPw==e.getSource()){
			tfPw.setText("");
		}
	}


	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("focusLost");
	}

}









