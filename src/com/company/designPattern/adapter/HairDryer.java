package com.company.designPattern.adapter;

public class HairDryer implements Electronic110v{
    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v On");
    }
}
