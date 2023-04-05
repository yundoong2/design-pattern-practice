package com.company.designPattern.singleton;

/**
 * SocketClient를 사용하는 A 클래스
 * @author cyh68
 * @since 2023-04-05
 **/
public class AClazz {
    private SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
