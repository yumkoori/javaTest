package days07;

import java.util.Iterator;

public class pr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. String 을  char[]로 변환해서 출력하는  코딩을 하세요 
		   String msg = "hello world";
		   char [] msgArr = new char[msg.length()];
		   
		   
		   for (int i = 0; i < msg.length(); i++) {
			
			   msgArr[i] = msg.charAt(i);
		   } //for i
		
		   msg = new String(msgArr);
		
	}

}
