/*
�ѿ�3��
------------------------------------
�л������������α׷�(ver 0.0.2)
------------------------------------
1.�Է� 2.������� 0.����>1
1���л� ����>86
1���л� ����>74
1.�Է� 2.������� 0.����>1
2���л� ����>66
2���л� ����>74
1.�Է� 2.������� 0.����>1
3���л� ����>96
3���л� ����>94
1.�Է� 2.������� 0.����>1
1.�Է� 2.������� 0.����>1
1.�Է� 2.������� 0.����>2
���� ���: xxx
���� ���: xxx
1��: B����, 2��: C����, 3��: A����
*/

package com.bit.day07;

public class Ex07{

  public static void main(String[] args){
	int stu1kor=0,stu1math=0;
	int stu2kor=0,stu2math=0;
	int stu3kor=0,stu3math=0;

	System.out.println("------------------------------------"
	+"\n�л������������α׷�(ver 0.0.2)\n"
	+"------------------------------------");
	java.util.Scanner sc =new java.util.Scanner(System.in);
	int menu=0;	
	int cnt=0;
	while(true){
	System.out.print("1.�Է� 2.������� 0.����>");
	menu=sc.nextInt();
	//System.out.println("input:"+menu);
	if(menu==0){break;}
	if(menu==1){
		cnt++;
		if(cnt>3){continue;}
		if(cnt==1){
		  System.out.print(cnt+"���л� ����>");
		  stu1kor=sc.nextInt();
		  System.out.print(cnt+"���л� ����>");
		  stu1math=sc.nextInt();
		}else if(cnt==2){
		  System.out.print(cnt+"���л� ����>");
		  stu2kor=sc.nextInt();
		  System.out.print(cnt+"���л� ����>");
		  stu2math=sc.nextInt();
		}else if(cnt==3){
		  System.out.print(cnt+"���л� ����>");
		  stu3kor=sc.nextInt();
		  System.out.print(cnt+"���л� ����>");
		  stu3math=sc.nextInt();
		}
	}else if(menu==2){
		avg("����",stu1kor,stu2kor,stu3kor);
		avg("����",stu1math,stu2math,stu3math);
	}
	}
	
  }

  public static void avg(String msg,int a,int b,int c){
	System.out.print(msg+" ���: ");
	System.out.println((a+b+c)*100/3/100.0);
  }

}


















