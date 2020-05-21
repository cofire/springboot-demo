package com.cofire.disruptor.demo;

import com.lmax.disruptor.WorkHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @Description
 * @ClassName SeriesDataEventHandler
 * @Author Ly
 * @date 2020.05.21 10:01
 */
public class SeriesDataEventHandler implements WorkHandler<SeriesDataEvent> {

    private Logger logger = LoggerFactory.getLogger(SeriesDataEventHandler.class);

    @Override
    public void onEvent(SeriesDataEvent event) {
        if (event.getValue() == null || StringUtils.isEmpty(event.getValue().getDeviceInfoStr())) {
            logger.warn("receiver series data is empty!");
        } else if ("hello world!".equals(event.getValue().getDeviceInfoStr())) {
            logger.info(event.getValue().getDeviceInfoStr());
        } else {
            logger.error("Hey baby, hello world!");
        }

    }

}
