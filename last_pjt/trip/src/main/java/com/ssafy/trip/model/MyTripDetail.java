package com.ssafy.trip.model;

public class MyTripDetail {
	private int detailNo;
	private int contentId;
	private int contentTypeId;
	private String id;
	private int sido_code;
	private String sequence;
	
	public MyTripDetail() {
		super();
	}
	
	
	
	public MyTripDetail(int contentId, int sido_code, String sequence) {
		super();
		this.contentId = contentId;
		this.sido_code = sido_code;
		this.sequence = sequence;
	}



	public MyTripDetail(int contentId, String id, int sido_code) {
		super();
		this.contentId = contentId;
		this.id = id;
		this.sido_code = sido_code;
	}

	public MyTripDetail(String id, int contentId, int contentTypeId, int sido_code) {
		super();
		this.id = id;
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.sido_code = sido_code;
	}

	public MyTripDetail(int detailNo, int contentId, int contentTypeId, int sido_code) {
		super();
		this.detailNo = detailNo;
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.sido_code = sido_code;
	}

	public MyTripDetail(int detailNo, int contentId, int contentTypeId, String id, int sido_code, String sequence) {
		super();
		this.detailNo = detailNo;
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.id = id;
		this.sido_code = sido_code;
		this.sequence = sequence;
	}

	public int getDetailNo() {
		return detailNo;
	}

	public void setDetailNo(int detailNo) {
		this.detailNo = detailNo;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public int getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSido_code() {
	    return sido_code;
	}

	public void setSido_code(int sido_code) {
	    this.sido_code = sido_code;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	@Override
	public String toString() {
		return "MyTripDetail [detailNo=" + detailNo + ", contentId=" + contentId + ", contentTypeId=" + contentTypeId
				+ ", id=" + id + ", sido_code=" + sido_code + ", sequence=" + sequence + "]";
	}

	
}
