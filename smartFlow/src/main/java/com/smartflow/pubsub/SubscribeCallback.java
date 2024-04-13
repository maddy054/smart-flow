package com.smartflow.pubsub;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.smartflow.enums.SensorType;
import com.smartflow.logics.SmartWater;
import com.smartflow.models.Sensor;

public class SubscribeCallback implements MqttCallback {
	SmartWater smartWater = new SmartWater();
    @Override
    public void connectionLost(Throwable cause) {
        // what happens when the connection is lost. We could reconnect here, for example.
    	System.out.println("cause"+cause);
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        // what happens when a new message arrive: in this case, we print it out.
    	  String receivedMsg = message.toString();
          if(receivedMsg.startsWith("VOLTAGE")) {
        	  smartWater.addSensorData(setSensor(receivedMsg));
          }
          
        System.out.println("Message arrived for the topic '" + topic + "': " + message.toString());

        // additional action for the Last Will and Testament message
        if ("home/LWT".equals(topic)) {
            System.err.println("Publisher is gone!");
        }
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        // called when delivery for a message has been completed, and all acknowledgments have been received
        // no-op, here
    }
    
    public Sensor setSensor(String message ) {
    	int index = message.indexOf(",");
    	Sensor sensor = new Sensor();
    	sensor.setLocationId(Integer.parseInt(message.substring(index+1,index+5)));
    	sensor.setParameter( SensorType.valueOf(message.substring(0, message.indexOf(","))));
    	sensor.setTime(System.currentTimeMillis());
    	sensor.setValue(message.substring(index+5));
    	
    	return sensor;
    }
}
