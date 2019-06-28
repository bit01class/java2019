package com.bit;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args) {
		String root="www";
		String index="index.txt";
		File file=null;
		ServerSocket serve=null;
		Socket sock=null;
		OutputStream os=null;
		DataOutputStream dos=null;
		InputStream is=null;
		byte[] buf=new byte[1024];
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		try {
			System.out.println("서버 시작");
			serve=new ServerSocket(80);
			sock=serve.accept();
			os=sock.getOutputStream();
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
//			System.out.println(">>>"+);
			String msg2=br.readLine();
			System.out.println(msg2);
			String[] arr=msg2.split(" ");
			
			if(arr[1].equals("/")){
				arr[1]="/"+index;
			}
			file=new File("./"+root+arr[1]);
			
			
//			dos=new DataOutputStream(os);
//			
//			dos.writeUTF(msg);
//			dos.flush();
			is=new FileInputStream(file);
			int su=0;
			
			os.write("HTTP/1.1 200 OK \r\n".getBytes());
			os.write("Content-type: text/html \r\n".getBytes());
			os.write("\r\n".getBytes());
			
			while((su=is.read(buf))!=-1){
				os.write(buf,0,su);
			}
			
			os.flush();
			System.out.println("메시지 전달 완료");
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}











