class Ex17{

    public static void main(String[] args){

	String msg=args[0];
	if(msg=="java"){
		System.out.println("���Դϴ�");
	}else{
		System.out.println("����");
	}

	if(true){
		System.out.println("������ ��");
	}


	if(true){
		System.out.println("������ ��");
	}else{
		System.out.println("������ ����");
	}

	
	if(false){
		System.out.println("������ ��");
	}else if(true){
		System.out.println("�Ǵٸ� ������ ��");
	}
	System.out.println("------"+msg+"------");

	switch(3){
		case 1:
		System.out.println("1�Դϴ�");
		break;
		case 2:
		System.out.println("2�Դϴ�");
		case 3:
		System.out.println("3�Դϴ�");
		case 4:
		System.out.println("4�Դϴ�");
		default:
		System.out.println("����");
		
	}

    }

}









