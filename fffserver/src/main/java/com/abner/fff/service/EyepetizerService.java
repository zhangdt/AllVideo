package com.abner.fff.service;

import com.abner.fff.bean.EyeIndexTabsResp;
import org.springframework.stereotype.Service;

@Service
public interface EyepetizerService {

    EyeIndexTabsResp getIndexTabs(String url);
}
