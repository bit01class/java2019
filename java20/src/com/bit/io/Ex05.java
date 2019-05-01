package com.bit.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) {
		File file = new File("files\\ex01.bin");
		File file2= new File("files\\ex05.txt");
		byte[] buf=new byte[8];
		InputStream is=null;
		ByteArrayOutputStream baos=null;
		OutputStream os=null;
		ByteArrayInputStream bais=null;
		try {
			if(file.exists()){
				is=new FileInputStream(file);
				baos=new ByteArrayOutputStream();
				while(true){
					int su=is.read(buf);
					if(su==-1){break;}
					baos.write(buf, 0, su);
				}
			}
			byte[] arr = baos.toByteArray();
			System.out.println(new String(arr));
			System.out.println("데이터의 크기:"+arr.length+"byte");
			
			///////////// copy //////////////
			
			os=new FileOutputStream(file2);
			bais=new ByteArrayInputStream(arr);
			
			while(true){
				int su=bais.read(buf);
				if(su==-1){break;}
				os.write(buf,0,su);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bais!=null){bais.close();}
				if(baos!=null){baos.close();}
				if(os!=null){os.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





























