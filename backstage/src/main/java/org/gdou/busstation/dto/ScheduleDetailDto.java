package org.gdou.busstation.dto;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class ScheduleDetailDto implements Serializable {
  
  private Integer listId = null;
  private String listName = null;
  private Integer thisStationId = null;
  private String thisStationName = null;
  private Date day = null;
  private Date leaveTime = null;
  private Integer seat = null;
  private Integer nextStationId = null;
  private String nextStationName = null;
  private Integer distance = null;
  private Double price = null;
  private Integer status = null;
  private Date createTime = null;

  
  /**
   * 车次id
   **/
  public ScheduleDetailDto listId(Integer listId) {
    this.listId = listId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "车次id")
  @JsonProperty("list_id")
  public Integer getListId() {
    return listId;
  }
  public void setListId(Integer listId) {
    this.listId = listId;
  }

  
  /**
   * 车次名称
   **/
  public ScheduleDetailDto listName(String listName) {
    this.listName = listName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "车次名称")
  @JsonProperty("list_name")
  public String getListName() {
    return listName;
  }
  public void setListName(String listName) {
    this.listName = listName;
  }

  
  /**
   * 出发站id
   **/
  public ScheduleDetailDto thisStationId(Integer thisStationId) {
    this.thisStationId = thisStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "出发站id")
  @JsonProperty("this_station_id")
  public Integer getThisStationId() {
    return thisStationId;
  }
  public void setThisStationId(Integer thisStationId) {
    this.thisStationId = thisStationId;
  }

  
  /**
   * 出发站名称
   **/
  public ScheduleDetailDto thisStationName(String thisStationName) {
    this.thisStationName = thisStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "出发站名称")
  @JsonProperty("this_station_name")
  public String getThisStationName() {
    return thisStationName;
  }
  public void setThisStationName(String thisStationName) {
    this.thisStationName = thisStationName;
  }

  
  /**
   * 日期
   **/
  public ScheduleDetailDto day(Date day) {
    this.day = day;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "日期")
  @JsonProperty("day")
  public Date getDay() {
    return day;
  }
  public void setDay(Date day) {
    this.day = day;
  }

  
  /**
   * 出发时间
   **/
  public ScheduleDetailDto leaveTime(Date leaveTime) {
    this.leaveTime = leaveTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "出发时间")
  @JsonProperty("leave_time")
  public Date getLeaveTime() {
    return leaveTime;
  }
  public void setLeaveTime(Date leaveTime) {
    this.leaveTime = leaveTime;
  }

  
  /**
   * 座位数
   **/
  public ScheduleDetailDto seat(Integer seat) {
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
   * 下一站id
   **/
  public ScheduleDetailDto nextStationId(Integer nextStationId) {
    this.nextStationId = nextStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "下一站id")
  @JsonProperty("next_station_id")
  public Integer getNextStationId() {
    return nextStationId;
  }
  public void setNextStationId(Integer nextStationId) {
    this.nextStationId = nextStationId;
  }

  
  /**
   * 下一站名称
   **/
  public ScheduleDetailDto nextStationName(String nextStationName) {
    this.nextStationName = nextStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "下一站名称")
  @JsonProperty("next_station_name")
  public String getNextStationName() {
    return nextStationName;
  }
  public void setNextStationName(String nextStationName) {
    this.nextStationName = nextStationName;
  }

  
  /**
   * 距离
   **/
  public ScheduleDetailDto distance(Integer distance) {
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
   * 价钱
   **/
  public ScheduleDetailDto price(Double price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "价钱")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  
  /**
   * 状态，1-启用，2-禁用
   **/
  public ScheduleDetailDto status(Integer status) {
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
  public ScheduleDetailDto createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "创建时间")
  @JsonProperty("create_time")
  public Date getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Date createTime) {
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
    ScheduleDetailDto scheduleDetail = (ScheduleDetailDto) o;
    return Objects.equals(listId, scheduleDetail.listId) &&
        Objects.equals(listName, scheduleDetail.listName) &&
        Objects.equals(thisStationId, scheduleDetail.thisStationId) &&
        Objects.equals(thisStationName, scheduleDetail.thisStationName) &&
        Objects.equals(day, scheduleDetail.day) &&
        Objects.equals(leaveTime, scheduleDetail.leaveTime) &&
        Objects.equals(seat, scheduleDetail.seat) &&
        Objects.equals(nextStationId, scheduleDetail.nextStationId) &&
        Objects.equals(nextStationName, scheduleDetail.nextStationName) &&
        Objects.equals(distance, scheduleDetail.distance) &&
        Objects.equals(price, scheduleDetail.price) &&
        Objects.equals(status, scheduleDetail.status) &&
        Objects.equals(createTime, scheduleDetail.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listName, thisStationId, thisStationName, day, leaveTime, seat, nextStationId, nextStationName, distance, price, status, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDetailDto {\n");
    
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    thisStationId: ").append(toIndentedString(thisStationId)).append("\n");
    sb.append("    thisStationName: ").append(toIndentedString(thisStationName)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    leaveTime: ").append(toIndentedString(leaveTime)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    nextStationId: ").append(toIndentedString(nextStationId)).append("\n");
    sb.append("    nextStationName: ").append(toIndentedString(nextStationName)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

