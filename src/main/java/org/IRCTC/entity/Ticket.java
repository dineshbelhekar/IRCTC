package org.IRCTC.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;


@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Ticket {

    private String ticket_id;

    private String user_id;

    private String source;

    private String destination;

    private String date_of_travel;

    private Train train;

    private String ticket_info;


    public Ticket(String ticket_id,String user_id,
                  String source, String destination,
                  String date_of_travel,Train train,
                  String ticket_info){

        this.ticket_id = ticket_id;
        this.user_id = user_id;
        this.source = source;
        this.destination = destination;
        this.date_of_travel = date_of_travel;
        this.train = train;
        this.ticket_info = ticket_info;
    }

    public Ticket(){

    }
    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate_of_travel() {
        return date_of_travel;
    }

    public void setDate_of_travel(String date_of_travel) {
        this.date_of_travel = date_of_travel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTicket_info() {
        return ticket_info;
    }

    public void setTicket_info(String ticket_info) {
        this.ticket_info = ticket_info;
    }
}
