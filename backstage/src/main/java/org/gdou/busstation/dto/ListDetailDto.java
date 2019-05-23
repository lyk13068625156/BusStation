package org.gdou.busstation.dto;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class ListDetailDto implements Serializable {

  private Integer id = null;
  private String name = null;
  private Integer firstStation = null;
  private String firstStationName = null;
  private Long leaveTime = null;
  private Integer lastStation = null;
  private String lastStationName = null;
  private Long arriveTime = null;
  private List<Integer> viaId = null;
  private List<String> viaName = null;
  private String via = null;
  private Integer seat = null;
  private Integer distance = null;
  private Integer status = null;
  private Double price = null;
  private String createTime = null;


  /**
   * 车次id（数据库主键）
   **/
  public ListDetailDto id(Integer id) {
    this.id = id;
    return this;
  }


  @ApiModelProperty(example = "null", value = "车次id（数据库主键）")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 车次名
   **/
  public ListDetailDto name(String name) {
    this.name = name;
    return this;
  }

  public String getVia() {
    return via;
  }

  public void setVia(String via) {
    this.via = via;
  }

  @ApiModelProperty(example = "null", value = "车次名")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * 始发站id
   **/
  public ListDetailDto firstStation(Integer firstStation) {
    this.firstStation = firstStation;
    return this;
  }


  @ApiModelProperty(example = "null", value = "始发站id")
  @JsonProperty("first_station")
  public Integer getFirstStation() {
    return firstStation;
  }

  public void setFirstStation(Integer firstStation) {
    this.firstStation = firstStation;
  }


  /**
   * 始发站名
   **/
  public ListDetailDto firstStationName(String firstStationName) {
    this.firstStationName = firstStationName;
    return this;
  }


  @ApiModelProperty(example = "null", value = "始发站名")
  @JsonProperty("first_station_name")
  public String getFirstStationName() {
    return firstStationName;
  }

  public void setFirstStationName(String firstStationName) {
    this.firstStationName = firstStationName;
  }


  /**
   * 出发时间
   **/
  public ListDetailDto leaveTime(Long leaveTime) {
    this.leaveTime = leaveTime;
    return this;
  }


  @ApiModelProperty(example = "null", value = "出发时间")
  @JsonProperty("leave_time")
  public Long getLeaveTime() {
    return leaveTime;
  }

  public void setLeaveTime(Long leaveTime) {
    this.leaveTime = leaveTime;
  }


  /**
   * 终点站id
   **/
  public ListDetailDto lastStation(Integer lastStation) {
    this.lastStation = lastStation;
    return this;
  }


  @ApiModelProperty(example = "null", value = "终点站id")
  @JsonProperty("last_station")
  public Integer getLastStation() {
    return lastStation;
  }

  public void setLastStation(Integer lastStation) {
    this.lastStation = lastStation;
  }


  /**
   * 终点站名
   **/
  public ListDetailDto lastStationName(String lastStationName) {
    this.lastStationName = lastStationName;
    return this;
  }


  @ApiModelProperty(example = "null", value = "终点站名")
  @JsonProperty("last_station_name")
  public String getLastStationName() {
    return lastStationName;
  }

  public void setLastStationName(String lastStationName) {
    this.lastStationName = lastStationName;
  }


  /**
   * 到站时间
   **/
  public ListDetailDto arriveTime(Long arriveTime) {
    this.arriveTime = arriveTime;
    return this;
  }


  @ApiModelProperty(example = "null", value = "到站时间")
  @JsonProperty("arrive_time")
  public Long getArriveTime() {
    return arriveTime;
  }

  public void setArriveTime(Long arriveTime) {
    this.arriveTime = arriveTime;
  }


  /**
   * 途经站名
   **/
  public ListDetailDto viaName(List<String> viaName) {
    this.viaName = viaName;
    return this;
  }


  @ApiModelProperty(example = "null", value = "途经站名")
  @JsonProperty("viaName")
  public List<String> getViaName() {
    return viaName;
  }

  public void setViaName(List<String> viaName) {
    this.viaName = viaName;
  }


  /**
   * 途经站id
   **/
  public ListDetailDto viaId(List<Integer> viaId) {
    this.viaId = viaId;
    return this;
  }


  @ApiModelProperty(example = "null", value = "途经站id")
  @JsonProperty("viaId")
  public List<Integer> getViaId() {
    return viaId;
  }

  public void setViaId(List<Integer> viaId) {
    this.viaId = viaId;
  }


  /**
   * 座位数
   **/
  public ListDetailDto seat(Integer seat) {
    this.seat = seat;
    return this;
  }


  @ApiModelProperty(example = "null", value = "座位数")
  @JsonProperty("seat")
  public Integer getSeat() {
    return seat;
  }

  public void setSeat(Integer seat) {
    this.seat = seat;
  }


  /**
   * 距离
   **/
  public ListDetailDto distance(Integer distance) {
    this.distance = distance;
    return this;
  }


  @ApiModelProperty(example = "null", value = "距离")
  @JsonProperty("distance")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  /**
   * 状态，1-启用，2-禁用
   **/
  public ListDetailDto status(Integer status) {
    this.status = status;
    return this;
  }


  @ApiModelProperty(example = "null", value = "状态，1-启用，2-禁用")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * 总价
   **/
  public ListDetailDto price(Double price) {
    this.price = price;
    return this;
  }


  @ApiModelProperty(example = "null", value = "总价")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  /**
   * 创建时间
   **/
  public ListDetailDto createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }


  @ApiModelProperty(example = "null", value = "创建时间")
  @JsonProperty("createTime")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

}