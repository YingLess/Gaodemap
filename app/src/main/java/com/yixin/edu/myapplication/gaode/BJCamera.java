package com.yixin.edu.myapplication.gaode;

/**
 * Created by Administrator on 2019/4/22/022.
 */

/**
 * Entity mapped to table "BJCAMERA".
 */
public class BJCamera {

    private Long id;
    /** Not-null value. */
    private String name;
    private String address;
    private Double latitude;
    private Double longtitude;
    private String direction;

    public BJCamera() {
    }

    public BJCamera(Long id) {
        this.id = id;
    }

    public BJCamera(Long id, String name, String address, Double latitude, Double longtitude, String direction) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.direction = direction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

}
