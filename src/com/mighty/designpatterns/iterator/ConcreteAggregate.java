package com.mighty.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mighty
 * @create 2019-05-09 16:54
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<Object>(10);

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public Object set(int index, Object object) {
        return items.set(index, object);
    }

    public Object add( Object object) {
        return items.add(object);
    }
}
