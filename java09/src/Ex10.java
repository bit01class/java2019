/*
	제어문
조건문
	-switch문

	ex)
		switch(value){
			case value1 :
				실행문;
				break;
			case value2 :
				실행문;
				break;
			case value3 :
				실행문;
				break;
			default :
				실행문;
				break;
		}


*/

class Ex10{

   public static void main(String[] args){
	char ch='0';

	switch(ch){
		case '0':
			System.out.println("0입니다");
			break;
		case 'A':
			System.out.println("A입니다");
			//break;
		case '@':
			System.out.println("@입니다");
			//break;
		default:
			System.out.println("이도저도 아닙니다");
			//break;
	}
   }

}















