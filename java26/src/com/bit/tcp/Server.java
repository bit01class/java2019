package com.bit.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread {
	Socket sock;
	static ArrayList<Socket> list=new ArrayList<Socket>();
	
	public Server(Socket sock) {
		this.sock=sock;
	}
	
	public void run() {
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String msg=br.readLine();
				sayAll(msg+"\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void sayAll(String msg){
		for(int i=0; i<list.size(); i++){
			Socket sock=list.get(i);
			try {
				OutputStream out = sock.getOutputStream();
				out.write(msg.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		int port=5000;
		ServerSocket serve=null;
		
		try {
			serve=new ServerSocket(port);
			while(true){
				Socket sock = serve.accept();
				list.add(sock);
				Server thr=new Server(sock);
				thr.start();
				System.out.println(sock);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}





















