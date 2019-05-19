package com.mighty.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mighty
 * @create 2019-05-19 15:16
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e:elements
             ) {
            e.accept(visitor);
        }
    }
}
