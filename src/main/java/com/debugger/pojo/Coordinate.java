package com.debugger.pojo;

import java.io.Serializable;

/**
 * Created by Luyao on 2018/4/14.
 */
public class Coordinate implements Serializable {
    private double lon;
    private double lat;

    public Coordinate(){}

    public Coordinate(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
