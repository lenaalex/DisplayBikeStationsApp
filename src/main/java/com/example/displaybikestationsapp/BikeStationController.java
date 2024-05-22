package com.example.displaybikestationsapp;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
public class BikeStationController {
    private static final String API_URL = "https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json";
    @GetMapping("/")
    public String index(Model model) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        BikeStation[] response = restTemplate.getForObject(API_URL, BikeStation[].class);
        List<BikeStation> stations = Arrays.asList(response);
        model.addAttribute("stations", stations);
        return "index";
    }


}
