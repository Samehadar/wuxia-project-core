/*
* Created on :2016年6月17日
* Author     :songlin
* Change History
* Version       Date         Author           Reason
* <Ver.No>     <date>        <who modify>       <reason>
* Copyright 2014-2020 wuxia.tech All right reserved.
*/
package cn.wuxia.project.basic.core.conf.service;

import cn.wuxia.project.basic.core.conf.entity.OrderNoGenerate;
import cn.wuxia.project.common.service.CommonService;

public interface OrderNoGenerateService extends CommonService<OrderNoGenerate, String> {

    public long init(String code, long start, int step);

    public long init(String code, long start);

    public long next(String code);
}
