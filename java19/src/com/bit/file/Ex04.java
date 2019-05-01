package com.bit.file;

import java.io.File;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// 임시파일
		File target =new File(".\\test\\abc01.txt");
		try {
			System.out.println(target.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
//			createTempFile(prefix,suffix);
//			prefix 파일명
//			suffix 확장자
			File root=new File(".\\test");
			File temp=File.createTempFile("aaa", "",root);
			System.out.println(temp.exists());
			System.out.println(temp.getParent());
			System.out.println(temp.getCanonicalPath());
			System.out.println(temp.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}













