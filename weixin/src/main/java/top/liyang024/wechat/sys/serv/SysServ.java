package top.liyang024.wechat.sys.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TSysCodeMapper;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeExample;

@Component
public class SysServ {
	@Autowired
	TSysCodeMapper tSysCodeMapper;
	
	public List<TSysCode>retrieveSysCodeList(String cTypeid,String cid){
		TSysCodeExample example = new TSysCodeExample();
		example.createCriteria().andCTypeidEqualTo(cTypeid).andCIdEqualTo(cid);
		example.setOrderByClause("c_index");
		List<TSysCode> selectByExample = tSysCodeMapper.selectByExample(example);
		return selectByExample;
	}
}
