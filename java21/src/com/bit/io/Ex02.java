package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Ex02 {

	public static void main(String[] args) {
		File file =new File("files\\data.bin");
		InputStream is=null;
		ObjectInputStream ois=null;
		if(file.exists()){
			try {
				is=new FileInputStream(file);
				ois=new ObjectInputStream(is);
				
				//읽기
				int su1=ois.readInt();
				double su2=ois.readDouble();
				boolean boo=ois.readBoolean();
				String msg=ois.readUTF();
				Object obj=ois.readObject();
				Object obj2=ois.readObject();
				
				
				//출력
				System.out.println("int:"+su1);
				System.out.println("double:"+su2);
				System.out.println("boolean:"+boo);
				System.out.println("String:"+msg);
				Vector vec=(Vector)obj;
				Vector vec2=(Vector) obj2;
				Vector<String> vec3 = (Vector<String>) vec2.get(0);
				
				Enumeration eles = vec.elements();
				while(eles.hasMoreElements()){
					System.out.println(eles.nextElement());
				}
				System.out.println("------------");
				Enumeration<String> eles2=vec3.elements();
				while(eles2.hasMoreElements()){
					System.out.println(eles2.nextElement());
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if(ois!=null){ois.close();}
					if(is!=null){is.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}















