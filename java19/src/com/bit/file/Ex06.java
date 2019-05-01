package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file=new File(".\\test\\ex05.txt");
		if(file.exists()){
			FileInputStream fis=null;
			try {
				fis=new FileInputStream(file);
				
				while(true){
					int su=fis.read();
					if(su<0){break;}
					System.out.print((char)su);
				}
				
//				int su=fis.read();
//				System.out.println(su);
//				su=fis.read();
//				System.out.println(su);
//				su=fis.read();
//				System.out.println(su);
//				su=fis.read();
//				System.out.println(su);
//				su=fis.read();
//				System.out.println(su);
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}

}
