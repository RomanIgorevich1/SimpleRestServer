package com.example.demo.services;

import com.example.demo.dto.Cat;
import com.example.demo.dto.Facts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Service
public class CatService {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public Cat getFact() {
        String url = "https://catfact.ninja/fact";
        return restTemplate.getForObject(url, Cat.class);
    }

    public Facts getFacts() {
        String url = "https://catfact.ninja/facts";
        return restTemplate.getForObject(url, Facts.class);
    }
}
