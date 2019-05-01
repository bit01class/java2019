class Ex09{

    public static void main(String[] args){
	int su=-1;

	if(su>0&&su%2==0){
	    System.out.println("양수이고 짝수입니다");
	}else if(su>0&&su%2!=0){
	    System.out.println("양수이고 홀수입니다");
	}else if(su%2==0){
	    System.out.println("음수이고 짝수입니다");
	}else if(su%2!=0){
	     System.out.println("음수이고 홀수입니다");
	}else{
	    System.out.println("0입니다");
	}

    }

}