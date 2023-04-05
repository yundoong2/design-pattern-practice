package com.company.designPattern.adapter;

/**
 * 220V에서 110V로 변환해줄 수 있는 변환기
 * @author cyh68
 * @since 2023-04-05
 **/
public class SocketAdapter implements Electronic110v{
    private Electronic220v electronic220v;

    public SocketAdapter(Electronic220v electronic220v) {
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
