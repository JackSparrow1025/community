package cn.itcast.listener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
/*
* 配置redis消息的监听器
*    获取redis中的消息并处理
* */
public class RedisMessageListener implements MessageListener {
    /*
    * message：完整的消息
    * bytes:获取的频道消息
    * */
    //处理消息
    @Override
    public void onMessage(Message message, byte[] bytes) {
        String channel=new String(message.getChannel());
        String msg=new String(message.getBody());
        System.out.println("频道："+channel+"获取的消息为："+msg);
    }
}
