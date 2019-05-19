package com.mighty.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mighty
 * @create 2019-05-17 15:32
 */
public class WebsiteFactory {

    private Map<String, WebSite> flyweights = new HashMap<String, WebSite>();

    public WebSite getWebSiteCatefory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    public int getSiteCount() {
        return flyweights.size();
    }

}
