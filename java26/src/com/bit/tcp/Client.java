package com.bit.tcp;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Frame implements ActionListener{
	TextArea ta;
	TextField tf;
	OutputStream os;
	
	public Client() {
		ta=new TextArea();
		tf=new TextField();
		tf.addActionListener(this);
		
		Panel p =new Panel();
		p.setLayout(new BorderLayout());
		p.add(ta,BorderLayout.CENTER);
		p.add(tf,BorderLayout.SOUTH);
		add(p);
		setBounds(100-1280,100,500,400);
		setVisible(true);
		init();
	}

	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		tf.setText(" ");
		msg+="\n";
		try {
			os.write(msg.getBytes());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void init(){
		String ip="192.168.0.61";
		int port=5000;
		
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			sock=new Socket(ip,port);
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			System.out.println("client start...");
			
			while(true){
				String msg=br.readLine();
				ta.append(msg+'\n');
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Client me=new Client();
	}

}













