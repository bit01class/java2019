package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex06 extends Frame implements ActionListener{
	TextField tf;
	Button btn;
	List list;
	public Ex06() {
		
		Panel p=new Panel();
		
		tf=new TextField(10);
		tf.addActionListener(this);
		p.add(tf);
		btn=new Button("버튼");
		btn.addActionListener(this);
		p.add(btn);
		
		list=new List();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.addActionListener(this);
		p.add(list);
		
		add(p);
		setBounds(100-1280,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex06 me = new Ex06();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("이벤트 발동");
		Object obj = e.getSource();
		if(obj==tf){
			TextField temp=(TextField)obj;
			System.out.println(temp.getText());
		}else if(obj==btn){
			System.out.println("버튼이 클릭됨");
		}else if(obj==list){
			String msg=list.getSelectedItem();
			tf.setText(msg);
		}
	}

}

















