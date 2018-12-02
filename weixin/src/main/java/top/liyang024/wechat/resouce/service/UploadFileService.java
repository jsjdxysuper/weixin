package top.liyang024.wechat.resouce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TSysCodeMapper;
import top.liyang024.table.dao.TUploadresMapper;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeExample;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.table.domain.TUploadresExample;

@Component
public class UploadFileService {
	
	@Autowired
	public TSysCodeMapper sysCodeMapper;
	
	public List<TSysCode>getFileTypeList(){
		TSysCodeExample example = new TSysCodeExample();
		example.createCriteria().andCTypeidEqualTo("uploadrec");
		example.setOrderByClause("c_index");
		List<TSysCode>sysCodeList = sysCodeMapper.selectByExample(example);
		return sysCodeList;
	}
}
