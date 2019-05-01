package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 *	학생성적관리 프로그램(ver 0.3.0) 
 * 
 * 프로그램 로딩시 data.obj파일에서 읽어들여
 * 값이 누적
 * 프로그램 종료시 저장
 * 
 * 
 * 
 * 
 */


public class Ex11 {

	public static void main(String[] args) {
		ArrayList<byte[]> list=new ArrayList<byte[]>();
		File file=new File(".\\backup");
		file.mkdir();
		file=new File(".\\backup\\data.obj");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis=null;
		byte[] buff=new byte[4];
		try {
			fis=new FileInputStream(file);
			while(true){
				int su=fis.read(buff);
				if(su==-1){break;}
				//System.arraycopy(buff, 0, obj, 0, 4);
				byte[] obj=Arrays.copyOf(buff, 4);
				list.add(obj);
				System.out.println(Arrays.toString(buff));
			}
			System.out.println("--------------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
				try {
					if(fis!=null){
						fis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		for(int i=0; i<list.size(); i++){
			byte[] temp=list.get(i);
			System.out.println(Arrays.toString(temp));
		}
		System.out.println("-------------------------------------");
		System.out.println("생성적관리 프로그램(ver 0.3.0) ");
		System.out.println("-------------------------------------");
		
		
//		byte[] stu=new byte[]{1,90,80,70};
//		list.add(stu);
//		stu=new byte[]{2,91,81,71};
//		list.add(stu);
//		stu=new byte[]{3,92,82,72};
//		list.add(stu);
//		FileOutputStream fos=null;
//		
//		for(int i=0; i<list.size(); i++){
//			System.out.println(Arrays.toString(list.get(i)));
//		}
//		
//		try {
//			fos=new FileOutputStream(file);
//			for(int i=0; i<list.size(); i++){
//				byte[] test = list.get(i);
//				fos.write(test);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//				try {
//					if(fos!=null){
//						fos.close();
//					}
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//		}
	}
	

}















