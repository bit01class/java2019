package com.bit.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex01 {

	public static void main(String[] args) {
		File file =new File(".\\files");
		file.mkdir();
		file=new File(".\\files\\ex01.bin");
		OutputStream fos=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		try {
			if(file.createNewFile()){
				System.out.println("������ ����ϴ�");
			}else{
				System.out.println("������ �����մϴ�");
			}
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			ps=new PrintStream(bos,true);
//			fos.write("������ �����߽��ϴ�".getBytes());
//			fos.flush();
//			bos.write("���۸� ����ؼ� �ۼ�".getBytes());
//			bos.write("\r\n".getBytes());//window��
//			bos.write("\n".getBytes());	// �׿�
//			bos.flush();
//			bos.write("�׷��� �� �����ϴ�!#$%".getBytes());
//			bos.flush();
			
			ps.println("����Ʈ��Ʈ��");
			ps.print("�����ͽ�Ʈ���� ����ϰ� �Ǹ�");
			ps.println("�̷��� ��µ˴ϴ�");
			ps.println(1234);
			
			System.out.println("�ۼ��� �������ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(ps!=null){ps.close();}
				if(bos!=null){bos.close();}
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
