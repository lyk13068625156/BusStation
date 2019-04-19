package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class UserDetailDto implements Serializable {
  
  private Integer id = null;
  private String userName = null;
  private String name = null;
  private String idCard = null;
  private Integer sex = null;
  private String phone = null;
  private String email = null;
  private Integer type = null;
  private Integer status = null;
  private String createTime = null;

  
  /**
   * 用户id（数据库主键）
   **/
  public UserDetailDto id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "用户id（数据库主键）")
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
  public UserDetailDto userName(String userName) {
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
   * 真是姓名
   **/
  public UserDetailDto name(String name) {
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
  public UserDetailDto idCard(String idCard) {
    this.idCard = idCard;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "身份证号码")
  @JsonProperty("id_card")
  public String getIdCard() {
    return idCard;
  }
  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }

  
  /**
   **/
  public UserDetailDto sex(Integer sex) {
    this.sex = sex;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
  public UserDetailDto phone(String phone) {
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
  public UserDetailDto email(String email) {
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
   * 权限，1:管理员，2:普通用户
   **/
  public UserDetailDto type(Integer type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "权限，1:管理员，2:普通用户")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  
  /**
   * 状态，1:启用，2:禁用（普通用户注册完默认是1启用，管理员注册完默认是2禁用）
   **/
  public UserDetailDto status(Integer status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "状态，1:启用，2:禁用（普通用户注册完默认是1启用，管理员注册完默认是2禁用）")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * 创建时间（注册时间）
   **/
  public UserDetailDto createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "创建时间（注册时间）")
  @JsonProperty("create_time")
  public String getCreateTime() {
    return createTime;
  }
  public void setCreateTime(String createTime) {
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
    UserDetailDto userDetail = (UserDetailDto) o;
    return Objects.equals(id, userDetail.id) &&
        Objects.equals(userName, userDetail.userName) &&
        Objects.equals(name, userDetail.name) &&
        Objects.equals(idCard, userDetail.idCard) &&
        Objects.equals(sex, userDetail.sex) &&
        Objects.equals(phone, userDetail.phone) &&
        Objects.equals(email, userDetail.email) &&
        Objects.equals(type, userDetail.type) &&
        Objects.equals(status, userDetail.status) &&
        Objects.equals(createTime, userDetail.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userName, name, idCard, sex, phone, email, type, status, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetailDto {\n");
    
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

