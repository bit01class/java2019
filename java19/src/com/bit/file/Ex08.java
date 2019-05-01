package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		File source=new File(".\\test\\Wildlife.wmv");
		File dest=new File(".\\copy\\copy.wmv");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			dest.createNewFile();
			fis=new FileInputStream(source);
			fos=new FileOutputStream(dest);
			while(true){
				int su=fis.read();
				if(su==-1){break;}
				fos.write(su);
			}
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("카피완료");

	}

}



















