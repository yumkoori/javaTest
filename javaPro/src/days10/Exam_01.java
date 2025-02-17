package days10;

import java.util.Arrays;
import java.util.Random;

public class Exam_01 {
	/*
	 * 1. 카드번호(String card ="7655-8988-9234-5677" )를
   임의의 2곳을 * 로 바꿔서 출력하는 코딩을 하세요 .
   출력형식:
           7655-****-****-5677
           ****-8988-9234-****
	 * 
	 * */
	
	
	public static void main(String[] args) {
		String card ="7655-8988-9234-5677";
		
		String[] strCard = card.split("-");
		
		int rnn = (int) (Math.random() * 4);
		
		strCard[rnn] = "****";
		
		System.out.println(Arrays.toString(strCard));
	}

}
