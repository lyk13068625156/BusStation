package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;




public class GetRegionResponseResultDto implements Serializable {
  
  private List<RegionDetailDto> items = new ArrayList<RegionDetailDto>();

  
  /**
   **/
  public GetRegionResponseResultDto items(List<RegionDetailDto> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<RegionDetailDto> getItems() {
    return items;
  }
  public void setItems(List<RegionDetailDto> items) {
    this.items = items;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRegionResponseResultDto getRegionResponseResult = (GetRegionResponseResultDto) o;
    return Objects.equals(items, getRegionResponseResult.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRegionResponseResultDto {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

