package com.bit.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		File file =new File("files\\ex01.bin");
		InputStream is=null;
		BufferedInputStream bis=null;
		
		List<Byte> list=new ArrayList<Byte>();
		
		
		if(file.exists()){
			try {
				is=new FileInputStream(file);
				bis=new BufferedInputStream(is);
				byte[] buf=new byte[8];
				
				while(true){
//					int su=is.read();// EOF(end of file)==-1
//					if(su==-1){break;}
//					list.add((byte)su);
					int su=bis.read(buf);
					if(su==-1){break;}
					for(int i=0; i<su; i++){
						list.add(buf[i]);
					}
				}
				Object[] arr = list.toArray();
				byte[] arr2=new byte[arr.length];
				for(int i=0; i<arr2.length; i++){
					arr2[i]=(Byte)arr[i];
				}
				String msg=new String(arr2);
				System.out.println(msg);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally{
				try {
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("파일이 존재하지 않습니다");
		}
		

	}

}
