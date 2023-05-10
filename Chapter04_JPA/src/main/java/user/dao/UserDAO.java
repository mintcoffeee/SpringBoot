package user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, String>{
	
	//쿼리 메소드
	//select * from usertable where name like '%' || ? || '%'
	
	//findByName //select * from usertable where name = ? 
	public List<UserDTO> findByNameContaining(String keyword);
	
	//select * from usertable where id like '%' || ? || '%'
	public List<UserDTO> findByIdContaining(String keyword);
}
