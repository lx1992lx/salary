package top.simuhunluo.salary.exception;

import top.simuhunluo.salary.common.ErrorCode;

public enum CommonErrorCode implements ErrorCode {

    SUCCESS(0, "成功"),
    RESULT_NOT_EXIST(101, "查询结果为空"),

    FAIL(-1, "失败");

    private int code;
    private String description;

    CommonErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("code:[%d],description:[%s]",
                this.code,
                this.description);
    }
}
