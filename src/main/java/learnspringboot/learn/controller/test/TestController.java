package learnspringboot.learn.controller.test;

import learnspringboot.learn.common.MKLogBack;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }


    public static void main(String[] args) {
        String s = "[aaaaa[\"[[[]]\"][\"]bbbbb]";

        MKLogBack.getInstance().debug(s);
        MKLogBack.getInstance().debug(s.replaceAll("[\\[\\]]","").replaceAll("[\"]",""));
    }



}
