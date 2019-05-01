/*
Q2. 다음을 출력하시오
	1	3	5	7	9
Q3. 1~100중 짝수들의 합계를 구하시오
*/
class Ex14{

    public static void main(String[] args){

	for(int i=1; i<10; i+=2){
		System.out.print(i+" ");
	}
	System.out.println("\n--------------------------");
	for(int i=1; i<10; i++){
		if(i%2==1){
		System.out.print(i);
		}else{
		System.out.print(' ');
		}
	}
	System.out.println("\n--------------------------");
	int sum=0;
	for(int i=1; i<=100; i++){
		if(i%2==0){
		sum+=i; // sum=sum+i;
		}
	}
	System.out.println("1~100까지의 짝수합은 "+sum);

    }

}














