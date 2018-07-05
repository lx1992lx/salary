package top.simuhunluo.salary.utils;

import top.simuhunluo.salary.common.ErrorCode;
import top.simuhunluo.salary.dao.model.ResultObject;

public class ResultUtils {

    //without exception
    public static ResultObject out(ErrorCode errorCode, Object obj) {
        return new ResultObject(errorCode.getCode(), errorCode.getDescription(), obj);
    }

    //with exception
    public static ResultObject out(ErrorCode errorCode,String exceptionMessage){
        ResultObject resultObject=new ResultObject();
        resultObject.setCode(errorCode.getCode());
        resultObject.setDescription(errorCode.getDescription()+"Exception:"+exceptionMessage);
        return resultObject;
    }
}
