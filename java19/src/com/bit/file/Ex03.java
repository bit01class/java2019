package com.bit.file;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
//		String input=".\\test\\temp01.txt";
//		File file =new File(input);
//		try {
//			System.out.println("���ϻ���:"+file.createNewFile());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		String path=".\\test03\\test";
//		File file2=new File(path);
////		System.out.println("���丮����:"+file2.mkdir());
//		System.out.println("���丮����:"+file2.mkdirs());
		
//		String path="C:\\java\\workspace\\java19";
//		String path=".\\test\\temp01.txt";
//		File file3=new File(path);
//		System.out.println(file3.getParent());
		
		// temp01.txt -> abc01.txt
//		File file4=new File(".\\test");
//		System.out.println(file4.exists());
//		System.out.println(file4.isDirectory());
//		File dest=new File(".\\test01");
//		boolean result=file4.renameTo(dest);
//		System.out.println("�����̸�����:"+result);
		
		File file5=new File(".\\test\\abc01.txt");
		System.out.println(file5.delete());
		
		
	}

}














