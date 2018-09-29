package com.fbq.springboot.mapper;

import com.fbq.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    @Query(value = "SELECT * FROM user", nativeQuery = true)
    List<User> findAllStudents();
    @Query(value="SELECT * FROM user WHERE ID = :id",nativeQuery = true)
    User findUserById(@Param("id") Integer id);
    @Query(value = "SELECT * FROM user WHERE ID = ? ",nativeQuery = true)
    User findUserByIdAsk(Integer id);
}
