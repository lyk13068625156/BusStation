package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class SaveStationRequestDto implements Serializable {
  
  private String address = null;
  private String name = null;
  private Integer city = null;
  private Integer section = null;
  private Integer id = null;
  private Integer province = null;
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
  public SaveStationRequestDto city(Integer city) {
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
  public SaveStationRequestDto section(Integer section) {
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
  public SaveStationRequestDto province(Integer province) {
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
        Objects.equals(city, saveStationRequest.city) &&
        Objects.equals(section, saveStationRequest.section) &&
        Objects.equals(id, saveStationRequest.id) &&
        Objects.equals(province, saveStationRequest.province) &&
        Objects.equals(status, saveStationRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, city, section, id, province, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveStationRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cityId: ").append(toIndentedString(city)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(section)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provinceId: ").append(toIndentedString(province)).append("\n");
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

