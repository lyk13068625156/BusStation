package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gdou.busstation.model.Region;
import org.gdou.busstation.tkMybatis.BaseMapper;

import java.util.List;

@Mapper
public interface RegionMapper extends BaseMapper<Region> {

    @Select("select * from region where parent_id = #{parent}")
    List<Region> getRegion(@Param("parent") Integer parent);

    @Select("select region_name from region where region_id = #{id}")
    String getRegionByid(@Param("id")Integer id);
}
