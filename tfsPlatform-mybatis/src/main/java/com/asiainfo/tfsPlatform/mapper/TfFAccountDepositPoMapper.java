package com.asiainfo.tfsPlatform.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TfFAccountDepositPo;

public interface TfFAccountDepositPoMapper {
	
    int deleteByPrimaryKey(@Param("acctBalanceId") Long acctBalanceId, @Param("partitionId") Integer partitionId);

    int insert(TfFAccountDepositPo record);

    int insertSelective(TfFAccountDepositPo record);

    TfFAccountDepositPo selectByPrimaryKey(@Param("acctBalanceId") Long acctBalanceId, @Param("partitionId") Integer partitionId);

    int updateByPrimaryKeySelective(TfFAccountDepositPo record);

    int updateByPrimaryKey(TfFAccountDepositPo record);
    
    /**
     * 功能描述：根据账户标识进行账户余额的查询 
     * 关联 账户表 获得账户名称，根据偶数月金额和基数月金额相加  获得账本余额, 然后再相加账户下的所有账本余额 获得账户余额
     * 账户余额是通过 allMony 来获取，其它字段和PO一样
     * @author BAOMZ
     * @date 2016年5月18日 下午1:02:24
     * @param @param acctId
     * @param @return 
     * @return Map<String,String>
     */
    Map<String, String> selectLedgerBalanceByAcctId(@Param("acctId") Long  acctId);
    
    /**
     * 功能描述：根据客户标识进行账户余额的查询 
     * 关联 账户表 获得该客户下所有账户列表根据偶数月金额和基数月金额相加  获得账本余额, 然后再相加账户下的所有账本余额 获得账户余额
     * 账户余额是通过 allMony 来获取，其它字段和PO一样
     * @author BAOMZ
     * @date 2016年5月18日 下午1:11:02
     * @param @param custId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>> selectLedgerBalanceListByCustId(@Param("custId") Long  custId);
    
    /**
     * 功能描述：根据账户标识查询账本列表
     * 单表操作
     * @author BAOMZ
     * @date 2016年5月18日 下午1:15:03
     * @param @param acctId
     * @param @return 
     * @return TfFAccountDepositPo
     */
    List<TfFAccountDepositPo> selectAccountDepositByAcctId(@Param("acctId") Long  acctId);
    
    /**
     * 功能描述：通过客户标识查询账本列表
     * 通过关联 账本表  获得该客户下的所有账户和账户名称， 再查询这些账户下的账本列表
     * 通过账本标识排序， 账户名称用payName, 账本余额用allMony, 其它字段均以PO为准
     * @author BAOMZ
     * @date 2016年5月18日 下午3:55:39
     * @param @param custId
     * @param @return 
     * @return List<Map<String,String>>
     */
    List<Map<String, String>> selectAccountDepositListByCustId(@Param("custId") Long  custId);
}