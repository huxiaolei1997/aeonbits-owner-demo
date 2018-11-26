package com.test;

import org.aeonbits.owner.Config;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: ServerConfig, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年11月26日 19:39 胡晓磊 Exp $
 */
@Config.Sources({"classpath:ServerConfig.properties"})
public interface ServerConfig extends Config {
    @Key("port")
    int port();

    String hostname();

    @DefaultValue("42")
    int maxThreads();
}
