class Ex22{

  public static void main(String[] args){
	System.out.println(2+"x"+1+"="+2*1);
	System.out.println(2+"x"+2+"="+2*2);
	System.out.println(2+"x"+3+"="+2*3);
	System.out.println(2+"x"+4+"="+2*4);
	System.out.println(2+"x"+5+"="+2*5);
	System.out.println(2+"x"+6+"="+2*6);
	System.out.println(2+"x"+7+"="+2*7);
	System.out.println(2+"x"+8+"="+2*8);
	System.out.println(2+"x"+9+"="+2*9);
	System.out.println("----------------------------");
	for(int i=1; i<10; i++){		
	  System.out.println(2+"x"+i+"="+2*i);
	}
	for(int i=1; i<10; i++){
	  System.out.println(3+"x"+i+"="+3*i);
	}
	for(int i=1; i<10; i++){
	  System.out.println(4+"x"+i+"="+4*i);
	}
	for(int i=1; i<10; i++){
	  System.out.println(5+"x"+i+"="+5*i);
	}
	System.out.println("---------------------------------------");
	for(int j=2; j<10; j++){
		for(int i=1; i<10; i++){		
		  System.out.println(j+"x"+i+"="+j*i);
		}
	}
	System.out.println("---------------------------------------");
	// 2*1	3*1	4*1	5*1~~~
	// 2*2	3*2	4*2	5*2~~~~
	for(int i=2; i<10; i++){
		System.out.print(i+"x1="+(i*1)+"\t");
	}
	System.out.println();
	for(int i=2; i<10; i++){
		System.out.print(i+"*2="+(i*2)+"\t");
	}
	System.out.println();
	for(int i=2; i<10; i++){
		System.out.print(i+"*3="+(i*3)+"\t");
	}
	System.out.println();
	for(int i=2; i<10; i++){
		System.out.print(i+"*4="+(i*4)+"\t");
	}
	System.out.println();
	System.out.println("---------------------------------------");
	for(int j=1;j<10; j++){
		for(int i=2; i<10; i++){
			System.out.print(i+"x"+j+"="+(i*j)+"\t");
		}
		System.out.println();
		
	}
	
  }

}


















