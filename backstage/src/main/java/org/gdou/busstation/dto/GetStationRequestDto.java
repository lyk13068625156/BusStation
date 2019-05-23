package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetStationRequestDto implements Serializable {
  
  private Integer province = null;
  private Integer offset = null;
  private Integer city = null;
  private String name = null;
  private Integer limit = null;
  private Integer section = null;
  private Integer id = null;
  private Integer status = null;

  
  /**
   **/
  public GetStationRequestDto province(Integer province) {
    this.province = province;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("province")
  public Integer getProvince() {
    return province;
  }
  public void setProvince(Integer province) {
    this.province = province;
  }

  
  /**
   **/
  public GetStationRequestDto offset(Integer offset) {
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
  public GetStationRequestDto city(Integer city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public Integer getCity() {
    return city;
  }
  public void setCity(Integer city) {
    this.city = city;
  }

  
  /**
   **/
  public GetStationRequestDto name(String name) {
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
  public GetStationRequestDto limit(Integer limit) {
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
  public GetStationRequestDto section(Integer section) {
    this.section = section;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("section")
  public Integer getSection() {
    return section;
  }
  public void setSection(Integer section) {
    this.section = section;
  }

  
  /**
   **/
  public GetStationRequestDto id(Integer id) {
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
  public GetStationRequestDto status(Integer status) {
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
    GetStationRequestDto getStationRequest = (GetStationRequestDto) o;
    return Objects.equals(province, getStationRequest.province) &&
        Objects.equals(offset, getStationRequest.offset) &&
        Objects.equals(city, getStationRequest.city) &&
        Objects.equals(name, getStationRequest.name) &&
        Objects.equals(limit, getStationRequest.limit) &&
        Objects.equals(section, getStationRequest.section) &&
        Objects.equals(id, getStationRequest.id) &&
        Objects.equals(status, getStationRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(province, offset, city, name, limit, section, id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStationRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

