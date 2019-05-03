package org.gdou.busstation.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "station")
public class List implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private Integer name;

    @Column(name = "first_station")
    private Integer firstStation;

    @Column(name = "first_station_name")
    private String firstStationName;

    @Column(name = "leave_time")
    private Date leaveTime;

    @Column(name = "last_station")
    private Integer lastStation;

    @Column(name = "last_station_name")
    private String lastStationName;

    @Column(name = "arrive_time")
    private Date arriveTime;

    @Column(name = "via")
    private String via;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "price")
    private Double price;

    @Column(name = "distance")
    private Integer distance;

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

    public Integer getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(Integer firstStation) {
        this.firstStation = firstStation;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getLastStation() {
        return lastStation;
    }

    public void setLastStation(Integer lastStation) {
        this.lastStation = lastStation;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
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
