package org.gdou.busstation.dto;

import org.gdou.busstation.exception.ServiceException;
import java.io.Serializable;
import java.util.Objects;

public class CommonResponseDto implements Serializable {

    private Integer pcode;
    private Boolean psuccess;
    private String pmessage;

    public CommonResponseDto message(String message) {
        this.pmessage = message;
        return this;
    }

    public String getMessage() {
        return pmessage;
    }

    public void setMessage(String message) {
        this.pmessage = message;
    }

    /**
     * 响应码，0为成功，1为失败
     **/
    public CommonResponseDto code(Integer code) {
        this.pcode = code;
        return this;
    }

    public Integer getCode() {
        return pcode;
    }
    public void setCode(Integer code) {
        this.pcode = code;
    }


    /**
     * 是否成功
     **/
    public CommonResponseDto success(Boolean success) {
        this.psuccess = success;
        return this;
    }

    public Boolean getSuccess() {
        return psuccess;
    }
    public void setSuccess(Boolean success) {
        this.psuccess = success;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonResponseDto commonResponse = (CommonResponseDto) o;
        return Objects.equals(pcode, commonResponse.pcode) &&
                Objects.equals(psuccess, commonResponse.psuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcode, psuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonResponseDto {\n");

        sb.append("    message: ").append(toIndentedString(pmessage)).append("\n");
        sb.append("    code: ").append(toIndentedString(pcode)).append("\n");
        sb.append("    success: ").append(toIndentedString(psuccess)).append("\n");
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

    public void check() {
        if (!getSuccess()) {
            throw new ServiceException(getCode(), getMessage());
        }
    }
}

