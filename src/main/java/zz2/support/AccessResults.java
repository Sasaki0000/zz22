package zz2.support;


import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AccessResults implements Serializable {

    private static final long serialVersionUID = 15009794820L;

    private Integer errcode;
    private String errmsg;
    private List<Map> value;

    public List<Map> getValue() {
        return value;
    }

    public void setValue(List<Map> value) {
        this.value = value;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int code) {
        this.errcode = code;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String message) {
        this.errmsg = message;
    }

    public AccessResults(){}

    public AccessResults(int code, String message, List<Map> value) {
        this.value = value;
        this.errcode = code;
        this.errmsg = message;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

