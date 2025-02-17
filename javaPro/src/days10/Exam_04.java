package days10;

import java.time.LocalDate;
import java.util.Date;

public class Exam_04 {

	/*4. 주민등록번호를 매개변수로 입력받아서 만나이를 계산해서 반환하는 메서드를 선언하세요.
    ( 만나이 = 올해년도-생일년도     생일이지나지않으면 -1 )
	 * 
	 * */
	public static void main(String[] args) {
		String residentNum = "000424-5049595";
		
		int age = caculateAge(residentNum);
		
	}

	private static int caculateAge(String residentNum) {
		//생일년도
		int birthday = getCentury(residentNum)+ Integer.parseInt(residentNum.substring(0, 2));

		//올해 년도
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		
		//생일
		residentNum.substring(2, 6);
		
		int birthMD = Integer.parseInt(residentNum.substring(2, 6));
		Date d = new Date();
		int currMD = ( d.getMonth()+1)*100 +   d.getDate();
		
		if( birthMD > currMD ) (year - birthday) -1;		 
		return year - birthday;
		
	}
	
	private static int getCentury(String rrn) {
		char gender = rrn.charAt(7) ;
		switch (gender) {  
		case '9': case '0':
			return 1800; 
		case '1': case '2': case '5': case '6':	
			return 1900;
		// case '3': case '4': case '7': case '8':
		default:
		    return 2000; 			
		} // switch
	}

}
