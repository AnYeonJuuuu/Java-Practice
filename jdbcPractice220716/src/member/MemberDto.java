package member;



public class MemberDto { // data transfer object

	 private String 제목;
	 private String 가수 ;
	 private String 장르 ;
	 private String 맞춤 ;
	 
	public MemberDto() {
		
	}
	 
	public MemberDto(String 제목, String 가수, String 장르, String 맞춤) {
		super();
		this.제목 = 제목;
		this.가수 = 가수;
		this.장르 = 장르;
		this.맞춤 = 맞춤;
	}
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public String get가수() {
		return 가수;
	}
	public void set가수(String 가수) {
		this.가수 = 가수;
	}
	public String get장르() {
		return 장르;
	}
	public void set장르(String 장르) {
		this.장르 = 장르;
	}
	public String get맞춤() {
		return 맞춤;
	}
	public void set맞춤(String 맞춤) {
		this.맞춤 = 맞춤;
	}
	@Override
	public String toString() {
		return "MemberDto [제목=" + 제목 + ", 가수=" + 가수 + ", 장르=" + 장르 + ", 맞춤=" + 맞춤 + "]";
	}

	
	
}
