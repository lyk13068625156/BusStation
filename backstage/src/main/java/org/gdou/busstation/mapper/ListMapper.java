package org.gdou.busstation.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.gdou.busstation.dto.GetListRequestDto;
import org.gdou.busstation.mapper.provide.ListProvider;
import org.gdou.busstation.model.List;
import org.gdou.busstation.tkMybatis.BaseMapper;

@Mapper
public interface ListMapper extends BaseMapper<List> {

    @SelectProvider(type = ListProvider.class, method = "getList")
    java.util.List<List> getList(GetListRequestDto requestDto);

    @SelectProvider(type = ListProvider.class, method = "getListCount")
    Integer getListCount(GetListRequestDto requestDto);
}
