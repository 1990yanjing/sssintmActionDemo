package com.wangyan.ssmWebAction.framework;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("resultMessageFactory")
public class ResultMessageFactory {

	private String successCode = "0000";
	private String successMessage = "联网成功";
	
	public ResultMessage createSuccessResult(Object data) {
		if (isBaseType(data)) {
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("result", data);
			return new ResultMessage(successCode, successMessage, result);
		}
		return new ResultMessage(successCode, successMessage, data);
	}
	
	public ResultMessageFactory() {
		// TODO Auto-generated constructor stub
	}
	
	private boolean isBaseType(Object data) {
		if (data instanceof String) {
			return true;
		}
		if (data instanceof Boolean) {
			return true;
		}
		if (data instanceof Integer) {
			return true;
		}
		if (data instanceof Long) {
			return true;
		}
		if (data instanceof Date) {
			return true;
		}
		return false;
	}

}
