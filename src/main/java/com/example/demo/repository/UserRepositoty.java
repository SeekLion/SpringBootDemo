package com.example.demo.repository;

import com.example.demo.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<UserBean,Long> {
    @Query("select t from UserBean t where t.name=:name")
    UserBean findByUserName(@Param("name") String name);
}
