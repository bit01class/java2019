/*
�޼���
 - �ڵ��� ���뼺
 - ȣ�� ������ �ش� �޼���� ���� �����ϰ� ������ 
   ȣ���� ������ �ٽ� ���ư�
 - �޼����� �̸��� �ߺ��Ұ�
 - �޼����� ���� ������,���ڸ� 
   ù���ڴ� ���Ҹ� ����
 - �޼����� ȣ�� : �޼����(�Ķ����)
 - �Ű�����,����, �Ķ���� : ȣ������ �޴� ���� ������ �ڷ���
	public static void �޼����(�Ű�����){
		���๮;
	}
*/

class Ex26{
	// Ŭ������ ������� 
	// 1.�޼���

   public static void main(String[] args){
	System.out.println("���� ����");
	int a;
	a=100;
	System.out.println("a="+a);
	func2();
	System.out.println("���� ��");
   }	// main end

   public static int func4(){
	System.out.println("2+3�� �����ϰڽ��ϴ�");
	int x=2;
	int y=3;
	int z=x+y;
	return z;
   }

   public static void func3(int num1, double num2,String msg){
	System.out.println("num1="+num1+",num2="+num2);
	System.out.println(msg);
   }

 
   public static void func1(){
	System.out.println("���ο� ���1����");
	func2();
	System.out.println("���ο� ���1��");
   }	// func1 end

 
   public static void func2(){
	System.out.println("���ο� ���2");
	int i=1;
	return;
   }	// func2 end

}	// class end














