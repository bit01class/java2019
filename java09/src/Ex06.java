
/*
BIT편의점
-------------------------------------------
물품	| 수량	|가격	| 금액
-------------------------------------------
생수	|1	|1000	|1000
쌀과자	|2	|1200	|2400
커피	|3	|900	|2700
-------------------------------------------
합계	: xxxxxxxxx원
-------------------------------------------
*/
class Ex06{

    public static void main(String[] args){
	int item1=3;
	int item2=2;
	int item3=1;
	String bar="-------------------------------------------";
	System.out.println("BIT편의점");
	System.out.println(bar);
	System.out.println("물품\t| 수량\t|가격\t| 금액");
	System.out.println(bar);
	System.out.println("생수\t|"+item1+"\t|1000\t|"+item1*1000);
	System.out.println("쌀과자\t|"+item2+"\t|1200\t|"+item2*1200);
	System.out.println("커피\t|"+item3+"\t|900\t|"+item3*900);
	System.out.println(bar);
	System.out.println("합계\t: "+(item1*1000+item2*1200+item3*900)+"원");
	System.out.println(bar);

    }

}














