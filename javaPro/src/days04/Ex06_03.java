package days04;

import java.util.Scanner;

public class Ex06_03 {

	public static void main(String[] args) {
		//국어 점수를 입력 받아서
		//수/우/미/양/가
		//출력
		//수	90이상 ~ 100이하
		//우	80이상 ~ 90미만(89이하)
		
		Scanner sc = new Scanner(System.in);
		
		
		int score = sc.nextInt();
		String result = "";
		
		if (score >= 90 && score <= 100) {
			result = "수";
		} else if (score >= 80 && score < 90) {
			result = "우";
		} else if (score >= 70 && score < 80) {
			result = "미";
		} else if (score >=60 && score < 70) {
			result = "양";
		} else if (score >= 0 && score < 60){
			result = "가";
		}
		
		System.out.println(result);
		
	}

}
