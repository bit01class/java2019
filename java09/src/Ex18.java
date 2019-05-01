/*
	제어문
반복문
while반복문

	while(조건){
		실행문;
	}


*/

class Ex18{

   public static void main(String[] args){
	// 1~5까지 출력
	int su=1;
	while(su<6){
		System.out.println("su="+su++);
	}
	// 홀수출력
	su=1;
	while(su<=10){
		System.out.println("su="+su);
		su+=2;
	}
	System.out.println("----------------");
	su=100;
	while(su<200){
		System.out.println("실행");
	}


   }

}






