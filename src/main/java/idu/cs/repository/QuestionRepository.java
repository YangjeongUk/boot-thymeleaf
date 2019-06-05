package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.entity.QuestionEntity;
import idu.cs.entity.UserEntity;

@Repository
public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> { //검색할 때 필요한 부분
	//findById, save, delete 선언없이도 구현 가능
	
	//아래 메소드들은 선언해야  JPA 규칙에 의해 구현됨
	//find - select문 , by -where, OrderBy -order by, ASC와 DESC를 함께 사용

	UserEntity findByWriter(String writer); //ByUserId== where userId='' 
}
