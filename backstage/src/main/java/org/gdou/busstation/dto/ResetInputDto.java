package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ResetInputDto implements Serializable {
  
  private String userName = null;
  private String oldPassword = null;
  private String newPassword = null;

  
  /**
   * 用户名
   **/
  public ResetInputDto userName(String userName) {
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
   * 旧密码
   **/
  public ResetInputDto oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "旧密码")
  @JsonProperty("old_password")
  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  
  /**
   * 新密码
   **/
  public ResetInputDto newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "新密码")
  @JsonProperty("new_password")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetInputDto resetInput = (ResetInputDto) o;
    return Objects.equals(userName, resetInput.userName) &&
        Objects.equals(oldPassword, resetInput.oldPassword) &&
        Objects.equals(newPassword, resetInput.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetInputDto {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

