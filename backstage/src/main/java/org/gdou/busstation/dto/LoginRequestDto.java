package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class LoginRequestDto implements Serializable {
  
  private LoginInputDto loginInput = null;

  
  /**
   **/
  public LoginRequestDto loginInput(LoginInputDto loginInput) {
    this.loginInput = loginInput;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("login_input")
  public LoginInputDto getLoginInput() {
    return loginInput;
  }
  public void setLoginInput(LoginInputDto loginInput) {
    this.loginInput = loginInput;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequestDto loginRequest = (LoginRequestDto) o;
    return Objects.equals(loginInput, loginRequest.loginInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    loginInput: ").append(toIndentedString(loginInput)).append("\n");
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

