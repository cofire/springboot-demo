package com.cofire.disruptor.demo;

/**
 * @Description
 * @ClassName EventFactory
 * @Author Ly
 * @date 2020.05.21 09:58
 */
public class EventFactory implements com.lmax.disruptor.EventFactory<SeriesDataEvent> {

    @Override
    public SeriesDataEvent newInstance() {
        return new SeriesDataEvent();
    }
}
