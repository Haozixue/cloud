package cn.cloud.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        String url = "http://SERVICE-HI/hi?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }
}
