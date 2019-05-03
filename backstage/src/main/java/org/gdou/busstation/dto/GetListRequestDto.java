package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetListRequestDto implements Serializable {
  
  private String firstStationName = null;
  private Integer offset = null;
  private Integer limit = null;
  private String lastStationName = null;
  private Integer id = null;
  private String name = null;
  private String via = null;
  private Integer status = null;

  
  /**
   **/
  public GetListRequestDto firstStationName(String firstStationName) {
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
  public GetListRequestDto offset(Integer offset) {
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
  public GetListRequestDto limit(Integer limit) {
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
  public GetListRequestDto lastStationName(String lastStationName) {
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
  public GetListRequestDto name(String name) {
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
  public GetListRequestDto id(Integer id) {
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
  public GetListRequestDto via(String via) {
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
  public GetListRequestDto status(Integer status) {
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
    GetListRequestDto getListRequest = (GetListRequestDto) o;
    return Objects.equals(firstStationName, getListRequest.firstStationName) &&
        Objects.equals(offset, getListRequest.offset) &&
        Objects.equals(limit, getListRequest.limit) &&
        Objects.equals(lastStationName, getListRequest.lastStationName) &&
        Objects.equals(id, getListRequest.id) &&
        Objects.equals(via, getListRequest.via) &&
        Objects.equals(status, getListRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstStationName, offset, limit, lastStationName, id, via, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    firstStationName: ").append(toIndentedString(firstStationName)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    lastStationName: ").append(toIndentedString(lastStationName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

