class Ex31{

  public static void main(String[] args){
	// return // �޼����� ����
	// break, continue
	java.util.Scanner sc=new java.util.Scanner(System.in);
	while(true){
	System.out.print("�����Ͻ÷��� 0 �ƴϸ� ���:");
	int su=sc.nextInt();
		if(su==0){
			//return;
			//break;
			System.exit(0);
		}
	}
	//System.out.println("�̿����ּż� �����մϴ�");
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