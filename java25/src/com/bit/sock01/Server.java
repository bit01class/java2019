package com.bit.sock01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null;
		OutputStream os = null;
		
		try {
			serve=new ServerSocket(5000);
			Socket sock = serve.accept();
//			System.out.println(sock);
//			System.out.println("������ ������");
			String msg="ȯ���մϴ�";
			os = sock.getOutputStream();
			
			os.write(msg.getBytes());
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(os!=null){os.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}









