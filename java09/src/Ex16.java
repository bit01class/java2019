
class Ex16{

    public static void main(String[] args){
	int a;	// 변수의 선언
	a=0xb;	// 초기화;
	System.out.println("16진수");
	System.out.println("10="+0xa);
	System.out.println("11="+0xb);
	System.out.println("12="+0xc);
	System.out.println("13="+0xd);
	System.out.println("14="+0xe);
	System.out.println("15="+0xf);
	System.out.println("16="+0x10);
	System.out.println("8진수");
	System.out.println("6=06, "+06);
	System.out.println("7=07, "+07);
	System.out.println("8=010, "+010); 
	System.out.println("9=011, "+011); 
	System.out.println("10=012, "+012); 
	System.out.println("..."); 
	System.out.println("15=017, "+017);
	System.out.println("16=020, "+020);
	System.out.println("----------");
	boolean boo=true;	// 1bit  
	byte su1;
	su1=127;	// -128 ~ 127
	su1++;
	System.out.println("su1="+su1);
	short su2;
	su2=32767;	// -32768 ~ 32767
	//su2++;
	System.out.println("su2="+su2);
	int su3;
	su3=2147483647;
	su3++;
	System.out.println("su3="+su3);
	long su4;
	su4=2147483648L;
	System.out.println("su4="+su4);
	double su5,su6;
	su5=3.1400000001;
	su6=1.0000000001;
	System.out.println("su5="+su5);
	System.out.println(su5+su6);
	float su7;
	su7=3.14F;
	char ch1,ch2;
	ch1='\uac00';
	ch2=44032;
	System.out.println(ch1);
	System.out.println(ch2);



    }


}


