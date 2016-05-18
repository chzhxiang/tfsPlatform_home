package com.asiainfo.tfsPlatform.service.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.TfFCustContactDto;
import com.asiainfo.tfsPlatform.interfaces.information.CustContactService;
import com.asiainfo.tfsPlatform.miniService.information.MiniCustContactServiceImpl;

/**
* 联系人接口实现类
* @author zhangbt3
* @date 2016年5月11日 下午6:12:44
*/
@Service("custContactService")
@Transactional(propagation=Propagation.REQUIRED)
public class CustContactServiceImpl implements CustContactService {

	@Autowired
	private MiniCustContactServiceImpl custContactService;
	
	/**
	 * 功能描述：根据Id查询联系人
	 * @param contactId
	 * @return
	 */
	public TfFCustContactDto getCustContactDto(Long contactId) {
		return custContactService.getCustContactDto(contactId);
	}

	/**
	 * 功能描述：条件查询
	 * @param custContactDto
	 * @return
	 */
	public List<TfFCustContactDto> getCustContactDtoByMultiConditions(TfFCustContactDto custContactDto) {
		return custContactService.getCustContactDtoByMultiConditions(custContactDto);
	}

	/**
	 * 功能描述：新增联系人
	 * @param custContactDto
	 */
	public void save(TfFCustContactDto custContactDto) {
		custContactService.save(custContactDto);
		
	}

	/**
	 * 功能描述：修改联系人
	 * @param custContactDto
	 */
	public void updateCustContactDto(TfFCustContactDto custContactDto) {
		custContactService.updateCustContactDto(custContactDto);
		
	}


	

}
