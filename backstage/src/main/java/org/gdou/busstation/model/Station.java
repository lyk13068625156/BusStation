package org.gdou.busstation.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Table(name = "station")
public class Station implements Serializable  {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "province_code")
    private Integer provinceCode;

    @Column(name = "city_code")
    private Integer cityCode;

    @Column(name = "section_code")
    private Integer sectionCode;

    @Column(name = "province")
    private String province;

    @Column(name = "city")
    private String city;

    @Column(name = "section")
    private String section;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(Integer sectionCode) {
        this.sectionCode = sectionCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Objects.equals(id, station.id) &&
                Objects.equals(name, station.name) &&
                Objects.equals(provinceCode, station.provinceCode) &&
                Objects.equals(cityCode, station.cityCode) &&
                Objects.equals(sectionCode, station.sectionCode) &&
                Objects.equals(province, station.province) &&
                Objects.equals(city, station.city) &&
                Objects.equals(section, station.section) &&
                Objects.equals(address, station.address) &&
                Objects.equals(status, station.status) &&
                Objects.equals(createTime, station.createTime) &&
                Objects.equals(updateTime, station.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name,provinceCode, cityCode,sectionCode , province, city, section, address, status, createTime, updateTime);
    }
}
