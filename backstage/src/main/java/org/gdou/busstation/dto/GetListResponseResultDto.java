package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;




public class GetListResponseResultDto implements Serializable {
  
  private Integer total = null;
  private List<ListDetailDto> items = new ArrayList<ListDetailDto>();

  
  /**
   **/
  public GetListResponseResultDto total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   **/
  public GetListResponseResultDto items(List<ListDetailDto> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<ListDetailDto> getItems() {
    return items;
  }
  public void setItems(List<ListDetailDto> items) {
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
    GetListResponseResultDto getListResponseResult = (GetListResponseResultDto) o;
    return Objects.equals(total, getListResponseResult.total) &&
        Objects.equals(items, getListResponseResult.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListResponseResultDto {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

