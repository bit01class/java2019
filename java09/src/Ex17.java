class Ex17{

    public static void main(String[] args){

	String msg=args[0];
	if(msg=="java"){
		System.out.println("참입니다");
	}else{
		System.out.println("거짓");
	}

	if(true){
		System.out.println("조건이 참");
	}


	if(true){
		System.out.println("조건이 참");
	}else{
		System.out.println("조건이 거짓");
	}

	
	if(false){
		System.out.println("조건이 참");
	}else if(true){
		System.out.println("또다른 조건이 참");
	}
	System.out.println("------"+msg+"------");

	switch(3){
		case 1:
		System.out.println("1입니다");
		break;
		case 2:
		System.out.println("2입니다");
		case 3:
		System.out.println("3입니다");
		case 4:
		System.out.println("4입니다");
		default:
		System.out.println("거짓");
		
	}

    }

}









