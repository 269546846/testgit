package com.wqw.common;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum  Code {

	//成功
	Success("200","Success"),

	//用户操作失败
	STATUS_OPERATION_ERROR("4000","操作失败"),

	//未登录
	UNAUTHEN("4401","用户未登录"),

	//shiro出错
	SHIRO_ERR("4402", "鉴权或授权过程出错"),

	//内部错误,
	STATUS_INTERNAL_ERROR("5000", "Error");

	private String code;

	private String msg;
}
