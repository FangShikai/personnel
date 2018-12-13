package com.SSM.pojo;

import java.util.Date;

public class SelectDate {
	private Date begin_date;
	private Date end_date;
	public Date getBegin_date() {
		return begin_date;
	}
	public void setBegin_date(Date begin_date) {
		this.begin_date = begin_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "SelectDate [begin_date=" + begin_date + ", end_date=" + end_date + "]";
	}
	

}
