package com.ruban.backend.SyncController;


import com.alibaba.fastjson.JSONObject;
import com.pangu.Http.response.RestResult;
import com.pangu.Mq.consumer.MqMessageListener;
import com.pangu.Mq.consumer.MqMessageListenerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

/**
 * @author liuzhaoluliuzhaolu
 * @date 2020-12-25 18:35
 * @desc mq消费demo，使用pangu
 * @prd
 * @Modification History:
 * Date         Author          Description
 * ------------------------------------------ *
 */
@MqMessageListenerConfig(topic = "ruban", consumerGroup = "zero")
@Component
public class MqConsumerDemo implements MqMessageListener {

    @Override
    public RestResult exec(ConsumerRecord<String, String> record) {
        System.out.println("===ruban consumer" + JSONObject.toJSONString(record));
        return RestResult.successResult();
    }
}
