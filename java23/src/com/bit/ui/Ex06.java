package com.bit.ui;

import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.Toolkit;


public class Ex06 extends Frame{
	
	
	public Ex06() {
		
		Font font=new Font("batang",Font.BOLD,20);
		
		MenuBar menu=new MenuBar();
		menu.setFont(font);
		Menu menu1=new Menu("����");
		MenuItem mitem1=new MenuItem("����");
		menu1.add(mitem1);
		
		menu1.addSeparator();
		MenuItem mitem2=new MenuItem("����");
		menu1.add(mitem2);
		
		Menu menu2=new Menu("����");
		MenuItem mitem3=new MenuItem("�������");
		menu2.add(mitem3);
		menu2.addSeparator();
		
		CheckboxMenuItem mitem4=new CheckboxMenuItem("item1");
		CheckboxMenuItem mitem5=new CheckboxMenuItem("item2");
		CheckboxMenuItem mitem6=new CheckboxMenuItem("item3");
		menu2.add(mitem4);
		menu2.add(mitem5);
		menu2.add(mitem6);
		menu2.addSeparator();
		
		PopupMenu popup=new PopupMenu("�׷�");
		MenuItem mitem7=new MenuItem("������1");
		popup.add(mitem7);
		MenuItem mitem8=new MenuItem("������2");
		popup.add(mitem8);
		menu2.add(popup);
		
		Menu menu3=new Menu("����");
		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
		
		this.setMenuBar(menu);
		
		Panel p=new Panel();
		p.setLayout(null);
		p.setBackground(Color.GREEN);
		Button btn=new Button("0,0����");
		btn.setSize(100, 50);
		btn.setLocation(484-100,242-50);//484,242

		p.add(btn);
		add(p);
		Dimension dim =new Dimension(500,300);
		setSize(dim);
		Dimension win = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(win.width/2-dim.width/2-1600
						,win.height/2-dim.height/2);
		setVisible(true);
		System.out.println(p.getSize().width);
		System.out.println(p.getSize().height);
	}
	

	public static void main(String[] args) {
		new Ex06();

	}

}
