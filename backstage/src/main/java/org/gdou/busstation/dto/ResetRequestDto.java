package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ResetRequestDto implements Serializable {
  
  private ResetInputDto resetInput = null;

  
  /**
   **/
  public ResetRequestDto resetInput(ResetInputDto resetInput) {
    this.resetInput = resetInput;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reset_input")
  public ResetInputDto getResetInput() {
    return resetInput;
  }
  public void setResetInput(ResetInputDto resetInput) {
    this.resetInput = resetInput;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetRequestDto resetRequest = (ResetRequestDto) o;
    return Objects.equals(resetInput, resetRequest.resetInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resetInput: ").append(toIndentedString(resetInput)).append("\n");
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

