package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class ListDetailDto implements Serializable {
  
  private Integer id = null;
  private Integer firstStation = null;
  private String firstStationName = null;
  private Long leaveTime = null;
  private Integer lastStation = null;
  private String lastStationName = null;
  private Long arriveTime = null;
  private String via = null;
  private Integer seat = null;
  private Integer distance = null;
  private Integer status = null;
  private Long createTime = null;

  
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
   * 途经站
   **/
  public ListDetailDto via(String via) {
    this.via = via;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "途经站")
  @JsonProperty("via")
  public String getVia() {
    return via;
  }
  public void setVia(String via) {
    this.via = via;
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
   * 创建时间
   **/
  public ListDetailDto createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "创建时间")
  @JsonProperty("create_time")
  public Long getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDetailDto listDetail = (ListDetailDto) o;
    return Objects.equals(id, listDetail.id) &&
        Objects.equals(firstStation, listDetail.firstStation) &&
        Objects.equals(firstStationName, listDetail.firstStationName) &&
        Objects.equals(leaveTime, listDetail.leaveTime) &&
        Objects.equals(lastStation, listDetail.lastStation) &&
        Objects.equals(lastStationName, listDetail.lastStationName) &&
        Objects.equals(arriveTime, listDetail.arriveTime) &&
        Objects.equals(via, listDetail.via) &&
        Objects.equals(seat, listDetail.seat) &&
        Objects.equals(distance, listDetail.distance) &&
        Objects.equals(status, listDetail.status) &&
        Objects.equals(createTime, listDetail.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstStation, firstStationName, leaveTime, lastStation, lastStationName, arriveTime, via, seat, distance, status, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDetailDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstStation: ").append(toIndentedString(firstStation)).append("\n");
    sb.append("    firstStationName: ").append(toIndentedString(firstStationName)).append("\n");
    sb.append("    leaveTime: ").append(toIndentedString(leaveTime)).append("\n");
    sb.append("    lastStation: ").append(toIndentedString(lastStation)).append("\n");
    sb.append("    lastStationName: ").append(toIndentedString(lastStationName)).append("\n");
    sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

