package com.bit.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex04 {

	public static void main(String[] args) {
		File file=new File("files\\data.bin");
		InputStream is=null;
		DataInputStream dis=null;
		if(file.exists()){
			try {
				is=new FileInputStream(file);
				dis=new DataInputStream(is);
				int su1=dis.read();
				System.out.println("su1="+su1);
				byte su2=dis.readByte();
				System.out.println("su2="+su2);
				int su3=dis.readInt();
				System.out.println("su3="+su3);
				long su4=dis.readLong();
				System.out.println("su4="+su4);
				float su5=dis.readFloat();
				System.out.println("su5="+su5);
				double su6=dis.readDouble();
				System.out.println("su6="+su6);
				char ch1=dis.readChar();
				System.out.println("ch1="+ch1);
				boolean boo=dis.readBoolean();
				System.out.println("boolean="+boo);
				String msg=dis.readUTF();
				System.out.println("msg="+msg);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(dis!=null){dis.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("파일없음");
		}

	}

}


















