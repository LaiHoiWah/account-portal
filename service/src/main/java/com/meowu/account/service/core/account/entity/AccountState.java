package com.meowu.account.service.core.account.entity;

import com.google.gson.annotations.SerializedName;
import com.meowu.commons.security.exception.IllegalArgumentException;
import com.meowu.commons.utils.AssertUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AccountState {

    @SerializedName("0")
    NORMAL(0),

    @SerializedName("1")
    LOCKED(1),

    @SerializedName("2")
    FROZEN(2),

    ;

    private int id;

    public static AccountState getById(Integer id){
        AssertUtils.notNull(id, "account state id must not be null");

        for(AccountState state : AccountState.values()){
            if(state.getId() == id){
                return state;
            }
        }

        throw new IllegalArgumentException("invalid state id: [{0}]", id);
    }
}
