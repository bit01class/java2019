package com.bit.sock02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			serve=new ServerSocket(5000);
			Socket sock = serve.accept();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String msg=null;
			while(true){
				msg=br.readLine();
				if(msg==null){break;}
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(br!=null){br.close();}
					if(isr!=null){isr.close();}
					if(is!=null){is.close();}
					if(serve!=null){serve.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}






