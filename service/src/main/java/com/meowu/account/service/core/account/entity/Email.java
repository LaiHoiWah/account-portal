package com.meowu.account.service.core.account.entity;

import com.meowu.commons.doamin.Creatable;
import com.meowu.commons.doamin.Entity;
import com.meowu.commons.doamin.Updatable;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Email extends Entity<Long> implements Creatable, Updatable{

    private String accountId;
    private String address;
    private Date   createTime;
    private Date   updateTime;
}
