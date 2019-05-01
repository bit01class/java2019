package com.bit.ui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex01 {

	public static void main(String[] args) {
		Frame frame=new Frame();
		
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout());
		
		Font font=new Font("궁서체",Font.PLAIN,20);
		
		Label laId=new Label();
		laId.setText("제목:");
		laId.setFont(font);
		laId.setBackground(Color.green);
		p1.add(laId);
		
		TextField tfId=new TextField(15);
		tfId.setFont(font);
		tfId.setBackground(Color.RED);
		p1.add(tfId);
		
		TextArea ta=new TextArea("",5,60,TextArea.SCROLLBARS_BOTH);
		ta.setFont(font);
		p1.add(ta);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox chck1=new Checkbox("item1",cbg,false);
		Checkbox chck2=new Checkbox("item2",cbg,true);
		Checkbox chck3=new Checkbox("item3",cbg,false);
		chck1.setFont(font);
		chck2.setFont(font);
		chck3.setFont(font);
		p1.add(chck1);
		p1.add(chck2);
		p1.add(chck3);
		CheckboxGroup cbg2=new CheckboxGroup();
		Checkbox chck21=new Checkbox("item1",cbg2,false);
		Checkbox chck22=new Checkbox("item2",cbg2,false);
		Checkbox chck23=new Checkbox("item3",cbg2,true);
		chck21.setFont(font);
		chck22.setFont(font);
		chck23.setFont(font);
		p1.add(chck21);
		p1.add(chck22);
		p1.add(chck23);
		
		
		
		Button btn=new Button("확인");
		btn.setBackground(Color.BLUE);
		p1.add(btn);
		
		frame.add(p1);
		frame.setSize(500,400);
		frame.setLocation(100-1280,100);
		frame.setVisible(true);
	}

}












