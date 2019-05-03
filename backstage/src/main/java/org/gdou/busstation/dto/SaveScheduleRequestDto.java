package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class SaveScheduleRequestDto implements Serializable {
  
  private Integer leaveTime = null;
  private Integer nextStationId = null;
  private Integer listId = null;
  private Integer distance = null;
  private String thisStationName = null;
  private String listName = null;
  private Integer seat = null;
  private String price = null;
  private Integer thisStationId = null;
  private Integer id = null;
  private String nextStationName = null;
  private String day = null;
  private Integer status = null;

  
  /**
   **/
  public SaveScheduleRequestDto leaveTime(Integer leaveTime) {
    this.leaveTime = leaveTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leave_time")
  public Integer getLeaveTime() {
    return leaveTime;
  }
  public void setLeaveTime(Integer leaveTime) {
    this.leaveTime = leaveTime;
  }

  
  /**
   **/
  public SaveScheduleRequestDto nextStationId(Integer nextStationId) {
    this.nextStationId = nextStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("next_station_id")
  public Integer getNextStationId() {
    return nextStationId;
  }
  public void setNextStationId(Integer nextStationId) {
    this.nextStationId = nextStationId;
  }

  
  /**
   **/
  public SaveScheduleRequestDto listId(Integer listId) {
    this.listId = listId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("list_id")
  public Integer getListId() {
    return listId;
  }
  public void setListId(Integer listId) {
    this.listId = listId;
  }

  
  /**
   **/
  public SaveScheduleRequestDto distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("distance")
  public Integer getDistance() {
    return distance;
  }
  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  
  /**
   **/
  public SaveScheduleRequestDto thisStationName(String thisStationName) {
    this.thisStationName = thisStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("this_station_name")
  public String getThisStationName() {
    return thisStationName;
  }
  public void setThisStationName(String thisStationName) {
    this.thisStationName = thisStationName;
  }

  
  /**
   **/
  public SaveScheduleRequestDto listName(String listName) {
    this.listName = listName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("list_name")
  public String getListName() {
    return listName;
  }
  public void setListName(String listName) {
    this.listName = listName;
  }

  
  /**
   **/
  public SaveScheduleRequestDto seat(Integer seat) {
    this.seat = seat;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("seat")
  public Integer getSeat() {
    return seat;
  }
  public void setSeat(Integer seat) {
    this.seat = seat;
  }

  
  /**
   **/
  public SaveScheduleRequestDto price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  
  /**
   **/
  public SaveScheduleRequestDto thisStationId(Integer thisStationId) {
    this.thisStationId = thisStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("this_station_id")
  public Integer getThisStationId() {
    return thisStationId;
  }
  public void setThisStationId(Integer thisStationId) {
    this.thisStationId = thisStationId;
  }

  
  /**
   **/
  public SaveScheduleRequestDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  public SaveScheduleRequestDto nextStationName(String nextStationName) {
    this.nextStationName = nextStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("next_station_name")
  public String getNextStationName() {
    return nextStationName;
  }
  public void setNextStationName(String nextStationName) {
    this.nextStationName = nextStationName;
  }

  
  /**
   **/
  public SaveScheduleRequestDto day(String day) {
    this.day = day;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("day")
  public String getDay() {
    return day;
  }
  public void setDay(String day) {
    this.day = day;
  }

  
  /**
   **/
  public SaveScheduleRequestDto status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveScheduleRequestDto saveScheduleRequest = (SaveScheduleRequestDto) o;
    return Objects.equals(leaveTime, saveScheduleRequest.leaveTime) &&
        Objects.equals(nextStationId, saveScheduleRequest.nextStationId) &&
        Objects.equals(listId, saveScheduleRequest.listId) &&
        Objects.equals(distance, saveScheduleRequest.distance) &&
        Objects.equals(thisStationName, saveScheduleRequest.thisStationName) &&
        Objects.equals(listName, saveScheduleRequest.listName) &&
        Objects.equals(seat, saveScheduleRequest.seat) &&
        Objects.equals(price, saveScheduleRequest.price) &&
        Objects.equals(thisStationId, saveScheduleRequest.thisStationId) &&
        Objects.equals(id, saveScheduleRequest.id) &&
        Objects.equals(nextStationName, saveScheduleRequest.nextStationName) &&
        Objects.equals(day, saveScheduleRequest.day) &&
        Objects.equals(status, saveScheduleRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTime, nextStationId, listId, distance, thisStationName, listName, seat, price, thisStationId, id, nextStationName, day, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveScheduleRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    leaveTime: ").append(toIndentedString(leaveTime)).append("\n");
    sb.append("    nextStationId: ").append(toIndentedString(nextStationId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    thisStationName: ").append(toIndentedString(thisStationName)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    thisStationId: ").append(toIndentedString(thisStationId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextStationName: ").append(toIndentedString(nextStationName)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

