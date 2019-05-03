package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;



public class UpdateMyInfoInputDto implements Serializable {

  private Integer id = null;
  private String name = null;
  private String idCard = null;
  private Integer sex = null;
  private String phone = null;
  private String email = null;


  /**
   * 个人id
   **/
  public UpdateMyInfoInputDto id(Integer id) {
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
   * 真是姓名
   **/
  public UpdateMyInfoInputDto name(String name) {
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
  public UpdateMyInfoInputDto idCard(String idCard) {
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
   * 性别，1-男，2-女，0-未知
   **/
  public UpdateMyInfoInputDto sex(Integer sex) {
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
  public UpdateMyInfoInputDto phone(String phone) {
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
  public UpdateMyInfoInputDto email(String email) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMyInfoInputDto updateMyInfoInput = (UpdateMyInfoInputDto) o;
    return Objects.equals(id, updateMyInfoInput.id) &&
            Objects.equals(name, updateMyInfoInput.name) &&
            Objects.equals(idCard, updateMyInfoInput.idCard) &&
            Objects.equals(sex, updateMyInfoInput.sex) &&
            Objects.equals(phone, updateMyInfoInput.phone) &&
            Objects.equals(email, updateMyInfoInput.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, idCard, sex, phone, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMyInfoInputDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idCard: ").append(toIndentedString(idCard)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

