class Ex31{

  public static void main(String[] args){
	// return // 메서드의 종료
	// break, continue
	java.util.Scanner sc=new java.util.Scanner(System.in);
	while(true){
	System.out.print("종료하시려면 0 아니면 계속:");
	int su=sc.nextInt();
		if(su==0){
			//return;
			//break;
			System.exit(0);
		}
	}
	//System.out.println("이용해주셔서 감사합니다");
  }

  public static void func1(){
	for(int i=0; i<5; i++){
		if(i>=3){
			//break;
			//continue;
			return;
		}
		System.out.println("i="+i);
	}
  }  

}