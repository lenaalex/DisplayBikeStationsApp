package com.example.displaybikestationsapp;

public class BikeStation {
    private int station_id;
    private String name;
    private String address;
    private double lat;
    private double lon;
    private int capacity;


    public BikeStation(int station_id, String name, String address, double lat, double lon, int capacity) {
        this.station_id = station_id;
        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lon = lon;
        this.capacity= capacity;
    }
    public String getName() {
        return  name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStation_id()
    {
        return station_id;
    }
    public String getAddress() {
        return address;
    }
    public double getLat()
    {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon(){
        return lon;
    }

    public int getCapacity() {
        return capacity;
    }
}
