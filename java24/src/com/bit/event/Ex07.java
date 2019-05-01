package com.bit.event;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex07 extends Frame implements ActionListener,WindowListener{
	Dialog dia;
	MenuItem mi5;
	Button closeBtn;
	
	public Ex07() {
		
		addWindowListener(this);
		
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("새파일");
		MenuItem mi1=new MenuItem("새파일");
		m1.add(mi1);
		MenuItem mi2=new MenuItem("열기");
		m1.add(mi2);
		MenuItem mi3=new MenuItem("저장");
		m1.add(mi3);
		m1.addSeparator();
		MenuItem mi4=new MenuItem("종료");
		m1.add(mi4);
		
		mb.add(m1);
		Menu m2=new Menu("편집");
		mb.add(m2);
		Menu m3=new Menu("도움말");
		mi5=new MenuItem("정보");
		mi5.addActionListener(this);
		m3.add(mi5);
		mb.add(m3);
		setMenuBar(mb);
		
		TextArea ta=new TextArea();
		
		add(ta);
		Rectangle rect=new Rectangle();
		rect.setLocation(100-1280, 100);
		rect.setSize(500, 300);
		setBounds(rect);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me = new Ex07();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mi5){
			dia=new Dialog(this,"프로그램 정보",true);
			dia.addWindowListener(this);
			Panel p=new Panel();
			closeBtn=new Button("닫기");
			closeBtn.addActionListener(this);
			p.add(closeBtn);
			dia.add(p);
			dia.setSize(300,200);
			dia.setLocation(this.getX(), this.getY());
			dia.setVisible(true);
		}else if(e.getSource()==closeBtn){
			dia.dispose();
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		if(e.getSource()==dia){
			dia.dispose();
		}else if(e.getSource()==this){
			dispose();
		}
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}















