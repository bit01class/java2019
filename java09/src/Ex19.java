/* while�� �̿�
Q1. 1~100���� �հ�� �����ΰ���?

Q2. ������ ����Ͻÿ�
	1	3	5	7	9
	1+(2*0)
		1+(2*1)
			1+(2*2)
				1+(2*3)
					1+(2*4)

Q3. 1~100�� ¦������ �հ踦 ���Ͻÿ�

Q4. ������ 7���� ����ϼ���

Q5. ������ ����ϼ���
	3+6+9+12+15+18+21+24+27=????

ctrl+c

*/

class Ex19{

   public static void main(String[] args){
	
	//while(true){
	//	System.out.println("���");
	//}
	int sum=0;
	for(int i=1; i<=100; i++){
		sum+=i;
	}
	System.out.println("1~100������ ���� "+sum);
	System.out.println("---------------------------");
	int sum2=0;
	int j=1;
	while(j<=100){
		sum2+=j;
		j++;
	}
	System.out.println("1~100������ ���� "+sum2);
	System.out.println("---------------------------");
	for(int i=1; i<10; i+=2){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=1; i<10; i++){
		if(i%2==1){
			System.out.print(i+" ");
		}
	}
	System.out.println("\n---------------------------");
	int y=1;
	while(y<10){
		System.out.print(y+" ");
		y+=2;
	}
	System.out.println();
	int z=1;
	while(z<10){
		if(z%2==1){
			System.out.print(z+" ");
		}
		z++;
	}
	System.out.println("\n---------------------------");
	//1+(2*0)
	for(int i=0; i<5; i++){
		System.out.print(1+(2*i)+" ");
	}
	System.out.println();
	int x=0;
	while(x<5){
		System.out.print(1+(2*x)+" ");
		x++;
	}
	System.out.println("\n--------------");
	int m=1;
	boolean result=true;
	while(result){
		
		System.out.print(m+" ");
		if(m==99){
			result=false;
		}
		m+=2;
	}

   }

}




















