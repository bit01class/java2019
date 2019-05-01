package com.bit.charStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("files\\ch03.txt");
		InputStream is=null;
		java.util.Scanner sc=null;
		
		try {
			is=new FileInputStream(file);
			sc=new Scanner(System.in);
			System.out.println(sc.hasNextBoolean());
			System.out.println(sc.hasNextInt());
			System.out.println(sc.hasNextByte());
			System.out.println(sc.hasNextDouble());
			System.out.println(sc.hasNext());
			System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
