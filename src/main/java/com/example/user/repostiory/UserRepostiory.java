package com.example.user.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.UserEntity;

@Repository
public interface UserRepostiory extends JpaRepository<UserEntity, Long>{

	UserEntity findByUserId(Long userId);

}
