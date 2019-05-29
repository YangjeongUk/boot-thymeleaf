package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.domain.User;

@Repository
public interface UserRepository 
	extends JpaRepository<User, Long> { //검색할 때 필요한 부분
	List<User> findByName(String name);
	List<User> findByCompany(String company);
	User findByUserId(String userId); //ByUserId== where userId='' 
}
