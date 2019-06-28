package com.bit.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args) {
		
		ServerSocket serve=null;
		String msg="<img src='https://t1.daumcdn.net/daumtop_chanel/op/20170315064553027.png'>";
		try {
			serve=new ServerSocket(80);
			System.out.println("서버시작");
			Socket sock = serve.accept();
			OutputStream out = sock.getOutputStream();
			
			out.write("HTTP/1.1 200 OK \r\n".getBytes());
			out.write("Content-Type:text/html;charset=utf-8 \r\n".getBytes());
			out.write("\r\n".getBytes());
			out.write(msg.getBytes());
			out.flush();
			out.close();
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









