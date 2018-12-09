package top.liyang024.wechat.resouce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import top.liyang024.table.dao.TSysCodeMapper;
import top.liyang024.table.dao.TSysCodeValMapper;
import top.liyang024.table.dao.TUploadresMapper;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeExample;
import top.liyang024.table.domain.TSysCodeKey;
import top.liyang024.table.domain.TSysCodeVal;
import top.liyang024.table.domain.TSysCodeValExample;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.table.domain.TUploadresExample;

@Component
public class UploadFileService {
	
	@Autowired
	private TSysCodeMapper sysCodeMapper;
	@Autowired
	private TSysCodeValMapper sysCodeValMapper;
	@Autowired
	private TUploadresMapper uploadresMapper;
	
	public List<TSysCodeVal>getFileTypeList(){
//		TSysCodeExample example = new TSysCodeExample();
//		example.createCriteria().andCTypeidEqualTo("uploadrec").andCIdEqualTo("resType");
//		example.setOrderByClause("c_index");
		TSysCodeKey key = new TSysCodeKey();
		key.setcTypeid("uploadrec");
		key.setcId("resType");
		TSysCode sysCode = sysCodeMapper.selectByPrimaryKey(key);
		
		TSysCodeValExample example = new TSysCodeValExample();
		example.createCriteria().andCTypeidEqualTo(sysCode.getcTypeid()).andCIdEqualTo(sysCode.getcId());
		example.setOrderByClause("c_index");
		List<TSysCodeVal> sysCodeValList = sysCodeValMapper.selectByExample(example);
		return sysCodeValList;
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
	
	public List<TUploadres>getUploadresList(){
		TUploadresExample example = new TUploadresExample();
		example.setOrderByClause("c_date desc,c_time desc");
		List<TUploadres> selectByExample = uploadresMapper.selectByExample(example);
		return selectByExample;
	}
	public int deleteFile(String fileName) {
		int count = uploadresMapper.deleteByPrimaryKey(fileName);
		return count;
	}
	
	public int batchDeleteFile(String []fileName) {
		List<String> values = new ArrayList<String>(Arrays.asList(fileName));
		TUploadresExample example = new TUploadresExample();
		example.createCriteria().andCFilenameIn(values);
		int count = uploadresMapper.deleteByExample(example);
		return count;
	}
}
