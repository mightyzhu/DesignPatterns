package com.mighty.designpatterns.mediator;

/**
 * 国家
 * @author mighty
 * @create 2019-05-14 15:52
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }


}
