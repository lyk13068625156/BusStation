package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;





public class GetUserRequestDto implements Serializable {

  private String phone = null;
  private String userName = null;
  private Integer sex = null;
  private String name = null;
  private Integer limit = null;
  private Integer id = null;
  private Integer offset = null;
  private Integer type = null;
  private Integer status = null;


  /**
   **/
  public GetUserRequestDto phone(String phone) {
    this.phone = phone;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   **/
  public GetUserRequestDto userName(String userName) {
    this.userName = userName;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user_name")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   **/
  public GetUserRequestDto sex(Integer sex) {
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
   **/
  public GetUserRequestDto name(String name) {
    this.name = name;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public GetUserRequestDto limit(Integer limit) {
    this.limit = limit;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  /**
   **/
  public GetUserRequestDto id(Integer id) {
    this.id = id;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public GetUserRequestDto offset(Integer offset) {
    this.offset = offset;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  /**
   **/
  public GetUserRequestDto type(Integer type) {
    this.type = type;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }


  /**
   **/
  public GetUserRequestDto status(Integer status) {
    this.status = status;
    return this;
  }


  @ApiModelProperty(example = "null", value = "")
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
    GetUserRequestDto getUserRequest = (GetUserRequestDto) o;
    return Objects.equals(phone, getUserRequest.phone) &&
            Objects.equals(userName, getUserRequest.userName) &&
            Objects.equals(sex, getUserRequest.sex) &&
            Objects.equals(name, getUserRequest.name) &&
            Objects.equals(limit, getUserRequest.limit) &&
            Objects.equals(id, getUserRequest.id) &&
            Objects.equals(offset, getUserRequest.offset) &&
            Objects.equals(type, getUserRequest.type) &&
            Objects.equals(status, getUserRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, userName, sex, name, limit, id, offset, type, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserRequestDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

