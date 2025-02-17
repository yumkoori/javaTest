package days08;

import java.util.Scanner;

public class Test04 {

	/*
	 * 입력형식:
> 이름을 입력하세요 ? 홍길동 ,  이창익,	서영학 , 정창기

출력형식:
[1] : 홍길동
[2] : 이창익
[3] : 서영학
[4] : 정창기  
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> 이름을 입력하세요 ? ");
		String input = sc.nextLine();
		
		String[] names = input.split(",");
		
		int i = 0;
		for (String name : names) {
			System.out.printf("[%d] : %s", i++, name.trim());
			System.out.println();
		}
	}

}
