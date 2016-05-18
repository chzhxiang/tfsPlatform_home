package com.asiainfo.tfsPlatform.miniService.information;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFAccountDto;
import com.asiainfo.tfsPlatform.dto.TfFCustGroupDto;
import com.asiainfo.tfsPlatform.dto.TfFCustomerDto;
import com.asiainfo.tfsPlatform.mapper.TfFCustGroupPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFAccountPoExtMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFCustGroupPoExtMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFCustomerPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFAccountPo;
import com.asiainfo.tfsPlatform.po.TfFCustGroupPo;
import com.asiainfo.tfsPlatform.po.TfFCustomerPo;


/**
 * 功能描述： 车企资料微服务
 * @author wangfu
 * @date 2016年5月12日
 */
@Service("miniCustomerService")
public class MiniCustomerServcieImpl  {

	@Autowired
	private TfFCustomerPoExtMapper tfFCustomerPoExtMapper;
	@Autowired
	private TfFCustGroupPoMapper tfFCustGroupPoMapper;
	@Autowired
	private TfFCustGroupPoExtMapper tfFCustGroupExtPoMapper;
	@Autowired
	private TfFAccountPoExtMapper tfFAccountPoExtMapper;
	/**
	 * 功能描述：车企客户查询列表
	 * @author wangfu
	 * @date 2016年5月12日 下午3:52:01
	 * @param @param dto
	 * @param @return
	 */
	public List<TfFCustomerDto> selectCustomerList(TfFCustomerDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfFCustomerPo.class);
		TfFCustomerPo Po = (TfFCustomerPo)object;
		List<TfFCustomerPo> list= tfFCustomerPoExtMapper.selectCustomerList(Po);
		List<TfFCustomerDto> dtoList=ConversionUtil.poList2dtoList(list, TfFCustomerPo.class);
		return dtoList;
	}
	/**
	 * 功能描述：车企集团查询列表
	 * @author wangfu
	 * @date 2016年5月12日 下午3:52:01
	 * @param @param dto
	 * @param @return
	 */
	public List<TfFCustGroupDto> selectCustGroupList(TfFCustGroupDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfFCustGroupPo.class);
		TfFCustGroupPo po = (TfFCustGroupPo)object;
		List<TfFCustGroupPo> list= tfFCustGroupExtPoMapper.selectCustGroupList(po);
		List<TfFCustGroupDto> dtoList=ConversionUtil.poList2dtoList(list, TfFCustomerPo.class);
		return dtoList;
	}
	/**
	 * 功能描述：车企账户查询列表
	 * @author wangfu
	 * @date 2016年5月12日 下午3:52:01
	 * @param @param dto
	 * @param @return
	 */
	public List<TfFAccountDto> selectAccountList(TfFAccountDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfFAccountPo.class);
		TfFAccountPo po = (TfFAccountPo)object;
		List<TfFAccountPo> list= tfFAccountPoExtMapper.selectAccountList(po);
		List<TfFAccountDto> dtoList=ConversionUtil.poList2dtoList(list, TfFCustomerPo.class);
		return dtoList;
	}


	/**
	 * 功能描述：根据主键车企集团查询列表
	 * @author wangfu
	 * @date 2016年5月12日 下午3:52:01
	 * @param @param dto
	 * @param @return
	 */
	public TfFCustGroupDto selectCustGroupByPrimaryKey(Long custId) {
		TfFCustGroupDto custGroupPo= (TfFCustGroupDto) ConversionUtil.po2dto(tfFCustGroupPoMapper.selectByPrimaryKey(custId), TfFCustGroupDto.class);
		return custGroupPo;
	}

}
