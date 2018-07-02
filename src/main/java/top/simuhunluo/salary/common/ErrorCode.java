package top.simuhunluo.salary.common;

public interface ErrorCode {
    int getCode();//错误码编号

    String getDescription();//错误描述

    String toString();
}
