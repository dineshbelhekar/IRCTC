package org.IRCTC.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

import java.sql.Time;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Train {

    private String train_id;

    private String train_no;

    private List<List<Integer>> seats;

    private Map<String,Time> station_times;

    private List<String> stations;

    private String train_info;

    private String ticket_info;

    public Train(String train_id, String train_no,List<List<Integer>> seats,
                 Map<String, Time> station_times, List<String> stations,
                 String train_info, String ticket_info ){
        this.train_id = train_id;
        this.train_no = train_no;
        this.seats = seats;
        this.station_times = station_times;
        this.stations = stations;
        this.train_info = train_info;
        this.ticket_info = ticket_info;
    }

    public Train(){

    }

    public Map<String, Time> getStation_times() {
        return station_times;
    }

    public void setStation_times(Map<String, Time> station_times) {
        this.station_times = station_times;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String train_no) {
        this.train_no = train_no;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getTrain_info() {
        return train_info;
    }

    public void setTrain_info(String train_info) {
        this.train_info = train_info;
    }

    public String getTicket_info() {
        return ticket_info;
    }

    public void setTicket_info(String ticket_info) {
        this.ticket_info = ticket_info;
    }
}
