package com.domain.system.demo2.pojo.vo.result;

import com.domain.system.base.util.json.GsonUtil;

import java.util.HashMap;
import java.util.Map;

public class ResultBean {
    public static final int OK = 1;
    public static final int ERROR = 2;
    //参数验证错误响应编码
    public static final int VALERROR = 3;

    private static final String STATE_KEY = "code";
    private static final String DESC_KEY = "message";
    private static final String DATA_KEY = "body";

    private int state = OK;
    private String desc = "";

    private Map<String, Object> data;

    private ResultBean() {
        data = new HashMap<String, Object>();
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static ResultBean getOKInstance() {
        ResultBean rb = new ResultBean();
        rb.setState(OK);
        return rb;
    }

    public static ResultBean getOKInstance(String desc) {
        ResultBean rb = new ResultBean();
        rb.setState(OK);
        rb.setDesc(desc);
        return rb;
    }

    public static ResultBean getErrorInstance() {
        ResultBean rb = new ResultBean();
        rb.setState(ERROR);
        return rb;
    }

    public static ResultBean getErrorInstance(String desc) {
        ResultBean rb = new ResultBean();
        rb.setState(ERROR);
        rb.setDesc(desc);
        return rb;
    }

    public static ResultBean getValErrorInstance(String desc) {
        ResultBean rb = new ResultBean();
        rb.setState(VALERROR);
        rb.setDesc(desc);
        return rb;
    }

    public ResultBean putData(String key, Object value) {
        data.put(key, value);
        return this;
    }

    //添加Put Body
    public ResultBean putData( Object value) {
        data.put(DATA_KEY, value);
        return this;
    }

	public String toJsonString() {
		Map<String, Object> rm = new HashMap<String, Object>();
		rm.put(STATE_KEY, state);
		rm.put(DESC_KEY, desc);
		rm.put(DATA_KEY, data);
//		return JSONParser.toJSONString(rm);
        return GsonUtil.toJson(rm);
	}
}