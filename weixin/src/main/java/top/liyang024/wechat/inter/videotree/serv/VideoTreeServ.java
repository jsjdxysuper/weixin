package top.liyang024.wechat.inter.videotree.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TCatagorytreeMapper;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TCatagorytreeExample;

@Component
public class VideoTreeServ {
	@Autowired
	private TCatagorytreeMapper catagorytreeMapper;
	
	public List<TCatagorytree>catagoryList(){
		TCatagorytreeExample example = new TCatagorytreeExample();
		example.createCriteria().andCLayeridEqualTo("second");
		List<TCatagorytree> catagoryList = catagorytreeMapper.selectByExample(example);
		return catagoryList;
	}
}
