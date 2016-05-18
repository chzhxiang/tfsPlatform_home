package com.asiainfo.tfsPlatform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.SpStatOtherResult;

public interface SpStatOtherResultMapper {
    int insert(SpStatOtherResult record);

    int insertSelective(SpStatOtherResult record);
    /**
     * 功能描述：根据条件查询清单结果表中的费用
     * @author pankx
     * @date 2016年5月16日 下午4:51:27
     * @param @param partId
     * @param @param spServiceId
     * @param @param startDate
     * @param @param endDate
     * @param @return 
     * @return List<Map<String,Object>>
     */
    List<Map<String,Object>>queryListSettleInfo(@Param("partyId")String partyId,
    		@Param("spServiceId")String spServiceId,@Param("startDate")String startDate
    		,@Param("endDate")String endDate);
}