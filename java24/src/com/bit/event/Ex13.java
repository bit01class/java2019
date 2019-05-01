package com.bit.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex13 extends Frame implements Runnable,ActionListener{
	int cnt;
	JButton[] btns;
	Panel center;
	Button btnStart;

	public Ex13() {
		Toolkit tool=Toolkit.getDefaultToolkit();
		String filename=null;
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		
		center=new Panel();
		center.setLayout(new GridLayout(4,4));
		btns=new JButton[16];
		for(int i=0; i<btns.length; i++){
			btns[i]=new JButton();
			
			if(i%4==0){
				filename=".\\test\\1.png";
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cnt++;
					}
				});
				
			}else if(i%4==1){
				filename=".\\test\\2.png";
			}else if(i%4==2){
				filename=".\\test\\3.png";
			}else {
				filename=".\\test\\4.png";
			}
			
			Image img=tool.getImage(filename);
			
			Icon icon=new ImageIcon(img);
			btns[i].setIcon(icon);
			center.add(btns[i]);
			btns[i].setEnabled(false);
		}
		
		Panel east=new Panel();
		east.setLayout(new GridLayout(6,1));
		
		btnStart=new Button("시작");
		Button btnEnd=new Button("종료");
		btnStart.addActionListener(this);
		btnEnd.addActionListener(this);
		east.add(new Label());
		east.add(btnStart);
		east.add(new Label());
		east.add(btnEnd);
		
		p.add(center,BorderLayout.CENTER);
		p.add(east,BorderLayout.EAST);
		
		
		add(p);
		setBounds(100, 100, 500, 400);
		setVisible(true);
		
	}
	
	public void imgChange(){
		// 1~15
		for(int i=0; i<100; i++){
			JButton temp=btns[0];
			Random ran=new Random();
			int su=ran.nextInt(15)+1;
			btns[0]=btns[su];
			btns[su]=temp;
			System.out.println(su);
		}
		for(int i=0; i<btns.length; i++){
			center.add(btns[i]);
		}
		
		center.revalidate();
	}
	
	public static void main(String[] args) {
		Ex13 me = new Ex13();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if(btn.getLabel().equals("종료")){
			dispose();
		}else if(btn.getLabel().equals("시작")){
//			imgChange();
			btn.setEnabled(false);
			for(int i=0; i<btns.length; i++){
				btns[i].setEnabled(true);
			}
			
			Thread thr=new Thread(this);
			thr.start();
		}
		
	}

	@Override
	public void run() {
		for(int i=0; i<6; i++){
			imgChange();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<btns.length; i++){
			btns[i].setEnabled(false);
		}
		btnStart.enable(true);
	}

}
















