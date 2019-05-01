class Ex32{

  public static void main(String[] args){

	func();
	System.out.println("이용해주셔서 감사합니다");

  }

  public static void func(){
	
	java.util.Scanner sc=new java.util.Scanner(System.in);
	
	while(true){
		System.out.print("1.return 2.break 3.exit");
		int su=sc.nextInt();
		if(su==1){
			return;
		}else if(su==2){
			break;
		}else if(su==3){
			System.exit(0);
		}
	}
	System.out.println("func end");
  }
}







