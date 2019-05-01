package com.bit.day07;

public class MyFunc{
	// 접근제한자(3/4)
	// 1. public - 모두의 접근허용
	// 2. default(없는거) - 동일패키지에서만 접근허용
	// 3. private - 외부접근 불허, 클래스 내부에서만 접근가능
	//  public > default > private

	// - class(1~2), method(1~3)

	public static void function(){
		System.out.println("기능 실행");
        }

}