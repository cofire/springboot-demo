package com.cofire.disruptor.demo;

/**
 * @Description
 * @ClassName SeriesData
 * @Author Ly
 * @date 2020.05.21 09:59
 */
public class SeriesData {

    private String deviceInfoStr;

    public SeriesData() {
    }

    public SeriesData(String deviceInfoStr) {
        this.deviceInfoStr = deviceInfoStr;
    }

    public String getDeviceInfoStr() {
        return deviceInfoStr;
    }

    public void setDeviceInfoStr(String deviceInfoStr) {
        this.deviceInfoStr = deviceInfoStr;
    }

    @Override
    public String toString() {
        return "SeriesData{" +
                "deviceInfoStr='" + deviceInfoStr + '\'' +
                '}';
    }
}
