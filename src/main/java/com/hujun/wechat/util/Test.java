package com.hujun.wechat.util;

import com.hujun.wechat.util.WeiXinUtil;

public class Test {
    public static void main(String[] args) {
        String access_token = WeiXinUtil.getAccess_Token();
        System.out.println("调用成功access_token:"+access_token);
    }
}
