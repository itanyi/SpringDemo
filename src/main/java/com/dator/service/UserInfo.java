package com.dator.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tanyi on 16/8/30.
 */

@Data
@Component
public class UserInfo {

    @Autowired
    private BossInfo bossInfo;

    private String userName;
    private String userId;

    public void setBoss(String bossName) {
        bossInfo.setName(bossName);
    }
}
