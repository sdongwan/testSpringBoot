package com.sdongwan.springboot.mapper;

import com.sdongwan.springboot.bean.Boss;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/29.
 */
@Component
public interface BossXmlMapper {

    Boss findBossByNameByXml(String bossName);

    void insertBossByXml(Boss boss);

}
