package com.mighty.designpatterns.facade;

import com.mighty.designpatterns.factory.factorymethod.DiabetesFactory;
import com.mighty.designpatterns.factory.factorymethod.HypertensionFactory;
import com.mighty.designpatterns.factory.factorymethod.IChronicDiseaseFactory;

/**
 * @author mighty
 * @create 2019-04-15 16:34
 */
public class ControllerFacade {

    private IChronicDiseaseFactory hypertensionFactory = new HypertensionFactory();

    private IChronicDiseaseFactory diabetesFactory = new DiabetesFactory();


    /**
     * 慢性病验证

     * @param diebatesVal
     * @param hypertensVal
     * @return
     */
    public boolean chronicDiseaseVerify(Integer diebatesVal, Integer hypertensVal){
        if(hypertensionFactory.createChronicDisease().verify(hypertensVal)){
            // 列入高血压
            return true;
        }else if(diabetesFactory.createChronicDisease().verify(diebatesVal)){
            // 列入糖尿病
            return true;
        }
        return false;
    }

}
