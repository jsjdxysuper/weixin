package top.liyang024.wechat.index.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import top.liyang024.table.dao.TUrlMapper;
import top.liyang024.table.domain.TUrl;
import top.liyang024.table.domain.TUrlExample;

@Component
public class IndexServ {
	@Autowired
	private TUrlMapper tUrlMapper;
	
	/**
	 * 形成两级菜单
	 * @return
	 */
	public List<TUrl> searchMenuTree() {
		TUrlExample example = new TUrlExample();
		example.createCriteria();
		example.setOrderByClause(" c_index");
		List<TUrl> tList = tUrlMapper.selectByExample(example);
		List<TUrl>parentList = new ArrayList<TUrl>();
		for(int i=0;i<tList.size();i++) {
			if(tList.get(i).getcParentid()==null)
				parentList.add(tList.get(i));
		}
		
		for(int j=0;j<parentList.size();j++) {
			parentList.get(j).setSubMenu(new ArrayList<TUrl>());
			for(int i=0;i<tList.size();i++) {
				if(tList.get(i).getcParentid()!=null&&
						tList.get(i).getcParentid().equalsIgnoreCase(parentList.get(j).getcId())) {
					parentList.get(j).getSubMenu().add(tList.get(i));
				}
			}
		}
		return parentList;
	}
}
