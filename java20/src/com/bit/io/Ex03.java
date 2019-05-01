package com.bit.io;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) {
		File file=new File("files");
		file.mkdir();
		file=new File("files\\data.bin");
		OutputStream os=null;
		DataOutputStream dos=null;

		try {
			file.createNewFile();
			os=new FileOutputStream(file);
			dos=new DataOutputStream(os);

			dos.write(65);
			dos.writeByte(97);
			dos.writeInt(1234);
			dos.writeLong(123456789L);
			dos.writeFloat(3.14f);
			dos.writeDouble(3.14);
			dos.writeChar('가');
			dos.writeBoolean(false);
			dos.writeUTF("문자열데이터도 보냅니다");
			dos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null){dos.close();}
				if(os!=null){os.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작성완료");
	}

}


















