package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetRegionRequestDto implements Serializable {
  
  private Integer parentId = null;

  
  /**
   **/
  public GetRegionRequestDto parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parent_id")
  public Integer getParentId() {
    return parentId;
  }
  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRegionRequestDto getRegionRequest = (GetRegionRequestDto) o;
    return Objects.equals(parentId, getRegionRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRegionRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

