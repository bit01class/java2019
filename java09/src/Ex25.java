/*
����,����,�� ����
ex)
-----------------------------
����,����,�� ����
-----------------------------
����(1),����(2),��(3),����(0)>1
COM : ����
YOU : ����
��� : �����ϴ�
����(1),����(2),��(3),����(0)>2
COM : ����
YOU : ����
��� : �̰���ϴ�
����(1),����(2),��(3),����(0)>2
COM : ����
YOU : ����
��� : �����ϴ�
����(1),����(2),��(3),����(0)>0
�̿����ּż� �����մϴ�.

*/

class Ex25{

  public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("-----------------------------\n����,����,�� ����\n-----------------------------");
	while(true){
	System.out.print("����(1),����(2),��(3),����(0)>");
	int you=sc.nextInt();
	if(you==0){break;}else if(you>3 || you<0){
		continue;
	}
	// 1~3
	// 0.0~ 0.9 -> 0~9
	int com=0;
	while(true){
		com=(int)(Math.random()*10);
		if(com>0 && com<4){
			break;
		}
	}

	func(you,"you");
	func(com,"com");

	if(you==1&&com==1||you==2&&com==2||you==3&&com==3){
			System.out.println("��� : �����");
	}else if(you==1&&com==2||you==2&&com==3||you==3&&com==1){
			System.out.println("��� : ����");
	}else if(you==3&&com==2||you==1&&com==3||you==2&&com==1){
			System.out.println("��� : �̰���");
	}
	}//while end
	System.out.println("�̿����ּż� �����մϴ�.");
  }//main end

  public static void func(int su,String name){
	if(su==1){
		System.out.println(name+":����");
	}else if(su==2){
		System.out.println(name+":����");
	}else if(su==3){
		System.out.println(name+":��");
	}
  }


}//class end























