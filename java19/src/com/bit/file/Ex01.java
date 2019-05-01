package com.bit.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
//		String filepath="C:\\java\\io\\directory";
//		String filepath="C:\\java\\io\\testfile1.txt";
//		String filepath="C:\\java\\workspace\\java19\\test\\target1.txt";
//		절대경로
//		상대경로
//		. 현재디렉토리
//		.. 상위디렉토리
//		String filepath=".\\test\\target1.txt";
//		String filepath=".\\..\\..\\io\\testfile1.txt";
		String filepath=".";
		java.io.File file1=new File(filepath);
		
		System.out.println("파일유무:"+file1.exists());
		System.out.println("디렉토리인지:"+file1.isDirectory());
		System.out.println("파일인지:"+file1.isFile());
		
		System.out.println("경로:"+file1.getPath());
		System.out.println("절대경로(1):"+file1.getAbsolutePath());
		try {
			System.out.println("절대경로(2):"+file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일네임:"+file1.getName());
		System.out.println("r권한:"+file1.canRead());
		System.out.println("w권한:"+file1.canWrite());
		System.out.println("x권한:"+file1.canExecute());
		long time1=file1.lastModified();
		Date date=new Date(time1);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println("파일의 크기:"+file1.length()+"byte");
		String[] flist = file1.list();
		for(int i=0; i<flist.length; i++){
			System.out.println(flist[i]);
		}
	}

}














