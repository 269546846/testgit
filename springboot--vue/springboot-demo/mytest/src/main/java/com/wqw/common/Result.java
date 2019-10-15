package com.wqw.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {
	String code;

	T data;

	String msg;

	public Result(){

	}

	public Result(String code,T data){
		super();
		this.code=code;
		this.data=data;
	}

	public Result(String code,String msg){
		super();
		this.code=code;
		this.data=data;
		this.msg=msg;
	}

	public Result(String code,T data,String msg){
		super();
		this.code=code;
		this.data=data;
		this.msg=msg;
	}

	public Result(Code code){
		super();
		this.code=code.getCode();
		this.msg=code.getMsg();
	}
	public Result(Code code,T data){
		super();
		this.code=code.getCode();
		this.msg=code.getMsg();
		this.data=data;
	}

	public static <T> Result Success(){
		return new Result(Code.Success);
	}

	public static <T> Result Success(T data){
		return new Result(Code.Success,data);
	}

	public static <T> Result Error(String code){
		return new Result(code,"Error");
	}

	public static <T> Result Error(String code, T data){
		return new Result(code,data,"Error");
	}


}
