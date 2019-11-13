package com.hujun.wechat.entity;

/**
 *
 * 类名称: VoiceMessage
 * 类描述: 语音消息
 */
public class VoiceMessage extends BaseMessage{

    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }


}