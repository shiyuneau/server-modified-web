package com.web.servermodified.web;

import com.web.servermodified.service.ESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shiyu
 * @Description es服务的相关描述
 * @create 2019-03-18 9:41
 */
@Controller
@RequestMapping("/es")
public class ESServiceController {

    @Autowired
    private ESService esService;

    @RequestMapping("/ipSearch")
    @ResponseBody
    public int ipTelnet(@RequestParam("ip") String ip) {

        String url = "http://" + ip + ":9200/";
        return esService.ipTelnet(url);
    }

    @RequestMapping("/indexList")
    @ResponseBody
    public List<String> indexList(@RequestParam("ip") String ip) {
        String url = "http://" + ip + ":9200/";
        return esService.indexList(url);
    }

    @RequestMapping("/indexField")
    @ResponseBody
    public String indexFieldInfo(@RequestParam("ip") String ip , @RequestParam("indexName") String indexName) {
        String url = "http://" + ip + ":9200/";
        return esService.fieldList(url,indexName);
    }

    @RequestMapping("/indexData")
    @ResponseBody
    public String indexDataInfo(@RequestParam("ip") String ip , @RequestParam("indexName") String indexName) {
        String url = "http://"+ip + ":9200/"+indexName + "/_search?size=1";
        return esService.indexDataInfo(url);
    }

}
