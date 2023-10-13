package com.example.wallet_app2.app;

public abstract class PageNavigator {

    public abstract String title();

    public abstract String instruction();

    protected PageNavigator nextPage;

    public abstract void setNextPage(PageNavigator nextPage);

    public PageNavigator getNextPage() {
        return this.nextPage;
    }
}
