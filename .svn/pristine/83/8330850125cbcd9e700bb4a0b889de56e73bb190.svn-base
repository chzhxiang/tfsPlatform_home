
package com.asiainfo.tfsPlatform.service.accountingMgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.AmCustomerDto;
import com.asiainfo.tfsPlatform.dto.AmCustomerNamesDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.CustomerService;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.MiniCustomerServiceImpl;

@Service("amCustomerService")
@Transactional(propagation=Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private MiniCustomerServiceImpl miniCustomerService;

	@Override
	public List<AmCustomerNamesDto> getCustomerNames(AmCustomerNamesDto likeCustomerName) {
		if (likeCustomerName == null) {
			return null;
		}
		
		String name = likeCustomerName.getCustName();
		if (name == null || "".equals(name.trim())) {
			return null;
		}
	
		return miniCustomerService.getCustomerNames(likeCustomerName);
	}

	@Override
	public AmCustomerDto getCustomerById(Long custId) {
		if (custId == null) {
			return null;
		}
		return miniCustomerService.getCustomerInfo(custId);
	}

}
