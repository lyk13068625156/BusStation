package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class RegionDetailDto implements Serializable {
  
  private Integer id = null;
  private String regionName = null;

  
  /**
   * 地区id（数据库id）
   **/
  public RegionDetailDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "地区id（数据库id）")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * 地区名称
   **/
  public RegionDetailDto regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "地区名称")
  @JsonProperty("regionName")
  public String getRegionName() {
    return regionName;
  }
  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionDetailDto regionDetail = (RegionDetailDto) o;
    return Objects.equals(id, regionDetail.id) &&
        Objects.equals(regionName, regionDetail.regionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, regionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDetailDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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

