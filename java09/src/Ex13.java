/*
Q1. 1~100���� �հ�� �����ΰ���?

Q2. ������ ����Ͻÿ�
	1	3	5	7	9
Q3. 1~100�� ¦������ �հ踦 ���Ͻÿ�

Q4. ������ 7���� ����ϼ���

Q5. ������ ����ϼ���
	3+6+9+12+15+18+21+24+27=????

*/
class Ex13{

    public static void main(String[] args){

	int sum=0;// 0+1+2+3+...+99+100

	for(int i=1; i<=100; i++){
		sum+=i;// sum=sum+i;
	}
	System.out.println("1~100������ �հ�� "+sum);

	for(int i=1;i<10 ;i+=2){
		System.out.print(i+" ");
	}
	System.out.println("\n-----------------------");
	int a=1;
	for(int i=0; i<5; i++){
		System.out.print(a+i*2 +" ");
	}
	System.out.println("\n-----------------------");
	for(int i=1; i<=10; i++){
		if(i%2==1){
		System.out.print(i+" ");
		}
	}
    }

}













