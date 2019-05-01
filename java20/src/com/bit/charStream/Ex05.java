package com.bit.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ex05 {

	public static void main(String[] args) {
		File file =new File("files\\ch05.txt");
		OutputStream os=null;
		
		OutputStreamWriter osw=null;
		PrintWriter pw=null;
		try {
			os=new FileOutputStream(file);
			
			osw=new OutputStreamWriter(os);
			pw=new PrintWriter(osw,true);
			
			pw.println("한줄쓰고");
			pw.println("또한줄 쓰고");
			pw.print("마지막으로 한번 더 쓰고");
			pw.println("끝냅니다");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw!=null){pw.close();}
				if(osw!=null){osw.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









