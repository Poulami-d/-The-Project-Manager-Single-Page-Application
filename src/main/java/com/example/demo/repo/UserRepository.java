package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query
    public User findByUserId(Integer userId);
    @Query
    public Integer deleteByUserId(Integer employeeId);

}
