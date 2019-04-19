package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class GetUserResponseResultDto implements Serializable {
  
  private Integer total = null;
  private List<UserDetailDto> items = new ArrayList<UserDetailDto>();

  
  /**
   **/
  public GetUserResponseResultDto total(Integer total) {
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
  public GetUserResponseResultDto items(List<UserDetailDto> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<UserDetailDto> getItems() {
    return items;
  }
  public void setItems(List<UserDetailDto> items) {
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
    GetUserResponseResultDto getUserResponseResult = (GetUserResponseResultDto) o;
    return Objects.equals(total, getUserResponseResult.total) &&
        Objects.equals(items, getUserResponseResult.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserResponseResultDto {\n");
    
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

