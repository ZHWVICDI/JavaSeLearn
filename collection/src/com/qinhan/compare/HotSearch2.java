package com.qinhan.compare;

public class HotSearch2{
	private String subject;
	private long popularity;
	public HotSearch2(String subject, long popularity) {
		super();
		this.subject = subject;
		this.popularity = popularity;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getPopularity() {
		return popularity;
	}

	public void setPopularity(long popularity) {
		this.popularity = popularity;
	}

	@Override
	public String toString() {
		return "HotSearch2 [subject=" + subject + ", popularity=" + popularity + "]";
	}

	
}
