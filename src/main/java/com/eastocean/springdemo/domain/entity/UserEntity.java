package com.eastocean.springdemo.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description: 用户entith
 * @Author: eastOcean
 * @Date:
 */
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(unique = true, length = 36)
    @JSONField(ordinal = 0)
    private String id;


    @Column(name = "name")
    @JSONField(ordinal = 5)
    private String name;
    @Column
    @JSONField(ordinal = 4)
    private String age;
    @JSONField(ordinal = 3)
    @Column(name = "birth_day")
    private String birthDay;
    @JSONField(ordinal = 5)
    @Column(name = "create_time")
    private Date createTime;
    @JSONField(ordinal = 6)
    @Column(name = "update_time")
    private Date updateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
