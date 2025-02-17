package days06;

public class practice01 {

	public static void main(String[] args) {
		// [문제]  한 라인에 10개의 ASCII 문자를 출력
		
		for(int i = 0, lineNumber = 1; i < 256; i++) {
		    
			if(i % 10 == 0) {
				System.out.printf("%d", lineNumber);
			}
			
			System.out.printf("[%c]", i);

			if (i % 10 == 9) {
				System.out.println();
				if (lineNumber % 5 == 0) {
					System.out.println("라인 건너뛰기");
				}
				lineNumber++;
			}
			
		}

	}

}
