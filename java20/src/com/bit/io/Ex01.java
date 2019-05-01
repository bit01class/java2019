package com.bit.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex01 {

	public static void main(String[] args) {
		File file =new File(".\\files");
		file.mkdir();
		file=new File(".\\files\\ex01.bin");
		OutputStream fos=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		try {
			if(file.createNewFile()){
				System.out.println("파일을 만듭니다");
			}else{
				System.out.println("파일이 존재합니다");
			}
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			ps=new PrintStream(bos,true);
//			fos.write("내용을 수정했습니다".getBytes());
//			fos.flush();
//			bos.write("버퍼를 사용해서 작성".getBytes());
//			bos.write("\r\n".getBytes());//window용
//			bos.write("\n".getBytes());	// 그외
//			bos.flush();
//			bos.write("그래서 참 빠릅니다!#$%".getBytes());
//			bos.flush();
			
			ps.println("프린트스트림");
			ps.print("프린터스트림을 사용하게 되면");
			ps.println("이렇게 출력됩니다");
			ps.println(1234);
			
			System.out.println("작성이 끝났습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ps!=null){ps.close();}
				if(bos!=null){bos.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
