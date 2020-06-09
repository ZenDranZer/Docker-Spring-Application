package com.zen.webApp;

public class ResultBean {
    private String result;

    public ResultBean(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "result=" + result;
    }
}
