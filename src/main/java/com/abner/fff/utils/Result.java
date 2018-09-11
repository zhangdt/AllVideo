package com.abner.fff.utils;

public class Result<T> {
    public Result(T data, String messgae, Code code) {
        this.setCode(code.getCode());
        this.setData(data);
        this.setMessgae(messgae);
    }
    public enum  Code{
        OK(200),
        ERR(-1);
        private int code;
        Code(int code)
        {
            this.code = code;
        }
        public int getCode() {
            return code;
        }
    }

    private T data;
    private int code;
    private String messgae;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public static <T> Result<T> ok(T data) {
        return new Result(data, "ok", Code.OK);
    }

    public static <T> Result<T> error(T data,String errorMsg) {

        return new Result(data, errorMsg, Code.ERR );

    }

}
