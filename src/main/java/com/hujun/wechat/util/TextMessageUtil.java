package com.hujun.wechat.util;

import com.thoughtworks.xstream.XStream;
import com.hujun.wechat.entity.MessageText;

import java.util.Date;

public  class TextMessageUtil implements BaseMessageUtil<MessageText> {

        /**
         * 将发送消息封装成对应的xml格式
         */
        public  String messageToxml(MessageText  message) {
            XStream xstream  = new XStream();
            xstream.alias("xml", message.getClass());
            return xstream.toXML(message);
        }

    @Override
        //添加封装发送消息的方法，重载，将内容传入
        public String initMessage(String FromUserName, String ToUserName,String Content) {
            MessageText text = new MessageText();
            text.setToUserName(FromUserName);
            text.setFromUserName(ToUserName);
            text.setContent("您输入的内容是："+Content);
            text.setCreateTime(new Date().getTime());
            text.setMsgType("text");
            return  messageToxml(text);
        }

    }
