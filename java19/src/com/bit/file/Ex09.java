package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		File source = new File("test\\Wildlife.wmv");
		File dest = new File("copy\\copy.wmv");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		byte[] buff=new byte[512];
		try {
			dest.createNewFile();
			fis=new FileInputStream(source);
			fos=new FileOutputStream(dest);
			
			while(true){
				int su=fis.read(buff);
				if(su==-1){break;}
				fos.write(buff,0,su);
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("카피 완료");
	}

}









