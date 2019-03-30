package top.liyang024.wechat.catagorytree.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TCatagorytreeMapper;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TCatagorytreeExample;

@Component
public class CatagoryTreeServ {
	@Autowired
	private TCatagorytreeMapper catagorytreeMapper;
	
	public List<TCatagorytree>catagoryParentList(){
		TCatagorytreeExample example = new TCatagorytreeExample();
		List<String> values = new ArrayList<String>();
		values.add("first");
		values.add("second");
		example.createCriteria().andCLayeridIn(values);
		List<TCatagorytree> catagoryList = catagorytreeMapper.selectByExample(example);
		return catagoryList;
	}
	public List<TCatagorytree>allCatagory(){
		TCatagorytreeExample example = new TCatagorytreeExample();
		example.createCriteria();
		List<TCatagorytree> catagoryList = catagorytreeMapper.selectByExample(example);
		return catagoryList;
	}
	
	public boolean saveCatagory(TCatagorytree catagorytree) {
		long timeMiliSec = System.currentTimeMillis();
		catagorytree.setcUid(timeMiliSec+"");
		int count = catagorytreeMapper.insert(catagorytree);
		if(count>0)
			return true;
		else
			return false;
	}
	
	public boolean updateCatagory(TCatagorytree catagorytree) {
		int count = catagorytreeMapper.updateByPrimaryKey(catagorytree);
		if(count>0)
			return true;
		else
			return false;
	}
	
	public boolean delCatagory(String catagoryId) {
		int count = catagorytreeMapper.deleteByPrimaryKey(catagoryId);
		if(count>0)
			return true;
		else
			return false;
	}
}
