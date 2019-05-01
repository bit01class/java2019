package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex03 extends Frame implements KeyListener{
	TextField tf;
	Button btn;
	int x=0; 
	int y=0;
	public Ex03() {
		Panel p=new Panel();
		p.setLayout(null);
		
		tf=new TextField(10);
		//p.add(tf);
		btn=new Button("^");
		btn.addKeyListener(this);
		btn.setSize(30,30);
		btn.setLocation(x,y);
		p.add(btn);
		add(p);
		setSize(300,200);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex03 me = new Ex03();

	}
	// keyPressed -> (keyTyped) -> keyReleased
	public void keyTyped(KeyEvent e) {
		//System.out.println("값이만들고"+tf.getText());

//		System.out.println(e.getKeyCode());
	}

	public void keyPressed(KeyEvent e) {
		//System.out.println("키를 누르는"+tf.getText());
		
//		System.out.println(e.getKeyCode());
//		System.out.println(e.getKeyChar());
		if(e.getKeyCode()==39){
			x+=10;
		}else if(e.getKeyCode()==37){
			x-=10;
		}
		btn.setLocation(x,y);
	}

	public void keyReleased(KeyEvent e) {
		//System.out.println("키를 올리는"+tf.getText());
//		System.out.println(e.getKeyCode());
	}

}











