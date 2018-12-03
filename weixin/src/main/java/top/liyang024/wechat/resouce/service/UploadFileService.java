package top.liyang024.wechat.resouce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	@Autowired
	public TUploadresMapper uploadresMapper;
	
	public List<TSysCode>getFileTypeList(){
		TSysCodeExample example = new TSysCodeExample();
		example.createCriteria().andCTypeidEqualTo("uploadrec");
		example.setOrderByClause("c_index");
		List<TSysCode>sysCodeList = sysCodeMapper.selectByExample(example);
		return sysCodeList;
	}
	
	public int storeFileList(List<TUploadres> fileProList) {
		int insertCount = 0;
		int oneInsertCount =0;
		for(int i=0;i<fileProList.size();i++) {
			oneInsertCount = uploadresMapper.insert(fileProList.get(i));
			insertCount += oneInsertCount;
		}
		return insertCount;
	}
}
