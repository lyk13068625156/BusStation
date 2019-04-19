package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class LoginInputDto implements Serializable {
  
  private String userName = null;
  private String password = null;

  
  /**
   * 用户名
   **/
  public LoginInputDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "用户名")
  @JsonProperty("user_name")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * 密码
   **/
  public LoginInputDto password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "密码")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginInputDto loginInput = (LoginInputDto) o;
    return Objects.equals(userName, loginInput.userName) &&
        Objects.equals(password, loginInput.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginInputDto {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

