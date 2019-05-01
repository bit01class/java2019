package com.bit.charStream;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {

	public static void main(String[] args) {
		File file =new File("files\\ch01.txt");
		File file2=new File("files\\ch03.txt");
		
		Reader fr=null;
		Writer fw=null;
		
		CharArrayWriter caw=null;
		CharArrayReader car=null;
		char[] cbuf=new char[8];
		try {
			fr=new FileReader(file);
			caw=new CharArrayWriter();
			while(true){
				int su=fr.read(cbuf);
				if(su==-1){break;}
				caw.write(cbuf, 0, su);
			}
			char[] arr = caw.toCharArray();
			System.out.println(new String(arr));
			
			fw=new FileWriter(file2);
			car=new CharArrayReader(arr);
			while(true){
				int su=car.read(cbuf);
				if(su==-1){break;}
				fw.write(cbuf, 0, su);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(car!=null){car.close();}
				if(caw!=null){caw.close();}
				if(fw!=null){fw.close();}
				if(fr!=null){fr.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}










