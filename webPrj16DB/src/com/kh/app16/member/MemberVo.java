package com.kh.app16.member;

public class MemberVo {
	private String memberId;
	private String memberPwd;
	private String memberNick;
	private String enfollDate;
	
	public MemberVo() {
		
	}
	
	public MemberVo(String memberId, String memberPwd, String memberNick, String enfollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberNick = memberNick;
		this.enfollDate = enfollDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberNick() {
		return memberNick;
	}

	public void setMemberNick(String memberNick) {
		this.memberNick = memberNick;
	}

	public String getEnfollDate() {
		return enfollDate;
	}

	public void setEnfollDate(String enfollDate) {
		this.enfollDate = enfollDate;
	}

	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNick=" + memberNick
				+ ", enfollDate=" + enfollDate + "]";
	}
	
	
	
}
