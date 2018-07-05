package top.simuhunluo.salary.exception;

import top.simuhunluo.salary.common.ErrorCode;

public class SalaryException extends RuntimeException {
    private ErrorCode errorCode;

    public SalaryException(ErrorCode errorCode) {
        super(errorCode.toString());
        this.errorCode=errorCode;
    }
}
