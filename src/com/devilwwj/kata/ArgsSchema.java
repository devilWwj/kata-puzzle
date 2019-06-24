package com.devilwwj.kata;

public class ArgsSchema {
    private String flag;
    private String type;
    private String defaultValue;

    public void setArgument(String flag, String type, String defaultVaule) {
        this.flag = flag;
        this.type = type;
        this.defaultValue = defaultVaule;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
