package days07;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex06 {

	public static void main(String[] args) {
		      // 1 <=   <= 100 임의의 정수를 중복되지 않게 배열에 채워넣기.
		      // days06.Ex01.java 복사 + 붙이기.
		      /*
		      int index = 0, n;      
		      int [] m = new int[10];
		      m[index++] = (int)( Math.random()*100)+1;
		      // 1
		      while ( index < m.length ) {
		         n =  (int)( Math.random()*100)+1; 
		         boolean flag = false;
		         for (int i = 0; i < index; i++) {
		            if( m[i] == n ) {
		               System.out.println("*");
		               flag = true;
		               break;
		            }
		         } // for i    
		         if( !flag ) m[index++] = n;
		      } // while
		      */

		      // new Random().ints(1, 101).distinct().limit(10)
		      //   .forEach(System.out::println);
		      
		      int [] m = new Random().ints(1, 101).distinct().limit(10).toArray();
		      
		      System.out.println( Arrays.toString(m) );
		      
		      System.out.println("정수 입력 ?");
		      Scanner sc = new Scanner(System.in);
		      int n = sc.nextInt(); 
		      //n과 가장 가까운 수를 구해서 출력
		     
		      int min = Math.abs(n - m[0]);
		      boolean duplicate = false;
		      
		      int duplicateNumber = 0;
		      int result = m[0];
		      
		      for (int i = 1; i < m.length; i++) {
		    	  int distance = Math.abs(n - m[i]);
				
		    	  if (distance < min) {
		    		  distance = min;
		    		  result = m[i];
		    		  duplicateNumber = 0;
		    		  duplicate = false;
		    	  }
		    	  
		    	  if (distance == min) {
		    		  duplicateNumber = m[i];
		    		  duplicate = true;
		    	  }	
			  } //for i
		      System.out.println(result);
		      if (duplicate) {
		    	  System.out.println(duplicateNumber);
		      }
		      
		   } // main

	

	}


