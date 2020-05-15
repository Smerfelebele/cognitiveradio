package com.cognitiveradio.controllers;

import com.cognitiveradio.entities.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognitiveradio.services.RadioService;
import com.google.gson.Gson;
import java.util.List;

@RestController
public class RadioController {

    @Autowired
    RadioService radioService;

    @RequestMapping(value = "/getInformation")
    public String getInformation() {
        List<Information> information = radioService.getInformation();
        //Gson gson = new Gson();

        //return gson.toJson(peoples);
        return "yes";
    }

}
