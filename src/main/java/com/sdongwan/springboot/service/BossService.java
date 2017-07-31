package com.sdongwan.springboot.service;

import com.sdongwan.springboot.bean.Boss;
import com.sdongwan.springboot.mapper.BossMapper;
import com.sdongwan.springboot.mapper.BossXmlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/30.
 */
@Service
public class BossService {
    @Autowired
    private BossMapper bossMapper;

    @Autowired
    private BossXmlMapper bossXmlMapper;

    public BossMapper getBossMapper() {
        return bossMapper;
    }

    public void setBossMapper(BossMapper bossMapper) {
        this.bossMapper = bossMapper;
    }

    public BossXmlMapper getBossXmlMapper() {
        return bossXmlMapper;
    }

    public void setBossXmlMapper(BossXmlMapper bossXmlMapper) {
        this.bossXmlMapper = bossXmlMapper;
    }

    public BossService() {
    }

    public Boss findBossByName(String name) {

        return bossXmlMapper.findBossByNameByXml(name);
    }


}
