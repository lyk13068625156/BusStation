package org.gdou.busstation.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;




public class GetStationResponseDto implements Serializable {
  
  private Integer code = null;
  private Boolean success = null;
  private GetStationResponseResultDto result = null;

  
  /**
   * 响应码，0为成功，1为失败
   **/
  public GetStationResponseDto code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "响应码，0为成功，1为失败")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   * 是否成功
   **/
  public GetStationResponseDto success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "是否成功")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  public GetStationResponseDto result(GetStationResponseResultDto result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public GetStationResponseResultDto getResult() {
    return result;
  }
  public void setResult(GetStationResponseResultDto result) {
    this.result = result;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStationResponseDto getStationResponse = (GetStationResponseDto) o;
    return Objects.equals(code, getStationResponse.code) &&
        Objects.equals(success, getStationResponse.success) &&
        Objects.equals(result, getStationResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, success, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStationResponseDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

