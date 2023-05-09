package user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void write(UserDTO userDTO) {
		userDAO.save(userDTO);
	}

	@Override
	public List<UserDTO> getUserList() {
		return userDAO.findAll();
	}

	@Override
	public String isExistId(String id) {
		Optional<UserDTO> userDTO = userDAO.findById(id);   
		System.out.println(userDTO); // id가 없으면 Optional.empty 출력된다.
		
		if(userDTO.isPresent()) //userDTO 가 존재하는지 
			return "exist";
		else 
			return "non_exist";
		
		
	}
	

}







