package com.bit.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		File file = new File(".\\test\\ex08.txt");
		FileOutputStream fos=null;
		String msg="가";
		byte[] by=msg.getBytes();
		try {
			file.createNewFile();
			fos=new FileOutputStream(file);
			fos.write(by);
			fos.flush();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료");

	}

}








