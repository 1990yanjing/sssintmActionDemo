package com.wangyan.ssmWebAction.framework;
import java.io.Serializable;

/**
 * 
* @ClassName: ResultMessage 
* @Description: 响应接口对象
* @author wangkx@chinaamc.com 
* @date 2015-1-16 下午1:59:03
 */
public class ResultMessage implements Serializable {

	private static final long serialVersionUID = 168004958355646630L;
	private String code;
    private String msg;
    private Object data;

    public ResultMessage() {
    	
    }

    public ResultMessage(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
