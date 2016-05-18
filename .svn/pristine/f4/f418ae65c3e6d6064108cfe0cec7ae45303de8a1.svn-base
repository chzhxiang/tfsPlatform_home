package com.asiainfo.tfsPlatform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.SpStatOther;

public interface SpStatOtherMapper {
    int insert(SpStatOther record);

    int insertSelective(SpStatOther record);
    
    /**
     * 功能描 统计month月份的SP清单的记录数
     * @author pankx
     * @date 2016年5月13日 上午10:28:02
     * @param @param month
     * @param @return 
     * @return List<Map<String,Object>>
     */
    List<Map<String,Object>> countRecordByMonth(@Param("month")String month);
    
    /**
     * 功能描述：获得特殊规则表和中间表中的数据
     * @author pankx
     * @date 2016年5月13日 下午2:35:11
     * @param @return 
     * @return List<Map<String,Object>>
     */
    List<Map<String,Object>> getMiddleData(@Param("svcCode")String svcCode);
}