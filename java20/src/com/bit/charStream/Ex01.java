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
		String msg="���۸� �̿��� ���ڿ� �Է�";
		char[] source=msg.toCharArray();
		try {
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw,true);
			
			pw.println("ù��°");
			pw.println("�ι�°");
			pw.println("����°");
			pw.println("�׹�°");
			pw.println("�ټ���°");
			pw.println("������°");
//			pw.flush();
			
//			bw.write("1°");
//			bw.newLine();
//			bw.write("2°");
//			bw.newLine();
//			bw.write("3°");
//			bw.newLine();
//			bw.write("4°");
//			bw.newLine();
//			bw.write("5°");
//			bw.newLine();
//			bw.write("6°");
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
















