package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class StationDetailDto implements Serializable {
  
  private Integer id = null;
  private String name = null;
  private Integer provinceId = null;
  private String province = null;
  private Integer cityId = null;
  private String city = null;
  private Integer sectionId = null;
  private String section = null;
  private String address = null;
  private Integer status = null;
  private String createTime = null;

  
  /**
   * 车站id（数据库主键）
   **/
  public StationDetailDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "车站id（数据库主键）")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * 车站名
   **/
  public StationDetailDto name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "车站名")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * 省编号
   **/
  public StationDetailDto provinceId(Integer provinceId) {
    this.provinceId = provinceId;
    return this;
  }


  @ApiModelProperty(example = "null", value = "省编号")
  @JsonProperty("provinceId")
  public Integer getProvinceId() {
    return provinceId;
  }
  public void setProvinceId(Integer provinceId) {
    this.provinceId = provinceId;
  }

  
  /**
   * 省名
   **/
  public StationDetailDto province(String province) {
    this.province = province;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "省名")
  @JsonProperty("province")
  public String getProvince() {
    return province;
  }
  public void setProvince(String province) {
    this.province = province;
  }

  
  /**
   * 市编号
   **/
  public StationDetailDto cityId(Integer cityId) {
    this.cityId = cityId;
    return this;
  }


  @ApiModelProperty(example = "null", value = "市编号")
  @JsonProperty("cityId")
  public Integer getCityId() {
    return cityId;
  }
  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }


  /**
   * 市名
   **/
  public StationDetailDto city(String city) {
    this.city = city;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "市名")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * 区编号
   **/
  public StationDetailDto sectionId(Integer sectionId) {
    this.sectionId = sectionId;
    return this;
  }


  @ApiModelProperty(example = "null", value = "区编号")
  @JsonProperty("sectionId")
  public Integer getSectionId() {
    return sectionId;
  }
  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  /**
   * 区名
   **/
  public StationDetailDto section(String section) {
    this.section = section;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "区名")
  @JsonProperty("section")
  public String getSection() {
    return section;
  }
  public void setSection(String section) {
    this.section = section;
  }

  
  /**
   * 详细地址
   **/
  public StationDetailDto address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "详细地址")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * 状态，1-启用，2-禁用
   **/
  public StationDetailDto status(Integer status) {
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
  public StationDetailDto createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "创建时间")
  @JsonProperty("createTime")
  public String getCreateTime() {
    return createTime;
  }
  public void setCreateTime(String createTime) {
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
    StationDetailDto stationDetail = (StationDetailDto) o;
    return Objects.equals(id, stationDetail.id) &&
        Objects.equals(name, stationDetail.name) &&
        Objects.equals(provinceId, stationDetail.provinceId) &&
        Objects.equals(province, stationDetail.province) &&
        Objects.equals(cityId, stationDetail.cityId) &&
        Objects.equals(city, stationDetail.city) &&
        Objects.equals(sectionId, stationDetail.sectionId) &&
        Objects.equals(section, stationDetail.section) &&
        Objects.equals(address, stationDetail.address) &&
        Objects.equals(status, stationDetail.status) &&
        Objects.equals(createTime, stationDetail.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, provinceId, province, cityId, city, sectionId, section, address, status, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StationDetailDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceId)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    sectionCode: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

