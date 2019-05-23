package org.gdou.busstation.model;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Table(name = "schedule")
public class Schedule implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "list_id")
    private Integer listId;

    @Column(name = "this_station_id")
    private Integer thisStationId;

    @Column(name = "day")
    private LocalDate day;

    @Column(name = "leave_time")
    private LocalTime leaveTime;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "next_station_id")
    private Integer nextStationId;

    @Column(name = "distance")
    private Integer distance;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getThisStationId() {
        return thisStationId;
    }

    public void setThisStationId(Integer thisStationId) {
        this.thisStationId = thisStationId;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public LocalTime getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(LocalTime leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getNextStationId() {
        return nextStationId;
    }

    public void setNextStationId(Integer nextStationId) {
        this.nextStationId = nextStationId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
