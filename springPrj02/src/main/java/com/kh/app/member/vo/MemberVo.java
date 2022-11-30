package com.kh.app.member.vo;

import java.util.Arrays;

public class MemberVo {

	private String memberId;
	private String memberPwd;
	private String[] hobby;
	
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String memberId, String memberPwd, String[] hobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "MemberVo [memberId=" + memberId + ", memberPwd=" + memberPwd + ", hobby=" + Arrays.toString(hobby)
				+ "]";
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
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	

	
	
}
