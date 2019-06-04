package com.qf.mrmf.vo;

// �����ص����ݷ�װ��������
public class JsonBean {

	private Object info; // ���ص�����
	private int code;
	
	public JsonBean() {
		super();
	}
	
	
	
	public JsonBean(int code, Object info) {
		super();
		this.info = info;
		this.code = code;
	}


	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}
	
	
}
