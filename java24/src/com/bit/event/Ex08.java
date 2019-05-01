package com.bit.event;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex08 extends Frame implements WindowListener, ActionListener{
	MenuItem mitem1,mitem2,mitem3,mitem4,mitem5;
	TextArea ta;
	
	public Ex08() {
		
		addWindowListener(this);
		
		MenuBar mb=new MenuBar();
		
		Menu menu1=new Menu("파일");
		mitem1=new MenuItem("새파일");
		mitem2=new MenuItem("열기");
		mitem3=new MenuItem("저장");
		mitem4=new MenuItem("종료");
		mitem1.addActionListener(this);
		mitem2.addActionListener(this);
		mitem3.addActionListener(this);
		mitem4.addActionListener(this);
		menu1.add(mitem1);
		menu1.add(mitem2);
		menu1.add(mitem3);
		menu1.addSeparator();
		menu1.add(mitem4);
		
		Menu menu2=new Menu("편집");
		Menu menu3=new Menu("도움말");
		mitem5=new MenuItem("정보");
		menu3.add(mitem5);
		
		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		setMenuBar(mb);
		
		ta=new TextArea();
		add(ta);
		
		Toolkit tool=Toolkit.getDefaultToolkit();
		Dimension dim = tool.getScreenSize();
		int wx=dim.width;
		int wy=dim.height;
		Rectangle rect=new Rectangle(500,400);
		rect.setLocation(wx/2-500/2-1280,wy/2-400/2 );
		setBounds(rect);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mitem4){
			dispose();
		}else if(e.getSource()==mitem2){
			FileDialog fDia=null;
			fDia=new FileDialog(this,"열기",FileDialog.LOAD);//
			
			fDia.setVisible(true);
//			System.out.println(fDia.getDirectory());
//			System.out.println(fDia.getFile());
			File target=new File(fDia.getDirectory()+fDia.getFile());
			InputStream is=null;
			InputStreamReader isr=null;
			BufferedReader br=null;
			if(target.exists()){
				try {
					is=new FileInputStream(target);
					isr=new InputStreamReader(is);
					br=new BufferedReader(isr);
					String msg=null;
					boolean boo=true;
					StringBuffer sb=new StringBuffer();
					while((msg=br.readLine())!=null){
						if(boo){
							ta.setText(msg);
							boo=false;
						}else{
							ta.setText(ta.getText()+"\r\n"+msg);
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} finally {
					try {
						if(br!=null){br.close();}
						if(isr!=null){isr.close();}
						if(is!=null){is.close();}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		}else if(e.getSource()==mitem3){
			FileDialog fDia=null;
			fDia=new FileDialog(this,"저장",FileDialog.SAVE);
			
			fDia.setVisible(true);
			System.out.println(fDia.getDirectory());
			System.out.println(fDia.getFile());
			File target=new File(fDia.getDirectory()+fDia.getFile());
			Writer fw=null;
			PrintWriter pw=null;
				// 신규
				
			try {
				target.createNewFile();
				fw=new FileWriter(target);
				pw=new PrintWriter(fw);
				pw.print(ta.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(pw!=null){pw.close();}
					if(fw!=null){fw.close();}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
				
		}else if(e.getSource()==mitem1){
			System.out.println("clear");
			ta.setText(" ");
		}
		
	}
	
	public static void main(String[] args) {
		Ex08 me = new Ex08();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		
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
