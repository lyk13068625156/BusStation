package org.gdou.busstation.model;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Table(name = "schedule")
public class Schedule implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "list_id")
    private Integer listId;

    @Column(name = "list_name")
    private Integer listName;

    @Column(name = "this_station_id")
    private Integer thisStationId;

    @Column(name = "day")
    private Date day;

    @Column(name = "this_station_name")
    private String thisStationName;

    @Column(name = "leave_time")
    private Date leaveTime;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "next_station_id")
    private Integer nextStationId;

    @Column(name = "next_station_name")
    private String nextStationName;

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

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getThisStationName() {
        return thisStationName;
    }

    public void setThisStationName(String thisStationName) {
        this.thisStationName = thisStationName;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
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

    public String getNextStationName() {
        return nextStationName;
    }

    public void setNextStationName(String nextStationName) {
        this.nextStationName = nextStationName;
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

    public Integer getListName() {
        return listName;
    }

    public void setListName(Integer listName) {
        this.listName = listName;
    }
}
