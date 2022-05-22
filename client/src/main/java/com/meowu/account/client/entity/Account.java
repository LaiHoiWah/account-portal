package com.meowu.account.client.entity;

import com.meowu.commons.doamin.Creatable;
import com.meowu.commons.doamin.Deletable;
import com.meowu.commons.doamin.Entity;
import com.meowu.commons.doamin.Updatable;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Account extends Entity<Long> implements Creatable, Updatable, Deletable{

    private String  username;
    private String  nickname;
    private String  headImg;
    private String  backgroundImg;
    private String  description;
    private String  email;
    private String  phoneCode;
    private String  phone;
    private Integer gender;
    private Integer state;
    private Boolean delete;
    private Date    createTime;
    private Date    updateTime;
    private Date    deleteTime;
}
