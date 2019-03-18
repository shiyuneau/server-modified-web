package com.web.servermodified.service.impl;

import com.web.servermodified.server.ElasticUtil;
import com.web.servermodified.service.ESService;
import com.web.servermodified.util.HttpUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-18 9:43
 */
@Service
public class ESServiceImpl implements ESService {

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
    public List<String> indexList(String url) {
        return ElasticUtil.indexList(url);
    }

    @Override
    public String fieldList(String url, String indexName) {
        String indexSite = url + "/" + indexName;
        return ElasticUtil.indexFieldString(indexSite,indexName);
    }

    @Override
    public String indexDataInfo(String url) {

        return ElasticUtil.indexFirstInfo(url);
    }
}
