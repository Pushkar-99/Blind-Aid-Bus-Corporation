package com.example.blindaidbuscorporation;

import java.util.Date;

public class Note {

    private String source;
    private String destination;
    private String bus_number;
    private String arrival_time;
    private Date departure_time;
    private String travel_time;

    public Note(){
        //public no-arg constructor needed
    }

    public Note(String source, String destination, String bus_number, String arrival_time,
                Date departure_time, String travel_time ){
        this.source = source;
        this.destination = destination;
        this.bus_number = bus_number;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.travel_time = travel_time;

    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getBus_number() {
        return bus_number;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public String getTravel_time() {
        return travel_time;
    }

}
