package top.liyang024.wechat.catagorytree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import top.liyang024.base.RetJsonMsg;
import top.liyang024.table.dao.TUploadresMapper;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.table.domain.TUploadresExample;
import top.liyang024.wechat.catagorytree.serv.CatagoryTreeServ;

@Controller
public class CatagoryTreeController {
	
	@Autowired
	private CatagoryTreeServ catagoryTreeServ;
	@Autowired
	private TUploadresMapper uploadresMapper;
	
	@RequestMapping(value="/catagory/init")
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("catagoryList");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/catagory/list",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String catagoryTreeListTable() {
		List<TCatagorytree> allCatagoryList = catagoryTreeServ.allCatagory();
		
		return JSONArray.fromObject(allCatagoryList).toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/catagory/picFileList",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String getPicFiles(){
		TUploadresExample example = new TUploadresExample();
		example.createCriteria().andCFiletypeEqualTo("图片");
		example.setOrderByClause("c_date desc");
		List<TUploadres> picFileList = uploadresMapper.selectByExample(example);
		return JSONArray.fromObject(picFileList).toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/catagory/add",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String catagoryAdd(@ModelAttribute TCatagorytree catagory){
		boolean ret = catagoryTreeServ.saveCatagory(catagory);
		RetJsonMsg msg = new RetJsonMsg();
		if(ret) {
			msg.setCode(1);
			msg.setContent("添加树形资源成功");
			msg.setMsg("添加树形资源成功!"+catagory.getcUid());
		}else {
			msg.setCode(2);
			msg.setContent("添加树形资源失败");
			msg.setMsg("添加树形资源失败!");
		}
		return JSONObject.fromObject(msg).toString();
	}
	
	@ResponseBody
	@RequestMapping(value="/catagory/del",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String catagoryDel(String catagoryId){
		boolean ret = catagoryTreeServ.delCatagory(catagoryId);
		RetJsonMsg msg = new RetJsonMsg();
		if(ret) {
			msg.setCode(1);
			msg.setContent("删除树形资源成功");
			msg.setMsg("删除树形资源成功!"+catagoryId);
		}else {
			msg.setCode(2);
			msg.setContent("删除树形资源失败");
			msg.setMsg("删除树形资源失败!");
		}
		return JSONObject.fromObject(msg).toString();
	}
}
