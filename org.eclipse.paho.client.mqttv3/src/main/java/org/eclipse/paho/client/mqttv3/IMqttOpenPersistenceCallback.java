package org.eclipse.paho.client.mqttv3;

public interface IMqttOpenPersistenceCallback {
    public String openDirectory(String clientId, String serverURI);
}