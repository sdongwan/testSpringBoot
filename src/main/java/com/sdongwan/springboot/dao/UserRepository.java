package com.sdongwan.springboot.dao;

import com.sdongwan.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/7/28.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
