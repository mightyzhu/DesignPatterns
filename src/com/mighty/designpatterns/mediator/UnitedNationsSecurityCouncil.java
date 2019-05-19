package com.mighty.designpatterns.mediator;

/**
 * @author mighty
 * @create 2019-05-14 15:58
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA colleague1;
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void delacre(String msg, Country colleague) {
        if (colleague instanceof USA) {
            colleague2.getMessage(msg);
        } else {
            colleague1.getMessage(msg);
        }
    }
}
