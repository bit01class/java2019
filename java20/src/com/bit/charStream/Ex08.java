package com.bit.charStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) {
		InputStream myIn = System.in;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			isr=new InputStreamReader(myIn);
			br=new BufferedReader(isr);
			String msg=br.readLine();
			System.out.println(">>>"+msg);
			msg=br.readLine();
			System.out.println(">>>"+msg);
			msg=br.readLine();
			System.out.println(">>>"+msg);
			msg=br.readLine();
			System.out.println(">>>"+msg);
//			int su1=myIn.read();
//			System.out.println(">>>>>"+su1);
//			int su2=myIn.read();
//			System.out.println(">>>>>"+su2);
//			int su3=myIn.read();
//			System.out.println(">>>>>"+su3);
//			int su4=myIn.read();
//			System.out.println(">>>>>"+su4);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
