/*
메서드
 - 코드의 재사용성
 - 호출 받으면 해당 메서드로 가서 실행하고 끝나면 
   호출한 쪽으로 다시 돌아감
 - 메서드의 이름은 중복불가
 - 메서드의 명은 영문자,숫자만 
   첫글자는 영소만 가능
 - 메서드의 호출 : 메서드명(파라미터)
 - 매개변수,인자, 파라미터 : 호출측과 받는 측이 동일한 자료형
	public static void 메서드명(매개변수){
		실행문;
	}
*/

class Ex26{
	// 클래스의 구성요소 
	// 1.메서드

   public static void main(String[] args){
	System.out.println("메인 시작");
	int a;
	a=100;
	System.out.println("a="+a);
	func2();
	System.out.println("메인 끝");
   }	// main end

   public static int func4(){
	System.out.println("2+3을 전달하겠습니다");
	int x=2;
	int y=3;
	int z=x+y;
	return z;
   }

   public static void func3(int num1, double num2,String msg){
	System.out.println("num1="+num1+",num2="+num2);
	System.out.println(msg);
   }

 
   public static void func1(){
	System.out.println("새로운 기능1시작");
	func2();
	System.out.println("새로운 기능1끝");
   }	// func1 end

 
   public static void func2(){
	System.out.println("새로운 기능2");
	int i=1;
	return;
   }	// func2 end

}	// class end














