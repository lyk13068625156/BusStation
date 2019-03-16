package org.gdou.busstation.Util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DTO {

    public Integer errCode = -1;

    public String errMsg = "error";

    public Object result;

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String toJson(){
        return JSON.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

}
