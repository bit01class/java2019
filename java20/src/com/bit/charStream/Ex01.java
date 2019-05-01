package com.bit.charStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) {
		File file=new File("files\\ch01.txt");
		Writer fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		String msg="버퍼를 이용한 문자열 입력";
		char[] source=msg.toCharArray();
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw,true);
			
			pw.println("첫번째");
			pw.println("두번째");
			pw.println("세번째");
			pw.println("네번째");
			pw.println("다섯번째");
			pw.println("여섯번째");
//			pw.flush();
			
//			bw.write("1째");
//			bw.newLine();
//			bw.write("2째");
//			bw.newLine();
//			bw.write("3째");
//			bw.newLine();
//			bw.write("4째");
//			bw.newLine();
//			bw.write("5째");
//			bw.newLine();
//			bw.write("6째");
//			fw.write(source);
//			for(int i=0; i<source.length; i++){
//				fw.write(source[i]);
//			}
//			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null){bw.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
















