package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class UpdateUserInputDto implements Serializable {
  
  private Integer id = null;
  private String name = null;
  private String idCard = null;
  private String sex = null;
  private String phone = null;
  private String email = null;
  private Integer status = null;

  
  /**
   * 用户id
   **/
  public UpdateUserInputDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "用户id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * 真实名字
   **/
  public UpdateUserInputDto name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "真实名字")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 身份证号
   **/
  public UpdateUserInputDto idCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "身份证号")
  @JsonProperty("id_card")
  public String getIdCard() {
    return idCard;
  }
  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  
  /**
   * 性别，1-男，2-女，0-未知
   **/
  public UpdateUserInputDto sex(String sex) {
    this.sex = sex;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "性别，1-男，2-女，0-未知")
  @JsonProperty("sex")
  public String getSex() {
    return sex;
  }
  public void setSex(String sex) {
    this.sex = sex;
  }

  
  /**
   * 手机号码
   **/
  public UpdateUserInputDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "手机号码")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * 邮箱
   **/
  public UpdateUserInputDto email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "邮箱")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * 状态，1-启用，2-禁用（普通用户注册完默认是启用，管理员注册完默认是2禁用）
   **/
  public UpdateUserInputDto status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "状态，1-启用，2-禁用（普通用户注册完默认是启用，管理员注册完默认是2禁用）")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserInputDto updateUserInput = (UpdateUserInputDto) o;
    return Objects.equals(id, updateUserInput.id) &&
        Objects.equals(name, updateUserInput.name) &&
        Objects.equals(idCard, updateUserInput.idCard) &&
        Objects.equals(sex, updateUserInput.sex) &&
        Objects.equals(phone, updateUserInput.phone) &&
        Objects.equals(email, updateUserInput.email) &&
        Objects.equals(status, updateUserInput.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, idCard, sex, phone, email, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserInputDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

