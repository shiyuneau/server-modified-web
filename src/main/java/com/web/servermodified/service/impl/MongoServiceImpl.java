package com.web.servermodified.service.impl;

import com.web.servermodified.server.MongoUtil;
import com.web.servermodified.service.MongoService;
import com.web.servermodified.util.HttpUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-18 9:43
 */
@Service
public class MongoServiceImpl implements MongoService {
    @Override
    public int ipTelnet(String url) {
        boolean telnetFlag = HttpUtil.ipTelnetFlag(url);
        if (telnetFlag) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public List<String> databaseList(String ip) {
        return MongoUtil.mongoDatabaseList(ip);
    }
}
