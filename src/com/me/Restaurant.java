package com.me;

public class Restaurant {
	private String resId;
	private String resName;
	private String resAdd;
	private String resSub;
	private int resPcode;
	private String resEmail;
	private String resPhone;
	private String resCuizine;	
	
	public Restaurant() 
	{
		
	}

	public Restaurant(String resId, String resName, String resAdd, String resSub, int resPcode,  String resEmail, String resPhone, String resCuizine) {	
		this.resId = resId;
		this.resName = resName;
		this.resAdd = resAdd;
		this.resSub = resSub;
		this.resPcode = resPcode;
		this.resEmail = resEmail;
		this.resPhone = resPhone;
		this.resCuizine = resCuizine;
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResAdd() {
		return resAdd;
	}

	public void setResAdd(String resAdd) {
		this.resAdd = resAdd;
	}

	public String getResSub() {
		return resSub;
	}

	public void setResSub(String resSub) {
		this.resSub = resSub;
	}

	public int getResPcode() {
		return resPcode;
	}

	public void setResPcode(int resPcode) {
		this.resPcode = resPcode;
	}

	public String getResEmail() {
		return resEmail;
	}

	public void setResEmail(String resEmail) {
		this.resEmail = resEmail;
	}

	public String getResPhone() {
		return resPhone;
	}

	public void setResPhone(String resPhone) {
		this.resPhone = resPhone;
	}

	public String getResCuizine() {
		return resCuizine;
	}

	public void setResCuizine(String resCuizine) {
		this.resCuizine = resCuizine;
	}
	
	
}
