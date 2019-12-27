package com.eastocean.springdemo.domain.repostory;

import com.eastocean.springdemo.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: eastOcean
 * @Date:
 */
@Repository
public interface UserRepo extends JpaRepository<UserEntity,String > {

}
