

class Ex08{

    public static void main(String[] args){
	// su�� 1005�϶� ¦�� ���� Ȧ�� ���� ����Ͻÿ�
	int su=1005;

	if(su%2==0){
		System.out.println("¦���Դϴ�");
	}
	if(su%2!=0){
		System.out.println("Ȧ���Դϴ�");
	}
	System.out.println("------------------------------------");
	// su2�� ������� �������� ����Ͻÿ�
	int su2=10;

	if(su2>=0){
		if(su2!=0){
			System.out.println("��� �Դϴ�");
		}
		if(su2==0){
			System.out.println("0�Դϴ�");
		}
	}
	if(su2<0){
		System.out.println("���� �Դϴ�");
	}
	System.out.println("------------------------------------");
	// ch='b' �϶�, �������� �������� 
	//	�������� Ư���������� ����Ͻÿ�
	char ch='b';
	int num=(int)ch;

	if(num>=(int)'A' && num<=(int)'Z'){
		System.out.println("�빮���Դϴ�");
	}
	if(num>=(int)'a' && num<=(int)'z'){
		System.out.println("�ҹ����Դϴ�");
	}
	if(num>=(int)'0' && num<=(int)'9'){
		System.out.println("�����Դϴ�");
	}
    }

}






















