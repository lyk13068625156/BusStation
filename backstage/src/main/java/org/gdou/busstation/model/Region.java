package org.gdou.busstation.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "region")
public class Region {

    @Id
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "region_type")
    private Integer regionType;

    @Column(name = "baidu_id")
    private Integer baiduId;

    @Column(name = "agency_id")
    private Integer agencyId;

    @Column(name = "source_id")
    private Integer sourceId;

    @Column(name = "source_area_name")
    private String sourceAreaName;

    @Column(name = "source_area_type")
    private Integer sourceAreaType;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Integer getRegionType() {
        return regionType;
    }

    public void setRegionType(Integer regionType) {
        this.regionType = regionType;
    }

    public Integer getBaiduId() {
        return baiduId;
    }

    public void setBaiduId(Integer baiduId) {
        this.baiduId = baiduId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceAreaName() {
        return sourceAreaName;
    }

    public void setSourceAreaName(String sourceAreaName) {
        this.sourceAreaName = sourceAreaName;
    }

    public Integer getSourceAreaType() {
        return sourceAreaType;
    }

    public void setSourceAreaType(Integer sourceAreaType) {
        this.sourceAreaType = sourceAreaType;
    }
}
