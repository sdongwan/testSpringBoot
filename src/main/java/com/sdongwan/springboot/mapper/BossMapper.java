package com.sdongwan.springboot.mapper;

import com.sdongwan.springboot.bean.Boss;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/29.
 */

/**
 * 使用mybatis库实现对mysql的操作，这里使用注解的方式，还有一种是使用xml的方式；
 */
@Mapper
@Component
public interface BossMapper {
    @Select("select * from boss where bossName= #{bossName}")
    Boss findBossByName(@Param("bossName") String bossName);

    @Insert("insert into boss(bossName,bossAge) values (#{bossName},#{bossAge}) ")
    void insertBoss(Boss boss);

}
