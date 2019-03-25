package com.qinhan.compare;

public class HotSearch implements Comparable<HotSearch>{
	private String subject;
	private long popularity;
	public HotSearch(String subject, long popularity) {
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
		return "HotSearch [subject=" + subject + ", popularity=" + popularity + "]";
	}

	@Override
	public int compareTo(HotSearch o) {
		// TODO Auto-generated method stub
		if(this.popularity==o.popularity) {
			return 0;
		}
		return (this.popularity-o.popularity)>0? 1:-1;
	}
	
}
