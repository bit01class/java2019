package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex02 extends Frame implements TextListener{
	TextField tf;
	
	public Ex02() {
		
		Panel p=new Panel();
		
		tf=new TextField(15);
		Ex22 even=new Ex22();
//		tf.addKeyListener(even);
		tf.addTextListener(this);
		p.add(tf);
		
		Button btn=new Button("로그인");
		Ex222 mousel =new Ex222();
		btn.addMouseListener(mousel);
		p.add(btn);
		
		add(p);
		setSize(400,300);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex02 me = new Ex02();

	}
	
	// 내부클래스(마우스 이벤트)
	class Ex222 implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			//System.out.println(tf.getText());
			tf.setText("버튼을 클릭함");
		}

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	// 내부클래스(키보드 이벤트)
	class Ex22 implements KeyListener{

		public void keyTyped(KeyEvent e) {
//			System.out.println(tf.getText());
		}

		public void keyPressed(KeyEvent e) {
//			System.out.println(tf.getText());
		}

		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()==(int)'\n'){
				System.out.println(tf.getText());
			}
		}
		
	}


	public void textValueChanged(TextEvent e) {
		TextField temp=(TextField) e.getSource();
		System.out.println(temp.getText());
//		System.out.println(tf==e.getSource());
	}

}






















