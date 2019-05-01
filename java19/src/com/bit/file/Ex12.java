package com.bit.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12 {

	public static void main(String[] args) {
		String data="";
		File file=new File("backup");
		file.mkdir();
		file=new File("backup\\data.txt");
		byte[] buff =new byte[512];
//		FileInputStream fis=null;
//		try {
//			file.createNewFile();
//			fis=new FileInputStream(file);
//			while(true){
//				int su=fis.read(buff);
//				if(su==-1){break;}
//				data+=new String(buff,0,su);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally{
//			try {
//				if(fis!=null){fis.close();}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println(data);
		System.out.println("-------------------------------------");
		System.out.println("己利包府 橇肺弊伐(ver 0.3.0) ");
		System.out.println("-------------------------------------");
		
		int num=201901;
		int kor=11;
		int eng=21;
		int math=31;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		num=201902;
		kor=12;
		eng=22;
		math=32;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		num=201903;
		kor=13;
		eng=23;
		math=33;
		if(!data.isEmpty()){data+="\n";}
		data+=num+","+kor+","+eng+","+math;
		System.out.println(data);
		
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(file);
			fos.write(data.getBytes());
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

















