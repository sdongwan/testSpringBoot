package com.sdongwan.springboot.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/29.
 */
public class Boss implements Serializable {
    private Integer bossId;
    private String bossName;
    private String bossAge;

    public Boss() {
    }

    public Boss(String bossName, String bossAge) {
        this.bossName = bossName;
        this.bossAge = bossAge;
    }

    public Integer getBossId() {
        return bossId;
    }

    public void setBossId(Integer bossId) {
        this.bossId = bossId;
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getBossAge() {
        return bossAge;
    }

    public void setBossAge(String bossAge) {
        this.bossAge = bossAge;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "bossId=" + bossId +
                ", bossName='" + bossName + '\'' +
                ", bossAge='" + bossAge + '\'' +
                '}';
    }
}
