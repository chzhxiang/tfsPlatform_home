package com.asiainfo.tfsPlatform.web.web.information;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.asiainfo.tfsPlatform.dto.TfFCustContactDto;
import com.asiainfo.tfsPlatform.interfaces.information.CustContactService;

/**
* 联系人
* @author zhangbt3
* @date 2016年5月11日 下午5:22:52
*/
@Controller
@RequestMapping("/cust")
public class CustContactController {

	
	@Autowired
	private CustContactService custContactService;
	
	@ResponseBody
	@RequestMapping(value="list")
	public List<TfFCustContactDto> list(TfFCustContactDto custContactDto){
		List<TfFCustContactDto> custContactDtos = custContactService.getCustContactDtoByMultiConditions(custContactDto);
		return custContactDtos;
	}
	
	@RequestMapping(value="toList", method = RequestMethod.GET)
	public ModelAndView toList(TfFCustContactDto custContactDto){
		ModelAndView mv = new ModelAndView("custcontact/custContact");
		List<TfFCustContactDto> custContactDtos = custContactService.getCustContactDtoByMultiConditions(custContactDto);
		mv.addObject("custContactDtos", custContactDtos);
		return mv;
	}
	
	@RequestMapping(value="toAdd")
	public ModelAndView toAdd(){
		ModelAndView mv = new ModelAndView("custcontact/addOrEdit");
		mv.addObject("submitType", "add");
		return mv;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String save(TfFCustContactDto custContactDto){
		custContactService.save(custContactDto);
		return "redirect:/cust/toList";
	}
	
	@RequestMapping(value = "update/{contactId}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("contactId") Long contactId, Model model) {
		model.addAttribute("custContactDto", custContactService.getCustContactDto(contactId));
		model.addAttribute("submitType", "update");
		return "custcontact/addOrEdit";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update( @ModelAttribute("cust") TfFCustContactDto custContactDto) {
		custContactService.updateCustContactDto(custContactDto);
		return "redirect:/cust/toList";
	}
	
}
