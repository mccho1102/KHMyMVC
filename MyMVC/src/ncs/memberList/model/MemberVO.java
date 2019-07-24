package ncs.memberList.model;

import java.util.Calendar;

public class MemberVO {



	public int getAge() {

		Calendar currentDate = Calendar.getInstance();

		int currentYear = currentDate.get(Calendar.YEAR);



		int age = 0;

		try {

		age = currentYear - Integer.parseInt(birthday.substring(0, 4)) + 1;

		} catch (NumberFormatException e) { e.printStackTrace(); }



		return age;

		}



		public String getSexual() {

		if(gender==1) return "남";

		else return "여";

		}
}
