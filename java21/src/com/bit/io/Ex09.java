package com.bit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable{
	int num;
	int kor;
	int eng;
	int math;
}

public class Ex09 {

	public static void main(String[] args) {
		List<Student> list=null;
		File file = new File(".\\files\\obj.bin");
		
		InputStream is=null;
		ObjectInputStream ois=null;
		int num=1;
		
		try{
			file.createNewFile();
			is=new FileInputStream(file);
			ois=new ObjectInputStream(is);
			
			list=(List<Student>) ois.readObject();
			num=list.get(list.size()-1).num+1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			if(list==null){list=new ArrayList<Student>();}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e){
			num=1;
		} finally{
			try {
				if(ois!=null){ois.close();}
				if(is!=null){is.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // io read end
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("학생성적관리 프로그램(ver 0.3.0)-DataStream ");
		System.out.println("----------------------------------------");
		String input=null;
		while(true){
			System.out.print("1.보기 2.입력 0.종료>");
			input=sc.nextLine();
			if("0".equals(input)){break;}
			if("2".equals(input)){
				Student stu=new Student();
				stu.num=num++;
				System.out.print("국어>");
				input=sc.nextLine();
				stu.kor=Integer.parseInt(input);
				System.out.print("영어>");
				input=sc.nextLine();
				stu.eng=Integer.parseInt(input);
				System.out.print("수학>");
				input=sc.nextLine();
				stu.math=Integer.parseInt(input);
				list.add(stu);
			}else if("1".equals(input)){
				System.out.println("-----------------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-----------------------------------------");
				for(int i=0; i<list.size(); i++){
					Student stu = list.get(i);
					System.out.println(stu.num+"\t"+stu.kor
							+"\t"+stu.eng+"\t"+stu.math);
				}
			}
		}//while end
		//save();
		OutputStream os=null;
		ObjectOutputStream oos=null;
		
		try {
			os=new FileOutputStream(file);
			oos=new ObjectOutputStream(os);
			
			oos.writeObject(list);
			
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
		
		
		
		System.out.println("이용해주셔서 감사합니다");
	}// main end

}// class end

























