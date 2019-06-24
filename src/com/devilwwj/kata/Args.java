package com.devilwwj.kata;

/**
 * Question: https://github.com/codingkata/kata-puzzle/blob/master/01.args.md.
 *
 * @author wenjiewu
 */
public class Args<T> {

    private String flag;
    private T value;

    public Args(String flag) {
        this.flag = flag;
    }

    public T getValue() {
        return value;
    }

    public String getFlag() {
        return flag;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
