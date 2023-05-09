package person.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import person.bean.PersonDTO;

@Repository
@Transactional
public class PersonDAOMyBatis implements PersonDAO {
	@Autowired
	private SqlSession sqlSession; 
	
	@Override
	public void write(PersonDTO personDTO) {
		sqlSession.insert("personSQL.write",personDTO);
	}

	@Override
	public List<PersonDTO> getPersonlist() {
		return sqlSession.selectList("personSQL.getPersonlist");
	}

}
