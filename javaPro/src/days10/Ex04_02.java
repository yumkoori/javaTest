package days10;

import java.io.IOException;
import java.util.Scanner;

import days08_class.Ex07;

public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int [] korArr = new int[3];
		int index = 0;
		
		String regex = "^(100|[1-9]?[0-9])$";
		char con ='y';
		int score;
		
		do {
			System.out.printf("%d번 학생 점수 입력? ", index + 1);
			score = getRandomInteger(0, 100);
			
			if (index == korArr.length) {
				int [] temp = new int[korArr.length+2];
				
				for (int i = 0; i < korArr.length; i++) {
					temp[i] = korArr[i];
				} 
				korArr = temp;
			}

			korArr[index++] = score;
		
			System.out.print("입력 할?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		
		
		System.out.printf("입력한 수: %d", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, korArr[i]);
		} //for i
		
		//최고점수/최저점수/평균
		
		int maxScore = korArr[0];
		int minScore = korArr[0];
		int tot = korArr[0];
		double avg = 0;
		for (int i = 1; i < korArr.length- 1; i++) {
			maxScore = Math.max(maxScore, korArr[i]);
			minScore = Math.min(minScore, korArr[i]);
			tot += korArr[i];
		} //for i
		
		avg = (double) tot / korArr.length;
		
		System.out.printf("최고점수 = %d, 최저점수 = %d, 평균 = %2f", maxScore, minScore, avg);
	}
	
	private static int getRandomInteger(int min, int max) {		
		return (int)( Math.random()*(max-min+1))+min;
	}

}
