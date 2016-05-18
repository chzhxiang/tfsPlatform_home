package com.asiainfo.tfsPlatform.mapper;

import java.util.List;
import java.util.Map;

import com.asiainfo.tfsPlatform.po.TfFCustomerPo;

public interface TfFCustomerPoMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(TfFCustomerPo record);

    int insertSelective(TfFCustomerPo record);

    TfFCustomerPo selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(TfFCustomerPo record);

    int updateByPrimaryKey(TfFCustomerPo record);
    
    /**
     * 功能描述：根据客户名称模糊查询 
     * 主要是根据名称模糊查询 客户标识,客户名称。PO作为参数可以用客户类型，和客户状态 作为查询条件
     * 默认是所有客户类型，和在网状态的客户
     * 单表操作
     * @author BAOMZ
     * @date 2016年5月18日 下午1:32:22
     * @param @param record
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>> selectCustomerLikeNames(TfFCustomerPo record);
}