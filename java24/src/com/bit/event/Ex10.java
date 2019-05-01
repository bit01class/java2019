package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex10 extends Frame {
	
//	class Ex1010 extends WindowAdapter{
//		public void windowClosing(WindowEvent e) {
//			dispose();
//		}
//	}
	
	public Ex10() {
//		Ex1010 ex1010=new Ex1010();
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		Panel p=new Panel();
		
		Button btn1=new Button("시작");
		Button btn2=new Button("종료");
		
		btn1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
			}
		});
		
		btn2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		p.add(btn1);
		p.add(btn2);
		
		add(p);
		setBounds(100-1280,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex10 me = new Ex10();
	}

}











