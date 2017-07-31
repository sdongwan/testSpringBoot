package com.sdongwan.springboot.controller;

import com.sdongwan.springboot.bean.Boss;
import com.sdongwan.springboot.bean.User;
import com.sdongwan.springboot.dao.UserRepository;
import com.sdongwan.springboot.service.BossService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/28.
 */
@Controller("com.sdongwan.springboot.controller.HelloController")
//@ComponentScan("com.sdongwan.springboot.dao")  //指定在哪个包下扫描bean，不指定默认在Application类所在的文件夹下扫描
//@ComponentScan("com.sdongwan.springboot.mapper")
//@ComponentScan("com.sdongwan.springboot.service")
public class HelloController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BossService bossService;


    private Logger logger = Logger.getLogger("testMybatis");

//    @Autowired
//    private BossXmlMapper bossXmlMapper;
//
//    public BossXmlMapper getBossXmlMapper() {
//        return bossXmlMapper;
//    }
//
//    public void setBossXmlMapper(BossXmlMapper bossXmlMapper) {
//        this.bossXmlMapper = bossXmlMapper;
//    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {


        this.userRepository = userRepository;
    }

    public BossService getBossService() {
        return bossService;
    }

    public void setBossService(BossService bossService) {
        this.bossService = bossService;
    }

    @RequestMapping(value = "/getList")
    @ResponseBody
    public String getList() {

        return "list";
    }

    /**
     * 调用resources包下的templates下的index.html页面
     *
     * @return
     */
    @RequestMapping(value = "/")
    public String welcomePage() {
        System.out.println("first");
        return "index";
    }

    @RequestMapping(value = "/testJpa")
    @ResponseBody  //添加这个注解表示把返回值直接返回给浏览器展示
    public String testJpa() {

//        测试jpa的保存
        User User = new User("sdongwan", "sdongwan", 18);
        userRepository.save(User);

        return User.toString();
    }


    @ResponseBody
    @RequestMapping(value = "/testMybatis")
    public String testMyBatis() {
//        Boss boss = new Boss("sdongwan", "18");
//        bossMapper.insertBoss(boss);
        Boss boss = bossService.findBossByName("sdongwan");
        Boss boss1 = bossService.findBossByName("sdongwan");

        logger.info(boss);
        logger.info(boss1);

        return "mybatis";
    }

//    @ResponseBody
//    @RequestMapping(value = "/testMybatisXml")
//    public String testMyBatisByXml() {
//        Boss boss = new Boss("sdongwan", "18");
//        bossXmlMapper.insertBossByXml(boss);
//        return "mybatisxml";
//    }


}
