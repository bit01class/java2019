package com.bit.day12;

public class Ex06 {

	public static void main(String[] args) {
		int[][] data={
				{0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}
		};
		String title="---------------------------------------";
		title += "\n�л������������α׷�(ver 0.1.0)";
		title += "\n---------------------------------------";
		String tableHeader="------------------------------------------";
		tableHeader+="\n�й�|����|����|����|�հ�|���";
		tableHeader+="\n------------------------------------------";		
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(title);
		int input=0;
		String msg=null;
		int index=0;
		while(true){
			System.out.print("1.���� 2.�Է� 0.����>");
			msg=sc.nextLine();
			/////validate//////
			boolean check=false;
			for(int i=0; i<msg.length(); i++){
				char ch=msg.charAt(i);
				if(!Character.isDigit(ch)){
					check=true;
				}
			}
			if(check){
				System.out.println("�Է��� �߸��ϼ̽��ϴ� �ٽ��ѹ�...");
				continue;
				}
			input=Integer.parseInt(msg);
			
			if(input==0){break;}
			if(input==1){
				System.out.println(tableHeader);
				for(int i=0; i<data.length; i++){
					int[] stu=data[i];
					System.out.println(
							i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2]
									);
				}
			}else if(input==2){
				if(index<5){
					int kor=0;
					while(true){
						System.out.print(index+1+"�� ����>");
						msg=sc.nextLine();
						// ���ڰ� �ƴ� ���� �Է����� ���
						boolean boo1=false;
						for(int i=0; i<msg.length(); i++){
							if(!Character.isDigit(msg.charAt(i))){
								boo1=true;
							}
						}
						if(boo1){continue;}
						kor=Integer.parseInt(msg);
						if(0<=kor &&kor <=100){break;}
					}
					
					
//					System.out.print(index+1+"�� ����>");
//					msg=sc.nextLine();
//					int eng=Integer.parseInt(msg);
					int eng=inputFunc(sc,index+1+"�� ����>");
					
//					System.out.print(index+1+"�� ����>");
//					msg=sc.nextLine();
//					int math=Integer.parseInt(msg);
					int math=inputFunc(sc,index+1+"�� ����>");
					
					int[] stu=data[index];
					stu[0]=kor;
					stu[1]=eng;
					stu[2]=math;
					index++;
				}else{
					System.out.println("���̻� �Է��Ͻ� �л��� �����ϴ�");
				}
			}else{
				System.out.println("�Է��� �߸��ϼ̽��ϴ� �ٽ��ѹ�...");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
	
	public static int inputFunc(java.util.Scanner sc,String msg){
		int su=0;
		while(true){
			System.out.print(msg);
			String msg1=sc.nextLine();
			// ���ڰ� �ƴ� ���� �Է����� ���
			boolean boo1=false;
			for(int i=0; i<msg1.length(); i++){
				if(!Character.isDigit(msg1.charAt(i))){
					boo1=true;
				}
			}
			if(boo1){continue;}
			su=Integer.parseInt(msg1);
			if(0<=su &&su <=100){break;}
		}
		
		return su;
	}

}
























