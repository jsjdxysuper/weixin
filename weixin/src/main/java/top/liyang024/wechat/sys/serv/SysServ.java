package top.liyang024.wechat.sys.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TSysCodeMapper;
import top.liyang024.table.dao.TUploadresMapper;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeExample;
import top.liyang024.table.domain.TUploadresExample;

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
	
	public List<TCatagorytree>retrieveSysCodeVideoList(String cTypeid,String cid){

		List<TCatagorytree> selectRealVideoList = tSysCodeMapper.selectRealVideoList(cTypeid, cid);
		
		return selectRealVideoList;
	}
}
