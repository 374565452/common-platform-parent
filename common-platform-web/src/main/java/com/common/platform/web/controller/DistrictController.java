package com.common.platform.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.common.platform.dto.DistrictDto;
import com.common.platform.model.TblDistrict;
import com.common.platform.service.ICacheService;
import com.common.platform.service.IDistrictService;
import com.common.platform.utils.JsonResult;
import com.common.platform.utils.dto.DistrictParam;
import com.common.platform.utils.dto.LazyTreeNode;
import com.common.platform.utils.dto.ZTreeNode;

@Controller
@RequestMapping("/common/platform/district")
public class DistrictController extends BaseController{

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
		return onResult(nodes, 500, "获取区域树失败");
		/*if(nodes != null){
			return JsonResult.ok(nodes);
		}
		return JsonResult.build(500, "获取区域树失败");*/
	}
	
	@RequestMapping(value="/lazy/tree",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult getLazyDistrictTree(@RequestParam(name="pId")long pId){
System.out.println("the pid is " +pId);
		List<LazyTreeNode> nodes=districtService.findLazyTreeNode(pId);
		return onResult(nodes, 500, "获取区域树失败");
		/*if(nodes != null){
			return JsonResult.ok(nodes);
		}
		return JsonResult.build(500, "获取区域树失败");*/
	}
	
	@RequestMapping(value="/qualized",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult getQualizedDistrict(@RequestParam(name="id") long id){
System.err.println("the id is "+id);
		DistrictDto dto=districtService.findQualiedDistrict(id);
		return onResult(dto, 500, "获取区域详细数据失败");
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult addDistrict(@ModelAttribute DistrictParam param){
		TblDistrict parent=districtService.findDistrictById(param.getParentId());
		String error="添加区域时，";
		if(parent == null){
			error+="获取父区域时出错";
System.out.println(error);
			return JsonResult.build(500, error);
		}else{
			int retur=0;
			if(param.getActionType()==1){
				TblDistrict newDis=new TblDistrict();
				newDis.setParentId(parent.getId());
				newDis.setCreatedDate(new Date());
				newDis.setUpdatedDate(new Date());
				newDis.setStatus(0);
				newDis.setLatitude(param.getLatitude());
				newDis.setLongitude(param.getLongitude());
				newDis.setDisCode(param.getDisCode());
				newDis.setDisLogicAddress(param.getDisAddress());
				newDis.setRemark(param.getDisRemark());
				newDis.setDisName(param.getDisName());
				newDis.setAreaLevelId(parent.getAreaLevelId()+1);
				retur =districtService.saveDistrict(newDis);
				//添加成功后，因为节点信息已经修改，所以需要重新来加载树节点
				cacheService.deleteDistrictTree();
System.out.println("the return -----is " + retur);
			}else{
				return JsonResult.build(500, "错误的参数类型");
			}
			return JsonResult.ok(retur);
		}
		//return onResult(new Object(),500,"");
	}
	
	@RequestMapping("/update/{id}")
	@ResponseBody
	public JsonResult updateDistrict(@PathVariable("id") long id ,@ModelAttribute DistrictParam param ){
		TblDistrict d = districtService.findDistrictById(id);
		if(d == null){
			return JsonResult.build(500, "修改区域时，根据ID号获取区域时出错！");
		}else{
			if(param.getActionType()==2){
				d.setLatitude(param.getLatitude());
				d.setLongitude(param.getLongitude());
				d.setDisCode(param.getDisCode());
				d.setDisLogicAddress(param.getDisAddress());
				d.setRemark(param.getDisRemark());
				d.setDisName(param.getDisName());
				d.setUpdatedDate(new Date());
				d.setStatus(0);
				int result=districtService.updateDistrict(d);
				//修改成功后，因为节点信息已经修改，所以需要重新来加载树节点
				cacheService.deleteDistrictTree();
				return JsonResult.ok(result);
			}else{
				return JsonResult.build(500, "错误的参数类型");
			}
		}
	}
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public JsonResult deleteDistrict(@PathVariable("id") long id){
		int res=districtService.deleteById(id);
		//删除成功后，因为节点信息已经修改，所以需要重新来加载树节点
		cacheService.deleteDistrictTree();
		return JsonResult.ok(res);
	}
	
	@RequestMapping("/{id}")
	@ResponseBody
	public JsonResult getDistrictById(@PathVariable("id") long id){
		TblDistrict districtById = districtService.findDistrictById(id);
		return onResult(districtById, 500, "获取此区域失败");
	}
	
}
