package com.company.designPattern.proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    /**
     * 처음 객체가 없으면 생성하고, 이후부터는 기존 객체를 가져와 사용
     * @return Html {@link Html}
     */
    @Override
    public Html show() {
        if(html == null) {
            html = new Html(url);
            System.out.println("BrowserProxy loading from : " + url);
        }

        System.out.println("BrowserProxy use cache html : " + url);
        return html;
    }
}
