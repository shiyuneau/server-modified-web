package com.web.servermodified.web;

import com.web.servermodified.service.MongoService;
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
@RequestMapping("/mongo")
public class MongoServiceController {

    @Autowired
    private MongoService mongoService;

    @RequestMapping("/ipSearch")
    @ResponseBody
    public int ipTelnet(@RequestParam("ip") String ip) {

        String url = "http://" + ip + ":27017/";
        return mongoService.ipTelnet(url);
    }

    @ResponseBody
    @RequestMapping("dbList")
    public List<String> dbList(@RequestParam("ip") String ip) {
        return mongoService.databaseList(ip);
    }

}
