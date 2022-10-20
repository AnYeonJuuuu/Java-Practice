package com.kh.app;

public class MemberVo {
	private String nick;
	private String id;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVo(String nick, String id) {
		super();
		this.nick = nick;
		this.id = id;
	}
	@Override
	public String toString() {
		return "MemberVo [nick=" + nick + ", id=" + id + "]";
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
