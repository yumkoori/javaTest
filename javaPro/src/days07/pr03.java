package days07;

public class pr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. ASCII 을 한 라인에 7개씩 출력하고 
		//   각 라인마다 라인번호를 붙이고
		//   10개의 라인이 출력 후 "엔터키를 치면 진행" 하도록 
		//   코딩하세요.
		
		
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			
			System.out.printf("[%c]", i);
			//0 1 2 3 4 5  6
			//7 8 9 10 11 12 13
			//13 14 15 16 17 18 19
			if(i % 6 == 0) {
				System.out.println();
			}
		} //for i
		
		
	}

}
