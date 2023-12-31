package com.example.demo.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	@Query(value="select * from user where role_id=?1", nativeQuery = true)
	public List<User> finduserbyroleid(int id);
	
	@Query(value="select * from user where id=?1", nativeQuery = true)
	public User findUserByUserId(int id);
}
