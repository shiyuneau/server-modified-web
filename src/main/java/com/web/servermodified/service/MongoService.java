package com.web.servermodified.service;

import java.util.List;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-18 9:41
 */
public interface MongoService {

    public int ipTelnet(String url);

    public List<String> databaseList(String ip);
}
