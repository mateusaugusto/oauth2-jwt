package com.service.oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.service.oauth2.model.entity.User;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(@Param("username") String username);

}
