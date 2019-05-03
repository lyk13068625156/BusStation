package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class SaveStationRequestDto implements Serializable {
  
  private String address = null;
  private String province = null;
  private String city = null;
  private String name = null;
  private Integer cityCode = null;
  private Integer sectionCode = null;
  private String section = null;
  private Integer id = null;
  private Integer provinceCode = null;
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
  public SaveStationRequestDto province(String province) {
    this.province = province;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("province")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  
  /**
   **/
  public SaveStationRequestDto city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
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
  public SaveStationRequestDto cityCode(Integer cityCode) {
    this.cityCode = cityCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city_code")
  public Integer getCityCode() {
    return cityCode;
  }
  public void setCityCode(Integer cityCode) {
    this.cityCode = cityCode;
  }

  
  /**
   **/
  public SaveStationRequestDto sectionCode(Integer sectionCode) {
    this.sectionCode = sectionCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("section_code")
  public Integer getSectionCode() {
    return sectionCode;
  }
  public void setSectionCode(Integer sectionCode) {
    this.sectionCode = sectionCode;
  }

  
  /**
   **/
  public SaveStationRequestDto section(String section) {
    this.section = section;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("section")
  public String getSection() {
    return section;
  }
  public void setSection(String section) {
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
  public SaveStationRequestDto provinceCode(Integer provinceCode) {
    this.provinceCode = provinceCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("province_code")
  public Integer getProvinceCode() {
    return provinceCode;
  }
  public void setProvinceCode(Integer provinceCode) {
    this.provinceCode = provinceCode;
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
        Objects.equals(province, saveStationRequest.province) &&
        Objects.equals(city, saveStationRequest.city) &&
        Objects.equals(name, saveStationRequest.name) &&
        Objects.equals(cityCode, saveStationRequest.cityCode) &&
        Objects.equals(sectionCode, saveStationRequest.sectionCode) &&
        Objects.equals(section, saveStationRequest.section) &&
        Objects.equals(id, saveStationRequest.id) &&
        Objects.equals(provinceCode, saveStationRequest.provinceCode) &&
        Objects.equals(status, saveStationRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, province, city, name, cityCode, sectionCode, section, id, provinceCode, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveStationRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    sectionCode: ").append(toIndentedString(sectionCode)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
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

