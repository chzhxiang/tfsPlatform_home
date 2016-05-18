package com.asiainfo.tfsPlatform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TsBBillPo;

public interface TsBBillPoMapper {
    int insert(TsBBillPo record);

    int insertSelective(TsBBillPo record);
    
    /**
     * 功能描述：客户标识查询 账户欠费列表
     * 关联账户表获得该客户下的所有账户,在累加账户下的所有账单
     * 账户名称payName, 欠费字段用 balance
     * @author BAOMZ
     * @date 2016年5月18日 下午3:12:38
     * @param @param custId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>> selectArrearsListByCustId(@Param("custId") Long custId);
    
    /**
     * 功能描述：按照账户查询欠费
     * 关联账户表 获得账户名称
     * 账户名称payName, 欠费字段用 balance
     * @author BAOMZ
     * @date 2016年5月18日 下午3:17:17
     * @param @param acctId
     * @param @return 
     * @return Map<String,String>
     */
    Map<String, String>  selectArrearsByAcctId(@Param("acctId") Long acctId);
    
    
    /**
     * 功能描述：根据账户标识查询 账单列表 
     * 关联帐目表 获得帐目名称itemName
     * @author BAOMZ
     * @date 2016年5月18日 下午3:20:54
     * @param @param acctId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>>  selectBillListByAcctId(@Param("acctId") Long acctId);
    
    /**
     * 功能描述：根据用户标识查询 账单列表
     * 关联帐目表 获得帐目名称itemName
     * @author BAOMZ
     * @date 2016年5月18日 下午3:23:19
     * @param @param userId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>>  selectBillListByUserId(@Param("userId") Long userId);
    
    /**
     * 功能描述：根据客户标识查询 账单列表
     * 需要管理账户表获得该客户的所有账户
     * 关联帐目表 获得帐目名称itemName
     * @author Administrator
     * @date 2016年5月18日 下午3:24:20
     * @param @param custId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>>   selectBillListByCustId(@Param("custId") Long custId);
    
}