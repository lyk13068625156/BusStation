package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class RegisterRequestDto implements Serializable {
  
  private RegisterInputDto registerInput = null;

  
  /**
   **/
  public RegisterRequestDto registerInput(RegisterInputDto registerInput) {
    this.registerInput = registerInput;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("register_input")
  public RegisterInputDto getRegisterInput() {
    return registerInput;
  }
  public void setRegisterInput(RegisterInputDto registerInput) {
    this.registerInput = registerInput;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequestDto registerRequest = (RegisterRequestDto) o;
    return Objects.equals(registerInput, registerRequest.registerInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registerInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    registerInput: ").append(toIndentedString(registerInput)).append("\n");
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

