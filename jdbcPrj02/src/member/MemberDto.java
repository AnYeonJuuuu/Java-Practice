package member;

import java.sql.Timestamp;

public class MemberDto { // data transfer object

	 private String id;
	 private String pwd ;
	 private String nick ;
	 private Timestamp enroll_date ;
	 private char quit_yn ;
	
	// 기본 생성자 
	public MemberDto() {
		
	}
	
	// 매개변수 있는 생성자
	public MemberDto(String id, String pwd, String nick, Timestamp enroll_date, char quit_yn) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.enroll_date = enroll_date;
		this.quit_yn = quit_yn;
	}
	
	// getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Timestamp getEnroll_date() {
		return enroll_date;
	}
	public void setEnroll_date(Timestamp enroll_date) {
		this.enroll_date = enroll_date;
	}
	public char getQuit_yn() {
		return quit_yn;
	}
	public void setQuit_yn(char quit_yn) {
		this.quit_yn = quit_yn;
	}
	
	//toString
	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enroll_date=" + enroll_date + ", quit_yn="
				+ quit_yn + "]";
	}
	
	
}
