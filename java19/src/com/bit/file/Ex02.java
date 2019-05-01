package com.bit.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


//경로입력> C:\\java\\workspace\\java19
//
// C:\java\workspace\java19 디렉터리
//
//2019-04-22  오전 10:00    <DIR>          .
//2019-04-22  오전 10:00    <DIR>          ..
//2019-04-22  오전 09:39               232 .classpath
//2019-04-22  오전 09:39               382 .project
//2019-04-22  오전 09:39    <DIR>          bin
//2019-04-22  오전 09:39    <DIR>          src
//2019-04-22  오전 10:00    <DIR>          test
//               2개 파일                 614 바이트
//               5개 디렉터리



public class Ex02 {

	public static void main(String[] args) {
		String input="C:\\java\\workspace\\java19";
		File file=new File(input);
		if(file.exists()){
			if(file.isDirectory()){
				String[] item=file.list();
				for(int i=0; i<item.length; i++){
					String target=item[i];
					File temp=new File(target);
					long time = temp.lastModified();
					Date date=new Date(time);
					SimpleDateFormat sdf=null;
					sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
					System.out.print(sdf.format(date)+"\t");
					if(temp.isFile()){
						System.out.print("\t"+temp.length());
					}else{
						System.out.print("<DIR>\t");
					}
					System.out.println("\t"+temp.getName());
				}
			}else{
				Date date=new Date(file.lastModified());
				SimpleDateFormat sdf=null;
				sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm");
				System.out.print(sdf.format(date)+"\t");
				System.out.print("\t"+file.length());
				System.out.println(file.getName());
			}
		}else{
			System.out.println("경로를 다시 확인해주세요");
		}

	}

}






















