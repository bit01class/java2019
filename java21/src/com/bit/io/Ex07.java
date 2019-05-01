package com.bit.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/*
 *	�л��������� ���α׷�(ver 0.3.0)-DataStream 
 * 
 * ���α׷� �ε��� data.obj���Ͽ��� �о�鿩
 * ���� ����
 * ���α׷� ����� ����
 * 
 * */
public class Ex07 {

	public static void main(String[] args) {
		File file = new File(".\\files\\data.obj");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------");
		System.out.println("�л��������� ���α׷�(ver 0.3.0)-DataStream ");
		System.out.println("----------------------------------------");
		String input=null;
		
		InputStream is=System.in;
		InputStreamReader isr=null;
		BufferedReader br=null;

		InputStream fis=null;
		OutputStream fos=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		
		isr=new InputStreamReader(is);
		br=new BufferedReader(isr);
		
		
		int num=20190001;
		try {
			while(true){
				System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
					input=br.readLine();
				if("0".equals(input)){break;}
				if("2".equals(input)){
					List<Integer> list=new ArrayList<Integer>();
					try{
//						fis=new FileInputStream(file);
//						dis=new DataInputStream(fis);
//						while(true){
//							int su=dis.read();// 1byte
//							if(su==-1){break;}
//							list.add(su);
//							list.add(dis.readInt());//4byte-�й�
//							list.add(dis.readInt());//4byte-����
//							list.add(dis.readInt());//4byte-����
//							list.add(dis.readInt());//4byte-����
//						}
//
						fos=new FileOutputStream(file,true);
						dos=new DataOutputStream(fos);
//						for(int i=0; i<list.size(); i++){
//							if(i%5==0){
//								dos.write(i);
//							}else{
//								dos.writeInt(list.get(i));
//							}
//						}
//						dos.flush();
						dos.write(1);
						System.out.println(num);
						dos.writeInt(num++);
						System.out.print("����>");
						input=br.readLine();
						dos.writeInt(Integer.parseInt(input));
						System.out.print("����>");
						input=br.readLine();
						dos.writeInt(Integer.parseInt(input));
						System.out.print("����>");
						input=br.readLine();
						dos.writeInt(Integer.parseInt(input));
					}catch (IOException e) {
						e.printStackTrace();
					} finally{
						try {
							if(dis!=null){dis.close();}
							if(dos!=null){dos.close();}
							if(fis!=null){fis.close();}
							if(fos!=null){fos.close();}
						}catch (IOException e) {
								e.printStackTrace();
							}
					}

				}else if("1".equals(input)){
					System.out.println("-----------------------------------------");
					System.out.println("�й�\t����\t����\t����");
					System.out.println("-----------------------------------------");
					try{
						fis=new FileInputStream(file);
						dis=new DataInputStream(fis);
						while(true){
							int su=dis.read();
							if(su==-1){break;}
							int num1=dis.readInt();
							int kor1=dis.readInt();
							int eng1=dis.readInt();
							int math1=dis.readInt();
							System.out.println(num1+"\t"+kor1+"\t"+eng1+"\t"+math1);
						}
					}catch (IOException e) {
						e.printStackTrace();
					} finally{
						try {
							if(dis!=null){dis.close();}
							if(fis!=null){fis.close();}
						}catch (IOException e) {
								e.printStackTrace();
							}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){br.close();}
				if(isr!=null){isr.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}





















