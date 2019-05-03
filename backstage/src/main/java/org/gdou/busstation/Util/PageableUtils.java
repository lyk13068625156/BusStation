package org.gdou.busstation.Util;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import tk.mybatis.mapper.weekend.reflection.Reflections;

public class PageableUtils {

	public static Integer getOffset(Integer pageNo, Integer pageSize) {
		if(pageSize == null || pageSize < 1) return 0;
		return (pageNo != null && pageNo > 0) ? (pageNo - 1) * pageSize : 0;
	}

	//left: offset, right: limit
	public static Pair<Integer, Integer> getPage(Integer pageNo, Integer pageSize) {
		if(pageSize == null || pageSize < 1) pageSize = 10;
		return new ImmutablePair<>(getOffset(pageNo, pageSize), pageSize);
	}

	public static Pair<Integer, Integer> checkPage(Integer offset, Integer limit) {
		if (offset == null || offset < 0) offset = 0;
		if (limit == null || limit < 1) limit = 10;
		return new ImmutablePair<>(offset, limit);
	}
}
