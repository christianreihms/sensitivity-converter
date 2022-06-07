package com.christianreihms.sensitivityconverter.controller;

import com.christianreihms.sensitivityconverter.model.ConverterModel;
import com.christianreihms.sensitivityconverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConverterController {

    ConverterModel converterModel = new ConverterModel();

    @Autowired
    private ConverterService converterService;

    @RequestMapping("/converter")
    public String getConverter(Model model) {
        model.addAttribute("converterModel", converterModel);
        return "converter";
    }

    @RequestMapping(value="/converter", params="findCm", method = RequestMethod.POST)
    public String findCm(@ModelAttribute("converterModel")  ConverterModel converterModel, Model model ){
        model.addAttribute("result", converterService.findCm(converterModel));
        return "converter";
    }

    @RequestMapping(value="/converter", params="findSens", method = RequestMethod.POST)
    public String findSens(@ModelAttribute("converterModel")  ConverterModel converterModel, Model model ){
        model.addAttribute("result2", converterService.findSens(converterModel));
        return "converter";
    }
}