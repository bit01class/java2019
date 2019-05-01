package com.bit.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10 {

	public static void main(String[] args) {
		File source =new File("test\\ex05.txt");
		File dest=new File("test\\ex09.txt");
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			dest.createNewFile();
			fis=new FileInputStream(source);
			fos=new FileOutputStream(dest);
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			byte[] buff=new byte[32];
			while(true){
				int su=bis.read(buff);
				if(su==-1){break;}
				bos.write(buff,0,su);
			}
			bos.flush();
			
			System.out.println("Á¾·á");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){fis.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}















