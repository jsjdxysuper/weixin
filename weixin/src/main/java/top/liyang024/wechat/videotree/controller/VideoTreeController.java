package top.liyang024.wechat.videotree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.wechat.videotree.serv.VideoTreeServ;

@Controller
public class VideoTreeController {
	@Autowired
	private VideoTreeServ  videoTreeServ;
	
	@ResponseBody
	@RequestMapping(value="/catagoryTree/catagoryList",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String catagoryList() {
		List<TCatagorytree> catagoryList = videoTreeServ.catagoryList("second");
		List<TCatagorytree> catagorySubTreeList = videoTreeServ.catagoryList("third");
		for(int i=0;i<catagoryList.size();i++) {
			catagoryList.get(i).setSubTree(new ArrayList<TCatagorytree>());
			for(int j=0;j<catagorySubTreeList.size();j++) {
				if(catagorySubTreeList.get(j).getcParentid().
						equalsIgnoreCase(catagoryList.get(i).getcUid())) {
					catagoryList.get(i).getSubTree().add(catagorySubTreeList.get(j));
				}
			}
		}
		return JSONArray.fromObject(catagoryList).toString();
	}
}
