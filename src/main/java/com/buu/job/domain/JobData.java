package com.buu.job.domain;

import java.util.UUID;

public class JobData {

	//状态吗 
	private Integer status;

	private String id;
    
	//消息
    private String msg;

    //数据
    private Object data;
    private JobData(Integer status, String msg, Object data, String id){
    	this.status=status;
    	this.msg=msg;
    	this.data=data;
    	this.id=id;
    }
    public static JobData success(){
    	return new JobData(200, "success", null,null);
    }

    public static JobData success(Object object){
    	String id=UUID.randomUUID().toString().trim();
    	return new JobData(200, "success", object,id);
    }

    public static JobData fail(){
    	return new JobData(500, "service has a Exception", null,null);
    }
    public static JobData fail(Object object){
    	return new JobData(500, "service has a Exception", object,null);
    }
	public Integer getStatus() {
		return status;
	}
	
	public String getMsg() {
		return msg;
	}

	public Object getData() {
		return data;
	}
	
	public String getId() {
		return id;
	}


}

