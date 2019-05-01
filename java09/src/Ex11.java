/*
국어,영어,수학 성적을 관리하는 프로그램
국어 90	영어 85	수학 78
이들의 결과를 출력
학점 기준 ~평균90:A학점, 80:B학점, 70:C학점, 60:D학점, 60미만:F학점
ex)
-----------------------------------------
성적관리프로그램(ver 0.0.1)
-----------------------------------------
국어 : 90		영어 :85		수학:78
합계: 0000
평균: 00.00
학점: (A~F)학점
 

*/
class Ex11{

    public static void main(String[] args){
	int kor=91;
	int eng=85;
	int math=78;
	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;
	
	System.out.println("-----------------------------------------");
	System.out.println("성적관리프로그램(ver 0.0.1)");
	System.out.println("-----------------------------------------");
	System.out.println("국어 : "+kor+"\t영어 :"+eng+"\t수학:"+math);
	System.out.println("합계: "+sum);
	System.out.println("평균: "+avg);
	System.out.print("학점: ");
	
	switch(sum/3/10){
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");

	}

	/*
	if(avg>=90){
		System.out.println("A");
	}else if(avg>=80){
		System.out.println("B");
	}else if(avg>=70){
		System.out.println("C");
	}else if(avg>=60){
		System.out.println("D");
	}else{
		System.out.println("F");
	}
	*/
    }

}












