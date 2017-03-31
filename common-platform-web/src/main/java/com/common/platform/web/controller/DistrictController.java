package com.common.platform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.platform.model.TblDistrict;
import com.common.platform.service.IDistrictService;

@Controller
@RequestMapping("/common/platform/district")
public class DistrictController {

	@Autowired
	private IDistrictService districtService;
	
	@RequestMapping("/getAll")
	public List<TblDistrict> getAllDistrict(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return districtService.getAllDistrict();
	}
	
}
