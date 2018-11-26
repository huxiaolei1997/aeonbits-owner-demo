package com.test;

import org.aeonbits.owner.Tokenizer;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @version $Id: CustomDashTokenizer, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年11月26日 20:26 胡晓磊 Exp $
 */
public class CustomDashTokenizer implements Tokenizer {
    @Override
    public String[] tokens(String s) {
        return s.split("-", -1);
    }
}
