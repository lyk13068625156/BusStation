package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class SaveStationRequestDto implements Serializable {
  
  private String address = null;
  private String name = null;
  private Integer cityId = null;
  private Integer sectionId = null;
  private Integer id = null;
  private Integer provinceId = null;
  private Integer status = null;

  
  /**
   **/
  public SaveStationRequestDto address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  
  /**
   **/
  public SaveStationRequestDto name(String name) {
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
  public SaveStationRequestDto cityId(Integer cityId) {
    this.cityId = cityId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city_code")
  public Integer getCityId() {
    return cityId;
  }
  public void setCityId(Integer cityCode) {
    this.cityId = cityId;
  }

  
  /**
   **/
  public SaveStationRequestDto sectionId(Integer sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sectionId")
  public Integer getSectionId() {
    return sectionId;
  }
  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }

  
  /**
   **/
  public SaveStationRequestDto id(Integer id) {
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
  public SaveStationRequestDto provinceId(Integer provinceId) {
    this.provinceId = provinceId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provinceId")
  public Integer getProvinceId() {
    return provinceId;
  }
  public void setProvinceId(Integer provinceId) {
    this.provinceId = provinceId;
  }

  
  /**
   **/
  public SaveStationRequestDto status(Integer status) {
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
    SaveStationRequestDto saveStationRequest = (SaveStationRequestDto) o;
    return Objects.equals(address, saveStationRequest.address) &&
        Objects.equals(name, saveStationRequest.name) &&
        Objects.equals(cityId, saveStationRequest.cityId) &&
        Objects.equals(sectionId, saveStationRequest.sectionId) &&
        Objects.equals(id, saveStationRequest.id) &&
        Objects.equals(provinceId, saveStationRequest.provinceId) &&
        Objects.equals(status, saveStationRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, cityId, sectionId, id, provinceId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveStationRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provinceId: ").append(toIndentedString(provinceId)).append("\n");
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

