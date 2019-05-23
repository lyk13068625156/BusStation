package org.gdou.busstation.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class SaveListV2RequestDto {
    private Integer id;
    private String name;
    private Integer seat;
    private Integer status;
    List<Integer> station;
    List<Integer> distance;
    List<Double> price;
    @DateTimeFormat(pattern = "HH:mm:ss")
    List<LocalTime> leaveTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Integer> getStation() {
        return station;
    }

    public void setStation(List<Integer> station) {
        this.station = station;
    }

    public List<Integer> getDistance() {
        return distance;
    }

    public void setDistance(List<Integer> distance) {
        this.distance = distance;
    }

    public List<Double> getPrice() {
        return price;
    }

    public void setPrice(List<Double> price) {
        this.price = price;
    }

    public List<LocalTime> getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(List<LocalTime> leaveTime) {
        this.leaveTime = leaveTime;
    }
}
