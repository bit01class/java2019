
/*
BIT������
-------------------------------------------
��ǰ	| ����	|����	| �ݾ�
-------------------------------------------
����	|1	|1000	|1000
�Ұ���	|2	|1200	|2400
Ŀ��	|3	|900	|2700
-------------------------------------------
�հ�	: xxxxxxxxx��
-------------------------------------------
*/
class Ex06{

    public static void main(String[] args){
	int item1=3;
	int item2=2;
	int item3=1;
	String bar="-------------------------------------------";
	System.out.println("BIT������");
	System.out.println(bar);
	System.out.println("��ǰ\t| ����\t|����\t| �ݾ�");
	System.out.println(bar);
	System.out.println("����\t|"+item1+"\t|1000\t|"+item1*1000);
	System.out.println("�Ұ���\t|"+item2+"\t|1200\t|"+item2*1200);
	System.out.println("Ŀ��\t|"+item3+"\t|900\t|"+item3*900);
	System.out.println(bar);
	System.out.println("�հ�\t: "+(item1*1000+item2*1200+item3*900)+"��");
	System.out.println(bar);

    }

}














