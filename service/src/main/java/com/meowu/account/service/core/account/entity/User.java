package com.meowu.account.service.core.account.entity;

import com.meowu.commons.doamin.Creatable;
import com.meowu.commons.doamin.Entity;
import com.meowu.commons.doamin.Updatable;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User extends Entity<Long> implements Creatable, Updatable{

    private Long   accountId;
    private String nickname;
    private String headImg;
    private String backgroundImg;
    private String description;
    private Gender gender;
    private Date   createTime;
    private Date   updateTime;
}
