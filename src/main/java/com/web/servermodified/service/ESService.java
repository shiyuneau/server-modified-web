package com.web.servermodified.service;

import java.util.List;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-18 9:41
 */
public interface ESService {

    public int ipTelnet(String url);

    public List<String> indexList(String url);

    public String fieldList(String url , String indexName);

    public String indexDataInfo(String url);
}
