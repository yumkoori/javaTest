package days04;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
	      int kor = -1 ;       
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> ���� ���� �Է� ? ");  
	       
	      if (!scanner.hasNextInt()) {
	         System.out.println("[�˸�] ���� ���� 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();   
	      char grade = '��'; 

	      switch (kor/10) {
	      case 10: {
	    	  grade = '��';
	    	 // break;
	      }
	      case 9: {
	    	  grade = '��';
	    	  //break;
	      }
	      case 8: {
	    	  grade = '��';
	    	  //break;
	      }
	      case 7: {
	    	  grade = '��';
	    	 // break;
	      }
	      case 6: {
	    	  grade = '��';
	    	  //break;
	      }
	      case 5: {}
			  grade = '��';
			//break;
		} //switch
	      
	      System.out.println(grade);
	}

}
