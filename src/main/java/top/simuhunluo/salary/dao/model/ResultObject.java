package top.simuhunluo.salary.dao.model;

public class ResultObject {
    private int code;
    private String description;
    private Object object;

    public ResultObject(){}

    public ResultObject(int code, String message, Object object) {
        setCode(code);
        setDescription(message);
        setObject(object);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
