package com.mighty.designpatterns.factory.factorymethod;

/**
 * @author mighty
 * @create 2019-04-11 17:03
 */
public class DiabetesFactory extends IChronicDiseaseFactory {
    @Override
    public ChronicDisease createChronicDisease() {
        return new Diabetes("糖尿病");
    }

}
