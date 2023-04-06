package com.company.designPattern.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        System.out.println(String.format("Reader %s 로 연결합니다.", fileName));
    }

    public void fileRead() {
        System.out.println(String.format("Reader %s 의 내용을 읽어 옵니다.", fileName));
    }

    public void fileDisconnect() {
        System.out.println(String.format("Reader %s 로 연결 종료 합니다.", fileName));
    }
}
