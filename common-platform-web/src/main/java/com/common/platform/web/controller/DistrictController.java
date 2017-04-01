package com.common.platform.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.platform.model.TblDistrict;
import com.common.platform.service.ICacheService;
import com.common.platform.service.IDistrictService;
import com.common.platform.utils.JsonResult;
import com.common.platform.utils.dto.ZTreeNode;

@Controller
@RequestMapping("/common/platform/district")
public class DistrictController {

	@Autowired
	private IDistrictService districtService;
	
	@Autowired
	private ICacheService cacheService;
	
	@RequestMapping("/getAll")
	public List<TblDistrict> getAllDistrict(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		return districtService.getAllDistrict();
	}
	
	@RequestMapping("/tree")
	@ResponseBody
	public JsonResult getDistrictTree(){
		List<ZTreeNode> nodes=cacheService.findDistrictTree();
		if(nodes != null){
			return JsonResult.ok(nodes);
		}
		return JsonResult.build(500, "获取区域树失败");
	}
}
