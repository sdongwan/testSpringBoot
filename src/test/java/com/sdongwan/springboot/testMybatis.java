package com.sdongwan.springboot;

import com.sdongwan.springboot.bean.Boss;
import com.sdongwan.springboot.mapper.BossXmlMapper;
import com.sdongwan.springboot.service.BossService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Administrator on 2017/7/30.
 */
//注意书写测试类所在的文件夹会影响测试的正常；
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class testMybatis {
    @Autowired
    private BossService bossService;

    @Autowired
    private BossXmlMapper bossXmlMapper;

    private Logger logger = Logger.getLogger("testMybatis");

    @Test
    public void testFindBossByName() {
        Boss bos = bossService.findBossByName("sdongwan");
        Boss bos1 = bossService.findBossByName("sdongwan");
        System.out.println(bos.getBossName());
        System.out.println(bos1.getBossName());

    }

    @Test
    public void testBossXmlMapper() {
        Boss boss = bossXmlMapper.findBossByNameByXml("sdongwan");
        Boss boss1 = bossXmlMapper.findBossByNameByXml("sdongwan");
        logger.info(boss);
        logger.info(boss1);
        logger.debug(boss);
        logger.debug(boss1);
        System.out.println(boss.getBossName());
        System.out.println(boss1.getBossName());
    }


}
