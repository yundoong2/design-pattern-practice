package com.company.designPattern.singleton;

/**
 * 싱글톤 패턴 예제 작성
 * @author cyh68
 * @since 2023-04-05
 **/
public class SocketClient {
    private static SocketClient socketClient = null;

    //기본 생성자를 private로 막음
    private SocketClient() {}

    //static 메소드를 통해서 인스턴스를 가져오도록 함
    public static SocketClient getInstance() {
        //객체가 null인 경우 새로 생성
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
