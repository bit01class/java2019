package com.bit.charStream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex07 {

	public static void main(String[] args) {
		PrintStream myOut = System.out;
		myOut.println("���");
		myOut.write(65);
		myOut.flush();
		OutputStreamWriter osw=null;
		PrintWriter pw=null;
		try {
			osw=new OutputStreamWriter(myOut);
			pw=new PrintWriter(osw,true);
			osw.write("���2");
			osw.flush();
			pw.println("���3");
			pw.println("���4");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









