package org.gdou.busstation.tkMybatis;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T> extends Mapper<T>, InsertListMapper<T> {
}
