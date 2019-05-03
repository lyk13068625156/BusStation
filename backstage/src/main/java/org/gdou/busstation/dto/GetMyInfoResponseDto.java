package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetMyInfoResponseDto extends CommonResponseDto implements Serializable {
  
  private Integer id = null;
  private String userName = null;
  private String name = null;
  private String idCard = null;
  private Integer sex = null;
  private String phone = null;
  private String email = null;
  private Integer type = null;
  private Integer status = null;
  private Long createTime = null;

  
  /**
   * 个人id
   **/
  public GetMyInfoResponseDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "个人id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * 用户名
   **/
  public GetMyInfoResponseDto userName(String userName) {
    this.userName = userName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "用户名")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * 真是姓名
   **/
  public GetMyInfoResponseDto name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "真是姓名")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * 身份证号码
   **/
  public GetMyInfoResponseDto idCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "身份证号码")
  @JsonProperty("idCard")
  public String getIdCard() {
    return idCard;
  }
  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  
  /**
   * 性别，1-男，2-女，0-未知
   **/
  public GetMyInfoResponseDto sex(Integer sex) {
    this.sex = sex;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "性别，1-男，2-女，0-未知")
  @JsonProperty("sex")
  public Integer getSex() {
    return sex;
  }
  public void setSex(Integer sex) {
    this.sex = sex;
  }

  
  /**
   * 手机号码
   **/
  public GetMyInfoResponseDto phone(String phone) {
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
  public GetMyInfoResponseDto email(String email) {
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
   * 权限，1-管理员，2-普通用户
   **/
  public GetMyInfoResponseDto type(Integer type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "权限，1-管理员，2-普通用户")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  
  /**
   * 状态，1-启用，2-禁用（普通用户注册完默认是启用，管理员注册完默认是2禁用）
   **/
  public GetMyInfoResponseDto status(Integer status) {
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

  
  /**
   * 注册时间
   **/
  public GetMyInfoResponseDto createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "注册时间")
  @JsonProperty("createTime")
  public Long getCreateTime() {
    return createTime;
  }
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMyInfoResponseDto getMyInfoResponse = (GetMyInfoResponseDto) o;
    return Objects.equals(id, getMyInfoResponse.id) &&
        Objects.equals(userName, getMyInfoResponse.userName) &&
        Objects.equals(name, getMyInfoResponse.name) &&
        Objects.equals(idCard, getMyInfoResponse.idCard) &&
        Objects.equals(sex, getMyInfoResponse.sex) &&
        Objects.equals(phone, getMyInfoResponse.phone) &&
        Objects.equals(email, getMyInfoResponse.email) &&
        Objects.equals(type, getMyInfoResponse.type) &&
        Objects.equals(status, getMyInfoResponse.status) &&
        Objects.equals(createTime, getMyInfoResponse.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, name, idCard, sex, phone, email, type, status, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMyInfoResponseDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

