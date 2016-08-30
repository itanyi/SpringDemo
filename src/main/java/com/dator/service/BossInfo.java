package com.dator.service;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by tanyi on 16/8/30.
 */
@Data
@Component
public class BossInfo {
    private String name;
    private String id;
    private String title;
}
