package com.bit.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {
		File file = new File("files\\data.bin");
		File dir=new File(file.getParent());
		if(dir.mkdir()){
			System.out.println("경로를 생성했습니다");
		}
		
		try {
			if(file.createNewFile()){
				System.out.println("data.bin생성");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			oos.writeInt(12345);
			
			oos.writeDouble(3.14);
			
			oos.writeBoolean(false);
			
			oos.writeUTF("문자열을 작성");
			
			Vector vec1=new Vector();
			vec1.addElement(1234);
			vec1.addElement(3.14);
			vec1.addElement(true);
			vec1.addElement("벡터내의 문자열");
			oos.writeObject(vec1);
			
			Vector<String> vec2=new Vector<String>();
			vec2.addElement("item1");
			vec2.addElement("item2");
			vec2.addElement("item3");
			vec2.addElement("item4");
			
			Vector vec3=new Vector();
			vec3.addElement(vec2);
			
			oos.writeObject(vec3);
			
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null){oos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작성완료");
	}

}

















