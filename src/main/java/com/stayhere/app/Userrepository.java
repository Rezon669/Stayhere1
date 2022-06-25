package com.stayhere.app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, String>{

//	@Query("SELECT u.uid FROM User u WHERE" + " u.uname LIKE %?1% AND "+ " u.upass LIKE %?2%")
	//   public String finduser(@Param("name") String name,@Param("password")  String password); {

}
