package com.company.designPattern.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        System.out.println(String.format("Reader %s 로 연결합니다.", fileName));
    }

    public void fileDisconnect() {
        System.out.println(String.format("Reader %s 로 연결 종료 합니다.", fileName));
    }

    public void write() {
        System.out.println(String.format("Reader %s 로 파일쓰기를 합니다.", fileName));
    }
}
