package com.bit.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		File file=new File(".\\test\\ex05.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String msg="abcdefg\ntast ok";
		
		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(file);
			
			for(int i=0; i<msg.length(); i++){
				fos.write(msg.charAt(i));
			}
			
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("작성완료");
	}

}



















