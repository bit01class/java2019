package com.bit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05 {

	public static void main(String[] args) {
		File file = new File("files\\data1.bin");
		//"r", "rw", "rws", or "rwd"
		String mode="rw";
		byte[] buf=new byte[8];
		
		RandomAccessFile raf=null;
		
		try {
			raf=new RandomAccessFile(file, mode);
			raf.write("12345".getBytes());
			raf.seek(0);
//			raf.write("abcdefghijklmnopqrstuvwxyz".getBytes());
//			raf.seek(0);
//			raf.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes());
//			raf.seek(0);
			
			while(true){
				int su=raf.read(buf);
				if(su==-1){break;}
				System.out.println(new String(buf,0,su));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(raf!=null){raf.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
