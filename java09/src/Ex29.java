/*
--------------------------------
계산기 (ver 0.0.1)
--------------------------------
첫번째 숫자>5
두번째 숫자>3
+(1),-(2),x(3),/(4)>1
결과) 5+3=8
계속(1),종료(0)>0
이용해주셔서 감사합니다.
*/

class Ex29{

  public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int su1,su2,su3;
	boolean result=true;
	int temp=0;
	char ch='+';
	while(result){
		System.out.print("첫번째 숫자>");
		su1=sc.nextInt();
		System.out.print("두번째 숫자>");
		su2=sc.nextInt();
		su3=input(1,4,"+(1),-(2),x(3),/(4)>");

		if(su3==1){
			temp=plus(su1,su2);	// 연산기능
			ch='+';			// 포맷출력
			myPrint(su1,su2,ch,temp);
		}else if(su3==2){
			temp=minus(su1,su2);	// func2(su1,su2,su3);
			ch='-';
			myPrint(su1,su2,ch,temp);
		}else if(su3==3){
			temp=multi(su1,su2);
			ch='x';
			myPrint(su1,su2,ch,temp);
		}else if(su3==4){
			// %==0
			ch='÷';
			if(su1%su2==0){
			temp=div(su1,su2);
			myPrint(su1,su2,ch,temp);
			}else{
			double temp2=div(su1,su2*1.0);
			myPrint(su1,su2,ch,temp2);
			}

		}
		int su4=input(0,1,"계속(1),종료(0)>");
		if(su4==0){result=false;}
	}
	System.out.println("이용해주셔서 감사합니다.");
  }

	// 포맷(결과) 5+3=8)출력해주는 기능
  public static void myPrint(int su1, int su2, char ch,int result){
	System.out.println("결과:"+su1+ch+su2+"="+result);
  }
  public static void myPrint(int su1, int su2, char ch,double result){
	System.out.println("결과:"+su1+ch+su2+"="+result);
  }

	// 연산기능
  public static int func2(int su1, int su2, int su3){
	int num=0;
	if(su3==1){
		num=su1+su2;
	}else if(su3==2){
		num=su1-su2;
	}else if(su3==3){
		num=su1*su2;
	}else if(su3==4){
		num=su1/su2;
	}
	return num;
  }
  
  public static int plus(int su1, int su2){
	int su=su1+su2;
	return su;
  }

  public static int minus(int su1, int su2){
	return su1-su2;
  }

  public static int multi(int su1, int su2){
	return su1*su2;
  }

  public static int div(int su1, int su2){
	if(su2==0){
		return 0;
	}
	return su1/su2;
  }
  public static double div(int su1, double su2){
	if(su2==0.0){
		return 0.0;
	}
	return su1/su2;
  }

  public static int input(int start,int end,String msg){
	// 0<= <=1
	// 1,2,3,4  1<=  <=4
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int su=0;
	boolean boo=true;
	while(boo){
		System.out.print(msg);
		su=sc.nextInt();
		if(su>=start && su<=end){boo=false;}
	}
	return su;
  }


}














