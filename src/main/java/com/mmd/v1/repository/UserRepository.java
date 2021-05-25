package com.mmd.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mmd.v1.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long>{

}
