package ncs.memberList.model.vo;

public class Member {
	
	private String userId;
	private int gender;
	private String userName;
	private String birthday;
	
	public Member() {}

	public Member(String userId, int gender, String userName, String birthday) {
		super();
		this.userId = userId;
		this.gender = gender;
		this.userName = userName;
		birthday = birthday;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", gender=" + gender + ", userName=" + userName + ", birthday=" + birthday
				+ "]";
	}


	
	
	
}
