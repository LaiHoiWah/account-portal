package com.meowu.account.service.core.account.entity;

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

    private String       username;
    private String       password;
    private AccountState state;
    private Boolean      delete;
    private Date         createTime;
    private Date         updateTime;
    private Date         deleteTime;
}
