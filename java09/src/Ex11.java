/*
����,����,���� ������ �����ϴ� ���α׷�
���� 90	���� 85	���� 78
�̵��� ����� ���
���� ���� ~���90:A����, 80:B����, 70:C����, 60:D����, 60�̸�:F����
ex)
-----------------------------------------
�����������α׷�(ver 0.0.1)
-----------------------------------------
���� : 90		���� :85		����:78
�հ�: 0000
���: 00.00
����: (A~F)����
 

*/
class Ex11{

    public static void main(String[] args){
	int kor=91;
	int eng=85;
	int math=78;
	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;
	
	System.out.println("-----------------------------------------");
	System.out.println("�����������α׷�(ver 0.0.1)");
	System.out.println("-----------------------------------------");
	System.out.println("���� : "+kor+"\t���� :"+eng+"\t����:"+math);
	System.out.println("�հ�: "+sum);
	System.out.println("���: "+avg);
	System.out.print("����: ");
	
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












