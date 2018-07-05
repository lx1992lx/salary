package top.simuhunluo.salary.exception;

import top.simuhunluo.salary.common.ErrorCode;

// TODO 自定义异常
public class SalaryException extends RuntimeException {
    private ErrorCode errorCode;

    public SalaryException(ErrorCode errorCode) {
        super(errorCode.toString());
        this.errorCode = errorCode;

    }
}
