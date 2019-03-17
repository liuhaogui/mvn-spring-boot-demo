package com.alex.demo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * User: Alex
 * Date: 2019/3/17
 * Time: 00:00
 **/
@Data
@Table(name="user")
public class User {

    //定义主键id
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String userName;

    //不需要持久化的字段
    @Transient
    private String password;

}
