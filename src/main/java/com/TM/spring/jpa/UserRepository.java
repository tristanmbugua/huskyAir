package com.TM.spring.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories("com.*")
@EntityScan("com.spring.jpa.User")
@Repository
public interface UserRepository extends JpaRepository<User, String>{

}