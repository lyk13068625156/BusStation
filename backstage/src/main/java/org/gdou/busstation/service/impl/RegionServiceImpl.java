package org.gdou.busstation.service.impl;

import org.gdou.busstation.dto.*;
import org.gdou.busstation.mapper.RegionMapper;
import org.gdou.busstation.model.Region;
import org.gdou.busstation.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    RegionMapper regionMapper;

    @Override
    public GetRegionResponseDto getRegion(GetRegionRequestDto requestDto) {
        Integer parentId = requestDto.getParentId();
        if (parentId == null)
            parentId = 0;
        List<Region> regions = regionMapper.getRegion(parentId);

        GetRegionResponseDto responseDto = new GetRegionResponseDto();
        GetRegionResponseResultDto resultDto = new GetRegionResponseResultDto();
        List<RegionDetailDto> items = new ArrayList<RegionDetailDto>();

        if (!regions.isEmpty()){
            for (Region region : regions){
                RegionDetailDto dto = new RegionDetailDto();
                dto.setId(region.getRegionId());
                dto.setRegionName(region.getRegionName());
                items.add(dto);
            }
        }
        resultDto.setItems(items);
        return responseDto.code(0).success(true).result(resultDto);
    }

    @Override
    public String getRegionById(Integer id) {
        String region = regionMapper.getRegionByid(id);
        return region;
    }

    @Override
    public SetRegionResponseDto setRegion(Integer regionId) {
        Region region = regionMapper.selectByPrimaryKey(regionId);
        SetRegionResponseResultDto resultDto = new SetRegionResponseResultDto();
        if (region != null){
            resultDto.setRegionId(region.getRegionId());
            resultDto.setRegionName(region.getRegionName());
        }else {
            resultDto.setRegionId(regionId);
            resultDto.setRegionName("");
        }
        return new SetRegionResponseDto().code(0).success(true).result(resultDto);
    }
}
