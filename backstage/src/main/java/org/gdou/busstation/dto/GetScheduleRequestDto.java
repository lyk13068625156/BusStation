package org.gdou.busstation.dto;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetScheduleRequestDto implements Serializable {
  
  private Integer startStationId = null;
  private String startStationName = null;
  private Integer listId = null;
  private Integer offset = null;
  private String endStationName = null;
  private Integer limit = null;
  private Integer id = null;
  private String listName = null;
  private Integer endStationId = null;
  private Date day = null;
  private Integer status = null;

  
  /**
   **/
  public GetScheduleRequestDto startStationId(Integer startStationId) {
    this.startStationId = startStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("start_station_id")
  public Integer getStartStationId() {
    return startStationId;
  }
  public void setStartStationId(Integer startStationId) {
    this.startStationId = startStationId;
  }

  
  /**
   **/
  public GetScheduleRequestDto startStationName(String startStationName) {
    this.startStationName = startStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("start_station_name")
  public String getStartStationName() {
    return startStationName;
  }
  public void setStartStationName(String startStationName) {
    this.startStationName = startStationName;
  }

  
  /**
   **/
  public GetScheduleRequestDto listId(Integer listId) {
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
  public GetScheduleRequestDto offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  
  /**
   **/
  public GetScheduleRequestDto endStationName(String endStationName) {
    this.endStationName = endStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("end_station_name")
  public String getEndStationName() {
    return endStationName;
  }
  public void setEndStationName(String endStationName) {
    this.endStationName = endStationName;
  }

  
  /**
   **/
  public GetScheduleRequestDto limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   **/
  public GetScheduleRequestDto id(Integer id) {
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
  public GetScheduleRequestDto listName(String listName) {
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
  public GetScheduleRequestDto endStationId(Integer endStationId) {
    this.endStationId = endStationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("end_station_id")
  public Integer getEndStationId() {
    return endStationId;
  }
  public void setEndStationId(Integer endStationId) {
    this.endStationId = endStationId;
  }

  
  /**
   **/
  public GetScheduleRequestDto day(Date day) {
    this.day = day;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("day")
  public Date getDay() {
    return day;
  }
  public void setDay(Date day) {
    this.day = day;
  }

  
  /**
   **/
  public GetScheduleRequestDto status(Integer status) {
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
    GetScheduleRequestDto getScheduleRequest = (GetScheduleRequestDto) o;
    return Objects.equals(startStationId, getScheduleRequest.startStationId) &&
        Objects.equals(startStationName, getScheduleRequest.startStationName) &&
        Objects.equals(listId, getScheduleRequest.listId) &&
        Objects.equals(offset, getScheduleRequest.offset) &&
        Objects.equals(endStationName, getScheduleRequest.endStationName) &&
        Objects.equals(limit, getScheduleRequest.limit) &&
        Objects.equals(id, getScheduleRequest.id) &&
        Objects.equals(listName, getScheduleRequest.listName) &&
        Objects.equals(endStationId, getScheduleRequest.endStationId) &&
        Objects.equals(day, getScheduleRequest.day) &&
        Objects.equals(status, getScheduleRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startStationId, startStationName, listId, offset, endStationName, limit, id, listName, endStationId, day, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduleRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startStationId: ").append(toIndentedString(startStationId)).append("\n");
    sb.append("    startStationName: ").append(toIndentedString(startStationName)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    endStationName: ").append(toIndentedString(endStationName)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    endStationId: ").append(toIndentedString(endStationId)).append("\n");
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

