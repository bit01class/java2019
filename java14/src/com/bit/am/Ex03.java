package com.bit.am;

public class Ex03 {

	public static void main(String[] args) {
		String data="1901|90|80|70";
		data+="\n1902|91|81|71";
		data+="\n1903|92|82|72";
		data+="\n1904|93|83|73";
		data+="\n1905|94|84|74";
//		-----------------------------------
//		�л��������� ���α׷�(ver 0.1.1)
//		-----------------------------------
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("�л��������� ���α׷�(ver 0.1.2)");
		System.out.println("-----------------------------------");
		
		int input=0;
		int idx=data.lastIndexOf("\n");
		int end=data.indexOf("|", idx+1);
		String msg=data.substring(idx+1,end);
		int num=Integer.parseInt(msg);
		
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			input=sc.nextInt();
			if(input==0){break;}
			if(input==1){
				System.out.println("--------------------------------------");
				System.out.println("�й�\t|����\t|����\t|����\t");
				System.out.println("--------------------------------------");
				String table=data.replaceAll("\\|", "\t\\|");
				System.out.println(table);
				System.out.println("--------------------------------------");
			}else if(input==2){
				num++;
				System.out.print(num+"�й� ����>");
				int kor=sc.nextInt();
				System.out.print(num+"�й� ����>");
				int eng=sc.nextInt();
				System.out.print(num+"�й� ����>");
				int math=sc.nextInt();
				data+="\n";
				data+=num;
				data+="|";
				data+=kor;
				data+="|";
				data+=eng;
				data+="|";
				data+=math;
			}else if(input==3){
				System.out.print("�й�>");
				int target=sc.nextInt();
				int idx2=data.indexOf(target+"");
				int end2=data.indexOf("\n", idx2);
				if(end2==-1){end2=data.length();}
				String old=data.substring(idx2,end2);
				
				System.out.print(target+"�� ����>");
				int kor=sc.nextInt();
				System.out.print(target+"�� ����>");
				int eng=sc.nextInt();
				System.out.print(target+"�� ����>");
				int math=sc.nextInt();
				String temp=target+"|"+kor+"|"+eng+"|"+math;
				data=data.replace(old, temp);
			}else if(input==4){
				System.out.print("�й�>");
				int target=sc.nextInt();
				int idx2=data.indexOf(target+"");
				int end2=data.indexOf("\n", idx2);
				if(end2==-1){end2=data.length();}
				String old=data.substring(idx2,end2);
				
				data=data.replace(old+"\n", "");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�......");
	}

}

















