package com.bit.event;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex11 extends Frame{
	
	public Ex11() {
		Toolkit tool= Toolkit.getDefaultToolkit();
		final Image img=tool.getImage(".\\test\\1.png");
		Icon icon=new ImageIcon(img);
		
		
		Panel p=new Panel();
		JButton btn=new JButton("¹öÆ°");
		btn.setIcon(icon);
		p.add(btn);
		add(p);
//		Canvas can=new Canvas(){
//			@Override
//			public void paint(Graphics g) {
//				g.drawImage(img, 100, 100,200,200,this);
//			}
//		};
//		
//		add(can);
		
		setBounds(100-1280,100,500,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex11 me = new Ex11();

	}

}
