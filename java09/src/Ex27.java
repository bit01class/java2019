// 메서드 명은 중복 불가
// 단, 아래의 경우는 이름중복가능 - 메서드 오버로드
// 매개변수의 유무
// 매개변수의 갯수
// 매개변수의 자료형

class Ex27{

  public static void main(String[] args){

	int a;
	a=100;
	System.out.println(10);
  }
  public static void func1(String msg){
	System.out.println(msg);
  }

  public static void func1(int a, int b){
	System.out.println(a+"+"+b+"="+(a+b));
  }

  public static void func1(){
	System.out.println("메서드 오버로드");
  }

  public static void func1(int a){
	///int a;
	a=1234;
	System.out.println("func1 a="+a);
  }

  

}