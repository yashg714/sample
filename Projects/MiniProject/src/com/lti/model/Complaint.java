package com.lti.model;

import java.time.LocalDate;
import java.util.Date;

public class Complaint {

	LocalDate rDate,sDate;
	String product,subProduct,issue,subIssue,company,state,submit,cResponse;
	int zipCode,complaintId;
	boolean tResponse,cDisputed;
	public Complaint(LocalDate rDate, String product, String subProduct,String issue, String subIssue,String company, 
			String state, int zipCode,String submit,LocalDate sDate, 
			 String cResponse,boolean tResponse, boolean cDisputed,int complaintId) {
		this.rDate = rDate;
		this.sDate = sDate;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.submit = submit;
		this.cResponse = cResponse;
		this.zipCode = zipCode;
		this.complaintId = complaintId;
		this.tResponse = tResponse;
		this.cDisputed = cDisputed;
	}
	public LocalDate getrDate() {
		return rDate;
	}
	public void setrDate(LocalDate rDate) {
		this.rDate = rDate;
	}
	public LocalDate getsDate() {
		return sDate;
	}
	public void setsDate(LocalDate sDate) {
		this.sDate = sDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubProduct() {
		return subProduct;
	}
	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubIssue() {
		return subIssue;
	}
	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public String getcResponse() {
		return cResponse;
	}
	public void setcResponse(String cResponse) {
		this.cResponse = cResponse;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public boolean istResponse() {
		return tResponse;
	}
	public void settResponse(boolean tResponse) {
		this.tResponse = tResponse;
	}
	public boolean iscDisputed() {
		return cDisputed;
	}
	public void setcDisputed(boolean cDisputed) {
		this.cDisputed = cDisputed;
	}
	@Override
	public String toString() {
		return "Complaint [rDate=" + rDate + ", sDate=" + sDate + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", submit=" + submit + ", cResponse=" + cResponse + ", zipCode=" + zipCode + ", complaintId="
				+ complaintId + ", tResponse=" + tResponse + ", cDisputed=" + cDisputed + "]";
	}
	
	
}
