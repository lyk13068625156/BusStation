package org.gdou.busstation.dto;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class SaveListRequestDto implements Serializable {
  
  private Integer seat = null;
  private Integer firstStation = null;
  private String firstStationName = null;
  private Date leaveTime = null;
  private Integer distance = null;
  private Double price = null;
  private String lastStationName = null;
  private Integer id = null;
  private String name = null;
  private Integer lastStation = null;
  private Date arriveTime = null;
  private String via = null;
  private Integer status = null;

  
  /**
   **/
  public SaveListRequestDto seat(Integer seat) {
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
  public SaveListRequestDto firstStation(Integer firstStation) {
    this.firstStation = firstStation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("first_station")
  public Integer getFirstStation() {
    return firstStation;
  }
  public void setFirstStation(Integer firstStation) {
    this.firstStation = firstStation;
  }

  
  /**
   **/
  public SaveListRequestDto firstStationName(String firstStationName) {
    this.firstStationName = firstStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("first_station_name")
  public String getFirstStationName() {
    return firstStationName;
  }
  public void setFirstStationName(String firstStationName) {
    this.firstStationName = firstStationName;
  }

  
  /**
   **/
  public SaveListRequestDto leaveTime(Date leaveTime) {
    this.leaveTime = leaveTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leave_time")
  public Date getLeaveTime() {
    return leaveTime;
  }
  public void setLeaveTime(Date leaveTime) {
    this.leaveTime = leaveTime;
  }

  
  /**
   **/
  public SaveListRequestDto distance(Integer distance) {
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
  public SaveListRequestDto price(Double price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  
  /**
   **/
  public SaveListRequestDto lastStationName(String lastStationName) {
    this.lastStationName = lastStationName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last_station_name")
  public String getLastStationName() {
    return lastStationName;
  }
  public void setLastStationName(String lastStationName) {
    this.lastStationName = lastStationName;
  }

  /**
   **/
  public SaveListRequestDto name(String name) {
    this.name = name;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public SaveListRequestDto id(Integer id) {
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
  public SaveListRequestDto lastStation(Integer lastStation) {
    this.lastStation = lastStation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("last_station")
  public Integer getLastStation() {
    return lastStation;
  }
  public void setLastStation(Integer lastStation) {
    this.lastStation = lastStation;
  }

  
  /**
   **/
  public SaveListRequestDto arriveTime(Date arriveTime) {
    this.arriveTime = arriveTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("arrive_time")
  public Date getArriveTime() {
    return arriveTime;
  }
  public void setArriveTime(Date arriveTime) {
    this.arriveTime = arriveTime;
  }

  
  /**
   **/
  public SaveListRequestDto via(String via) {
    this.via = via;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("via")
  public String getVia() {
    return via;
  }
  public void setVia(String via) {
    this.via = via;
  }

  
  /**
   **/
  public SaveListRequestDto status(Integer status) {
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
    SaveListRequestDto saveListRequest = (SaveListRequestDto) o;
    return Objects.equals(seat, saveListRequest.seat) &&
        Objects.equals(firstStation, saveListRequest.firstStation) &&
        Objects.equals(firstStationName, saveListRequest.firstStationName) &&
        Objects.equals(leaveTime, saveListRequest.leaveTime) &&
        Objects.equals(distance, saveListRequest.distance) &&
        Objects.equals(price, saveListRequest.price) &&
        Objects.equals(lastStationName, saveListRequest.lastStationName) &&
        Objects.equals(id, saveListRequest.id) &&
        Objects.equals(lastStation, saveListRequest.lastStation) &&
        Objects.equals(arriveTime, saveListRequest.arriveTime) &&
        Objects.equals(via, saveListRequest.via) &&
        Objects.equals(status, saveListRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seat, firstStation, firstStationName, leaveTime, distance, price, lastStationName, id, lastStation, arriveTime, via, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveListRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    firstStation: ").append(toIndentedString(firstStation)).append("\n");
    sb.append("    firstStationName: ").append(toIndentedString(firstStationName)).append("\n");
    sb.append("    leaveTime: ").append(toIndentedString(leaveTime)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    lastStationName: ").append(toIndentedString(lastStationName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStation: ").append(toIndentedString(lastStation)).append("\n");
    sb.append("    arriveTime: ").append(toIndentedString(arriveTime)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
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

