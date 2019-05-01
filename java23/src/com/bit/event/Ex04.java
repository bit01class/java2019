package com.bit.event;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex04 extends Frame implements KeyListener{
	int x=250;
	int y=420;
	int maxX,maxY;
	Canvas can;
	
	public Ex04() {
		
		Panel p=new Panel();
		
		p.setLayout(null);
		addKeyListener(this);
		can=new Canvas(){
			public void paint(Graphics g) {
				g.setColor(Color.GREEN);
				g.fillRect(0, 0, 50, 50);
			}
		};
		can.setSize(50, 50);
		can.setLocation(x, y);
		p.add(can);
		add(p);
		setSize(600, 500);
		setLocation(100-1280,100);
		setVisible(true);
		maxX=p.getWidth()-50;
		maxY=p.getHeight()-50;
	}

	public static void main(String[] args) {
		new Ex04();

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// w
		//asd
		
		if(e.getKeyChar()=='a'&&x-5>=0){
			x-=5;
		}else if(e.getKeyChar()=='d'&& x+5<=maxX){
			x+=5;
		}else if(e.getKeyChar()=='w'&&y-5>=0){
			y-=5;
		}else if(e.getKeyChar()=='s'&& y+5<=maxY){
			y+=5;
		}
		can.setLocation(x, y);
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
