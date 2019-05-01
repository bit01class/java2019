package com.bit.sock03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket serve=null;
		InputStream is=null;
		OutputStream os=null;
		try {
			serve=new ServerSocket(5000);
			Socket sock=serve.accept();
			is=sock.getInputStream();
			os=sock.getOutputStream();
			int su=0;
			while((su=is.read())!=-1){
				os.write(su);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null){is.close();}
				if(os!=null){os.close();}
				if(serve!=null){serve.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
