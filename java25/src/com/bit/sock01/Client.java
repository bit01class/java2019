package com.bit.sock01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		String url="192.168.0.61";
		int port=5000;
		
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		try {
			sock=new Socket(url,port);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			int su=0;
			while((su=isr.read())!=-1){
				System.out.print((char)su);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
				if(sock!=null){sock.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}














