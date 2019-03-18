package com.web.servermodified.service;


import com.web.servermodified.domain.Per;
import com.web.servermodified.util.Message;

import java.util.List;

public interface PerService {

    // 查询
    List<Per> getPers(String name, String ageStr);

    // 新增
    Message<Per> addPer(String name, String age, String address);

    // 修改
    Message<Per> modifyPer(Integer id, String name, String ageStr, String address);

    // 删除
    Message<Per> removePerById(Integer id);
}
