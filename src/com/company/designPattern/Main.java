package com.company.designPattern;

import com.company.designPattern.adapter.Cleaner;
import com.company.designPattern.adapter.Electronic110v;
import com.company.designPattern.adapter.HairDryer;
import com.company.designPattern.adapter.SocketAdapter;
import com.company.designPattern.aop.AopBrowser;
import com.company.designPattern.decorator.*;
import com.company.designPattern.observer.Button;
import com.company.designPattern.observer.IButtonListener;
import com.company.designPattern.proxy.Browser;
import com.company.designPattern.proxy.BrowserProxy;
import com.company.designPattern.proxy.IBrowser;
import com.company.designPattern.singleton.AClazz;
import com.company.designPattern.singleton.BClazz;
import com.company.designPattern.singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        /* 싱글톤 패턴 예제
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        */

        /* 어댑터 패턴 예제
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110v adapter = new SocketAdapter(cleaner);
        connect(adapter);*/

        /* 프록시 패턴 예제
        Browser browser = new Browser("www.naver.com");
        browser.show();

        IBrowser browserProxy = new BrowserProxy("www.naver.com");
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();
        browserProxy.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());*/

        /* 데코레이터 패턴 예제
        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();*/

        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");
    }

    //콘센트
    public static void connect(Electronic110v electronic110v) {
        electronic110v.powerOn();
    }
}
