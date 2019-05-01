class Ex23{

  public static void main(String[] args){
	// 입력받을 준비
	java.util.Scanner sc = new java.util.Scanner(System.in);
	// 입력 받음(숫자만)
	System.out.print("첫번째 숫자입력>");
	int su1= sc.nextInt();
	System.out.print("두번째 숫자입력>");
	int su2= sc.nextInt();
	System.out.println("su1="+su1);
	System.out.println("su2="+su2);
	System.out.println("su1+su2="+(su1+su2));
  }

}