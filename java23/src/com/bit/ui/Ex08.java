package com.bit.ui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class Ex88 extends Canvas{
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.draw3DRect(100, 100, 100, 100,false);// x,y, x+?,y+?
		g.drawString("JAVA", 300, 300);
		
		
//		g.fillRect(100, 100, 100, 100);// x,y, x+?,y+?
//		g.setColor(Color.RED);
//		g.drawLine(100, 100, 300, 300);// x,y, endx,endy
//		g.setColor(Color.BLACK);
//		g.fillOval(300, 300, 100, 50);
//		g.fillArc(300, 100, 200, 200, 0, 270);
//		g.drawRect(100, 100, 100, 100);// x,y, x+?,y+?
//		g.setColor(Color.RED);
//		g.drawLine(100, 100, 300, 300);// x,y, endx,endy
//		g.setColor(Color.BLACK);
//		g.drawOval(300, 300, 100, 50);
//		g.drawArc(300, 100, 200, 200, 0, 270);
	}
}

public class Ex08 extends Frame{
	
	public Ex08() {
		
		Ex88 can=new Ex88();
//		Canvas can=new Canvas();
		add(can);
		setSize(600,600);
		setLocation(100-1280,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex08 me = new Ex08();

	}
	
	

}