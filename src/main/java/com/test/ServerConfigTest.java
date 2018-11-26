package com.test;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: ServerConfigTest, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年11月26日 19:42 胡晓磊 Exp $
 */
public class ServerConfigTest {
    public static void main(String[] args) {
        ServerConfig serverConfig = ConfigFactory.create(ServerConfig.class);
//        ServerConfig serverConfig = ConfigCache.getOrCreate(ServerConfig.class);
        System.out.println(serverConfig.port() + ", " + serverConfig.hostname() + ", " + serverConfig.maxThreads());
    }
}
