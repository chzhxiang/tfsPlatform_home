package com.asiainfo.tfsPlatform.dto.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.TfFUserDiscntDto;
import com.asiainfo.tfsPlatform.dto.TfFUserDto;
import com.asiainfo.tfsPlatform.dto.TfFUserProductDto;
import com.asiainfo.tfsPlatform.dto.TfFUserSpDto;

/**
 * 类说明：用户订购信息Dto
 * @author zhouzy3
 * @date 2016年5月18日 上午9:45:56
 */
public class UserProductInfoDto {

	/**
	 * 用户信息
	 */
	public TfFUserDto tfFUserDto;
	
	/**
	 * 用户优惠信息
	 */
	public List<TfFUserDiscntDto> tfFUserDiscntDtos;
	
	/**
	 * 用户产品信息
	 */
	public List<TfFUserProductDto> tfFUserProductDtos;
	
	/**
	 * 用户SP增值服务信息
	 */
	public List<TfFUserSpDto> tfFUserSpDtos;

	public TfFUserDto getTfFUserDto() {
		return tfFUserDto;
	}

	public void setTfFUserDto(TfFUserDto tfFUserDto) {
		this.tfFUserDto = tfFUserDto;
	}

	public List<TfFUserDiscntDto> getTfFUserDiscntDtos() {
		return tfFUserDiscntDtos;
	}

	public void setTfFUserDiscntDtos(List<TfFUserDiscntDto> tfFUserDiscntDtos) {
		this.tfFUserDiscntDtos = tfFUserDiscntDtos;
	}

	public List<TfFUserProductDto> getTfFUserProductDtos() {
		return tfFUserProductDtos;
	}

	public void setTfFUserProductDtos(List<TfFUserProductDto> tfFUserProductDtos) {
		this.tfFUserProductDtos = tfFUserProductDtos;
	}

	public List<TfFUserSpDto> getTfFUserSpDtos() {
		return tfFUserSpDtos;
	}

	public void setTfFUserSpDtos(List<TfFUserSpDto> tfFUserSpDtos) {
		this.tfFUserSpDtos = tfFUserSpDtos;
	}
}
