package member.vo;

public class MemberVo {
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", name=" + name + ", id=" + id + ", pwd=" + pwd + ", eMail=" + eMail + ", phone="
				+ phone + ", grade=" + grade + ", enrollDate=" + enrollDate + ", modifyDate=" + modifyDate + ", status="
				+ status + "]";
	}
	public MemberVo(String no, String name, String id, String pwd, String eMail, String phone, String grade,
			String enrollDate, String modifyDate, String status) {
		super();
		this.no = no;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.eMail = eMail;
		this.phone = phone;
		this.grade = grade;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String no;
	private String name;
	private String id;
	private String pwd;
	private String eMail;
	private String phone;
	private String grade;
	private String enrollDate;
	private String modifyDate;
	private String status;
}
