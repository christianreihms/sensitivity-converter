package com.christianreihms.sensitivityconverter.service;

import com.christianreihms.sensitivityconverter.model.ConverterModel;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public float findCm(ConverterModel model) {
        // return cm/360 given sens & dpi
        return (800 / (model.getSens() * model.getMultiplier() * (model.getDpi() / 800)));
    }

    public float findSens(ConverterModel model) {
        // return in-game sens given cm/360
        return (800 / (model.getCm() * model.getMultiplier() * (model.getDpi() / 800)));
    }
}
