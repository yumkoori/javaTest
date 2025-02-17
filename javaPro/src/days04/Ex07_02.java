package days04;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
	      int kor = -1 ;       
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 국어 점수 입력 ? ");  
	       
	      if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();   
	      char grade = '수'; 

	      switch (kor/10) {
	      case 10: {
	    	  grade = '수';
	    	 // break;
	      }
	      case 9: {
	    	  grade = '수';
	    	  //break;
	      }
	      case 8: {
	    	  grade = '우';
	    	  //break;
	      }
	      case 7: {
	    	  grade = '미';
	    	 // break;
	      }
	      case 6: {
	    	  grade = '양';
	    	  //break;
	      }
	      case 5: {}
			  grade = '가';
			//break;
		} //switch
	      
	      System.out.println(grade);
	}

}
