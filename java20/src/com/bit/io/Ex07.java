package com.bit.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		OutputStream os=null;
		InputStream is=null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			os=new FileOutputStream(file);
			dos=new DataOutputStream(os);
			dos.writeInt(1000);
			dos.writeDouble(3.14);
			
			dos.writeInt(1001);
			dos.writeDouble(3.15);
			
			dos.writeInt(1020);
			dos.writeDouble(3.16);
			
			dos.writeInt(1300);
			dos.writeDouble(3.17);
			
			dos.writeInt(4000);
			dos.writeDouble(3.18);
			dos.flush();
			
			is=new FileInputStream(file);
			dis=new DataInputStream(is);
			for(int i=0; i<file.length()/12; i++){
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(is!=null){is.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}


















