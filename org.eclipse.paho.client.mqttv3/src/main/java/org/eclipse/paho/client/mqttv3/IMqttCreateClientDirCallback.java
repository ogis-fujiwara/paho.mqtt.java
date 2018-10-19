package org.eclipse.paho.client.mqttv3;

public interface IMqttCreateClientDirCallback {
    public String createClientDir(String clientId, String serverURI);
}