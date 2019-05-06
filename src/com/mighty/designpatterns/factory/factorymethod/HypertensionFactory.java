package com.mighty.designpatterns.factory.factorymethod;

/**
 * @author mighty
 * @create 2019-04-11 17:00
 */
public class HypertensionFactory extends IChronicDiseaseFactory{
    @Override
    public ChronicDisease createChronicDisease() {
        return new Hypertension("高血压");
    }
}
