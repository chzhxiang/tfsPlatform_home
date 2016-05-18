package com.asiainfo.tfsPlatform.web.web.information;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.asiainfo.tfsPlatform.dto.TfFOrgDto;
import com.asiainfo.tfsPlatform.interfaces.information.OrgService;

/**
* 群组管理
* @author zhangbt3
* @date 2016年5月9日 下午8:45:20
*/
@Controller
@RequestMapping("/org")
public class OrgController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrgController.class);
	@Autowired
	private OrgService orgService;
	
	@ResponseBody
	@RequestMapping(value="list")
	public List<TfFOrgDto> list(ModelAndView mv,HttpServletRequest req,TfFOrgDto orgDto){
//		List<TfFOrgDto> orgDtos = orgService.getAllOrgDto();
		List<TfFOrgDto> orgDtos = orgService.getOrgDtoByMultiConditions(orgDto);
		return orgDtos;
	}
	
	@RequestMapping(value="toList", method = RequestMethod.GET)
	public ModelAndView toList(TfFOrgDto orgDto){
		ModelAndView mv = new ModelAndView("org/orgList");
		List<TfFOrgDto> orgDtos = orgService.getOrgDtoByMultiConditions(orgDto);
		mv.addObject("orgDtos", orgDtos);
		return mv;
	}
	
	@RequestMapping(value="toAdd")
	public ModelAndView toAdd(){
		ModelAndView mv = new ModelAndView("org/addOrg");
		return mv;
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String save(TfFOrgDto org){
		try {
			orgService.save(org);
			LOGGER.debug("新增成功，新增群组id是： orgId={}", org.getOrgId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/org/toList";
	}
	
	@RequestMapping(value = "update/{orgId}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("orgId") Integer orgId, Model model) {
		model.addAttribute("orgDto", orgService.getOrgDto(orgId));
		return "org/editOrg";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update( @ModelAttribute("org") TfFOrgDto orgDto) {
		orgService.updateOrgDto(orgDto);
		return "redirect:/org/toList";
	}
	
	/**
	 * 删除
	 * @author Administrator
	 * @date 2016年5月10日 下午7:38:50
	 * @param @param orgId
	 * @param @return 
	 * @return String
	 */
	@RequestMapping(value = "delete/{orgId}")
	public String delete(@PathVariable("orgId") Integer orgId) {
		orgService.deleteOrgDto(orgId);
		return "redirect:/org/toList";
	}
}
