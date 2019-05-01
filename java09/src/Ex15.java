/*
Q4. 구구단 7단을 출력하세요
Q5. 다음을 출력하세요
	3+6+9+12+15+18+21+24+27=????
	(3*1)+(3*2)+(3*3)+(3*4)....(3*9)
*/
class Ex15{

    public static void main(String[] args){
	int dan=7;
	for(int i=1; i<10; i++){
	System.out.println(dan+"x"+i+"="+(dan*i));
	}
	System.out.println("---------------------------------------");
	int sum2=0;
	for(int i=1; i<=10; i++){
	   if(i!=1){
		System.out.print("+");
	   }
	   System.out.print(3*i);
	   sum2+=3*i; // sum2=sum2+(3*i);
	}
	System.out.println("="+sum2);
    }

}












