package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StreamTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		File file = new File("files\\ex06.txt");
//		Reader fr=null;
		InputStream is=null;
		StreamTokenizer stoken=null;
		
		try {
//			fr=new FileReader(file);
			is=new FileInputStream(file);
			stoken=new StreamTokenizer(is);
			while(true){
				int su=stoken.nextToken();
				if(su==StreamTokenizer.TT_EOF){break;}
				
				switch (stoken.ttype) {
				case StreamTokenizer.TT_WORD:
					System.out.println(stoken.sval);
					break;
				case StreamTokenizer.TT_NUMBER:
					System.out.println(stoken.nval);
					break;

				default:
					System.out.println((char)stoken.ttype);
					break;
				}
				
				
//				if(stoken.ttype==StreamTokenizer.TT_WORD){
//					System.out.println(stoken.sval);
//				}else if(stoken.ttype==StreamTokenizer.TT_NUMBER){
//					System.out.println(stoken.nval);
//				}else{
//					System.out.println((char)stoken.ttype);
//				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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





















