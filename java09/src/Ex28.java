/*
�޼����� ����� ȣ��
*/
class Ex28{

  public static void main(String[] args){
	// 5�����
	func3(5);	
	
  }// main end
// (5)->(4)->(3)->(2)->(1)
  public static int func3(int cnt){
	System.out.print(cnt);
	if(--cnt!=0){
          System.out.print('+');
	  func3(cnt);
	}
	return 0;
  }

  public static void func2(int cnt1,int cnt2){
	System.out.println("����� ȣ��");
	cnt1++;
	if(cnt1!=cnt2){func2(cnt1,cnt2);}
	return;
  }

  public static int func1(int cnt){
	System.out.println("��� ����");
	cnt--;
	if(cnt!=0){func1(cnt);}
	return 0;
  }

}	//class end