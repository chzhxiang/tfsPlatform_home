package com.asiainfo.tfsPlatform.miniService.accountingMgmt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.mapper.TsBBillPoMapper;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext.BillOrderingRuleChain;
import com.google.common.collect.Lists;

/**
 * 类说明：账单相关微服务
 * 
 * @author BAOMZ
 * @date 2016年5月11日 下午3:15:10
 */
@Service("AMMiniBillService")
public class MiniBiilServiceImpl {

	@Autowired
	private TsBBillPoMapper billPoMapper;

	
	@Autowired
	private BillOrderingRuleChain billOrderingRuleChain;

	/**
	 * 功能描述：根据账户标识查询账单列表
	 * @author BAOMZ
	 * @date 2016年5月16日 下午4:34:17
	 * @param @param acctId
	 * @param @return 
	 * @return List<AmBillDto>
	 */
	public List<AmBillDto> getBillListByAcctId(Long acctId) {
		
		List<Map<String, String>> billList = billPoMapper.selectBillListByAcctId(acctId);
		if(billList == null || billList.size() == 0) return null;
		
		List<AmBillDto> rs = Lists.newArrayList();
		for(Map<String, String> map: billList){
			AmBillDto dto = (AmBillDto)ConversionUtil.map2dto(map, AmBillDto.class);
			rs.add(dto);
		}
		
		return rs;
	}
	
	/**
	 * 功能描述：根据用户标识查询账单列表
	 * @author BAOMZ
	 * @date 2016年5月17日 下午3:38:32
	 * @param @param userId
	 * @param @return 
	 * @return List<AmBillDto>
	 */
	public List<AmBillDto> getBillListByUserId(Long userId) {
		
		List<Map<String, String>> billList = billPoMapper.selectBillListByUserId(userId);
		if(billList == null || billList.size() == 0) return null;
		
		List<AmBillDto> rs = Lists.newArrayList();
		for(Map<String, String> map: billList){
			AmBillDto dto = (AmBillDto)ConversionUtil.map2dto(map, AmBillDto.class);
			rs.add(dto);
		}
		
		return rs;
	}
	
	
	/**
	 * 功能描述：根据客户标识查询账单列表
	 * @author BAOMZ
	 * @date 2016年5月17日 下午3:38:32
	 * @param @param userId
	 * @param @return 
	 * @return List<AmBillDto>
	 */
	public List<AmBillDto> getBillListByCustId(Long custId) {
		
		List<Map<String, String>> billList = billPoMapper.selectBillListByCustId(custId);
		if(billList == null || billList.size() == 0) return null;
		
		List<AmBillDto> rs = Lists.newArrayList();
		for(Map<String, String> map: billList){
			AmBillDto dto = (AmBillDto)ConversionUtil.map2dto(map, AmBillDto.class);
			rs.add(dto);
		}
		
		return rs;
	}
	/**
	 * 功能描述：对账单列表进行排序
	 * 通过 ITEM_PRIOR_RULE_ID 从缓存中获取帐目优先规则列表,然后根据帐目编码对应到 每个账单上
	 * 然后根据  BillOrderingRuleChain 账单排序规则链进行排序
	 * @author BAOMZ
	 * @date 2016年5月17日 下午12:56:04
	 * @param @param list 要排序的列表
	 * @param @param ruleId  帐目优先规则 ITEM_PRIOR_RULE_ID
	 * @return void
	 */
	public void sortBillList(List<AmBillDto> list, Integer ruleId){
		billOrderingRuleChain.startOrder(list, ruleId);
	}
	

	/**
	 * 功能描述：根据客户标识查询账户欠费列表
	 * @author BAOMZ
	 * @date 2016年5月16日 下午4:36:20
	 * @param @param custId
	 * @param @return 
	 * @return List<AmAcountArrearsBalanceDto>
	 */
	public List<AmAcountArrearsBalanceDto> getAccountArrearsListByCustId(Long custId) {
		
		List<Map<String,String>>  list = billPoMapper.selectArrearsListByCustId(custId);
		if(list == null || list.size() == 0)  return null;
		
		List<AmAcountArrearsBalanceDto> rs = Lists.newArrayList();
		
		for(Map<String,String> map: list){
			rs.add((AmAcountArrearsBalanceDto) ConversionUtil.map2dto(map, AmAcountArrearsBalanceDto.class));
		}
		
		return rs;
	}
	
	
	/**
	 * 功能描述：根据账户标识查询账户欠费
	 * @author BAOMZ
	 * @date 2016年5月17日 下午3:20:07
	 * @param @param acctId
	 * @param @return 
	 * @return AmAcountArrearsBalanceDto
	 */
	public AmAcountArrearsBalanceDto getAccountArrearsByAcctId(Long acctId){
		
		Map<String,String>  map = billPoMapper.selectArrearsByAcctId(acctId);
		if(map ==  null)  return null;
		
		return (AmAcountArrearsBalanceDto) ConversionUtil.map2dto(map, AmAcountArrearsBalanceDto.class);
		
	}

	/**
	 * 功能描述：用于spring 注入 账单排序规则链
	 * @author BAOMZ
	 * @date 2016年5月17日 下午1:17:00
	 * @param @param billOrderingRuleChain 
	 * @return void
	 */
	public void setBillOrderingRuleChain(BillOrderingRuleChain billOrderingRuleChain) {
		this.billOrderingRuleChain = billOrderingRuleChain;
	}

	/**
	 * 功能描述：用于spring 注入 账单映射接口
	 * @author BAOMZ
	 * @date 2016年5月17日 下午1:17:42
	 * @param @param billPoMapper 
	 * @return void
	 */
	public void setBillPoMapper(TsBBillPoMapper billPoMapper) {
		this.billPoMapper = billPoMapper;
	}


}