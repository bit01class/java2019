package com.bit.sock02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip="127.0.0.1";
		int port=5000;
		
		Socket sock=null;
		OutputStream os=null;
		
		try {
			sock=new Socket(ip,port);
			os=sock.getOutputStream();
			while(true){
				System.out.print(">>>");
				String msg=sc.nextLine();
				if(msg.equals("Á¾·á")){break;}
				msg+="\n";
				os.write(msg.getBytes());
				os.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}













