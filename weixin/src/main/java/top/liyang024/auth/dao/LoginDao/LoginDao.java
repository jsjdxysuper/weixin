package top.liyang024.auth.dao.LoginDao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import top.liyang024.auth.domain.Bmbm;
import top.liyang024.auth.domain.UserPage;

@Component
public interface LoginDao {
	public Bmbm selectBmbm(String id);
	public int updateHardware(@Param("hardwareid")String hardwareid,@Param("userid")String userid);
	public List<UserPage> selectUserPage(String id);
}
