package com.christianreihms.sensitivityconverter.service;

import com.christianreihms.sensitivityconverter.model.ConverterModel;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    public float findCm(ConverterModel model) {
        // return cm/360 given sens & dpi
        return (model.getDpi() / (model.getSens() * model.getMultiplier()));
    }

    public float findSens(ConverterModel model) {
        // return in-game sens given cm/360
        return (model.getDpi() / (model.getCm() * model.getMultiplier()));
    }
}