/*
가위,바위,보 게임
ex)
-----------------------------
가위,바위,보 게임
-----------------------------
가위(1),바위(2),보(3),종료(0)>1
COM : 바위
YOU : 가위
결과 : 졌습니다
가위(1),바위(2),보(3),종료(0)>2
COM : 가위
YOU : 바위
결과 : 이겼습니다
가위(1),바위(2),보(3),종료(0)>2
COM : 바위
YOU : 바위
결과 : 비겼습니다
가위(1),바위(2),보(3),종료(0)>0
이용해주셔서 감사합니다.

*/

class Ex25{

  public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("-----------------------------\n가위,바위,보 게임\n-----------------------------");
	while(true){
	System.out.print("가위(1),바위(2),보(3),종료(0)>");
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
			System.out.println("결과 : 비겼음");
	}else if(you==1&&com==2||you==2&&com==3||you==3&&com==1){
			System.out.println("결과 : 졌음");
	}else if(you==3&&com==2||you==1&&com==3||you==2&&com==1){
			System.out.println("결과 : 이겼음");
	}
	}//while end
	System.out.println("이용해주셔서 감사합니다.");
  }//main end

  public static void func(int su,String name){
	if(su==1){
		System.out.println(name+":가위");
	}else if(su==2){
		System.out.println(name+":바위");
	}else if(su==3){
		System.out.println(name+":보");
	}
  }


}//class end























