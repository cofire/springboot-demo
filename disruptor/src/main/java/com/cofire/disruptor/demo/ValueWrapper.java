package com.cofire.disruptor.demo;

/**
 * @Description
 * @ClassName ValueWrapper
 * @Author Ly
 * @date 2020.05.21 09:57
 */
public abstract class ValueWrapper<T> {

    private T value;

    public ValueWrapper() {
    }

    public ValueWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
