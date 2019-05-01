package com.bit.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Ex04 extends Frame implements ComponentListener{
	
	public Ex04() {
		
		Panel p=new Panel();
		
		Button btn=new Button("¹öÆ°"); 
		
		
		btn.addComponentListener(this);
		p.add(btn);
		
		add(p);
		setBounds(100-1280,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex04 me = new Ex04();
	}

	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("componentResized");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("componentMoved");
	}

	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("componentShown");
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("componentHidden");
	}

}
