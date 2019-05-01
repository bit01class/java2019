package com.bit.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;


public class Ex03 extends Frame{
	
	public Ex03() {
		BorderLayout mainLayout=new BorderLayout();
		setLayout(mainLayout);
		
		GridLayout gl=new GridLayout(2,1);
		Panel center=new Panel();
		center.setLayout(gl);
		
		GridLayout gl2=new GridLayout(6,1);
		Panel top=new Panel();
		top.setLayout(gl2);
		TextArea ta=new TextArea();
		center.add(top);
		center.add(ta);
		
		FlowLayout fl=new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);
		
		Panel top1=new Panel();
		top1.setLayout(fl);
		top1.add(new Label("성 명"));
		top1.add(new TextField(10));
		top1.add(new Label("성 별"));
		CheckboxGroup chg1=new CheckboxGroup();
		Checkbox ch1=new Checkbox("남",chg1,true);
		Checkbox ch2=new Checkbox("여",chg1,false);
		
		top1.add(ch1);
		top1.add(ch2);
		Panel top2=new Panel();
		top2.setLayout(fl);
		top2.add(new Label("주 민 번 호"));
		top2.add(new TextField(5));
		top2.add(new Label("-"));
		top2.add(new TextField(5));
		Panel top3=new Panel();
		top3.setLayout(fl);
		top3.add(new Label("주 소"));
		top3.add(new TextField(15));
		Panel top4=new Panel();
		top4.setLayout(fl);
		top4.add(new Label("부 서 명"));
		Choice cho=new Choice();
		cho.addItem("기획부");
		cho.addItem("영업부");
		cho.addItem("관리부");
		top4.add(cho);
		Panel top5=new Panel();
		top5.setLayout(fl);
		top5.add(new Label("취 미"));
		Checkbox ch11=new Checkbox("운동",true);
		Checkbox ch12=new Checkbox("음악감상",false);
		Checkbox ch13=new Checkbox("영화",false);
		Checkbox ch14=new Checkbox("컴퓨터",false);

		top5.add(ch11);
		top5.add(ch12);
		top5.add(ch13);
		top5.add(ch14);
		Panel top6=new Panel();
		top6.setLayout(fl);
		top6.add(new Label("자 기 소 개"));
		
		top.add(top1);
		top.add(top2);
		top.add(top3);
		top.add(top4);
		top.add(top5);
		top.add(top6);
		
		Panel down1=new Panel();
		down1.add(new Button("저장"));
		down1.add(new Button("종료"));
		
		add(center,BorderLayout.CENTER);
		add(down1,BorderLayout.SOUTH);
		setSize(300,500);
		setLocation(100-1280,100);
		setVisible(true);
//		setResizable(false);
	}

	public static void main(String[] args) {
		Ex03 me =new Ex03();

	}

}
