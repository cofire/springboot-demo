package com.cofire.disruptor;

import com.cofire.disruptor.demo.SeriesData;
import com.cofire.disruptor.demo.SeriesDataEventQueueHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName DisruptorController
 * @Author Ly
 * @date 2020.05.21 10:17
 */
@RestController
public class DisruptorController {

    @Autowired
    private SeriesDataEventQueueHelper seriesDataEventQueueHelper;

    @GetMapping("/api/test")
    public void demo() {
        seriesDataEventQueueHelper.publishEvent(new SeriesData(""));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world!"));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world!"));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world!"));

    }

    @GetMapping("/api/test2")
    public void demo2() {
        System.out.println("2223333!");
        seriesDataEventQueueHelper.publishEvent(new SeriesData(""));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world2!"));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world!"));
        seriesDataEventQueueHelper.publishEvent(new SeriesData("hello world23!"));

    }

}
