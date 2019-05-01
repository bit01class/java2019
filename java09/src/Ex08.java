

class Ex08{

    public static void main(String[] args){
	// su가 1005일때 짝수 인지 홀수 인지 출력하시오
	int su=1005;

	if(su%2==0){
		System.out.println("짝수입니다");
	}
	if(su%2!=0){
		System.out.println("홀수입니다");
	}
	System.out.println("------------------------------------");
	// su2가 양수인지 음수인지 출력하시오
	int su2=10;

	if(su2>=0){
		if(su2!=0){
			System.out.println("양수 입니다");
		}
		if(su2==0){
			System.out.println("0입니다");
		}
	}
	if(su2<0){
		System.out.println("음수 입니다");
	}
	System.out.println("------------------------------------");
	// ch='b' 일때, 영대인지 영소인지 
	//	숫자인지 특수문자인지 출력하시오
	char ch='b';
	int num=(int)ch;

	if(num>=(int)'A' && num<=(int)'Z'){
		System.out.println("대문자입니다");
	}
	if(num>=(int)'a' && num<=(int)'z'){
		System.out.println("소문자입니다");
	}
	if(num>=(int)'0' && num<=(int)'9'){
		System.out.println("숫자입니다");
	}
    }

}






















