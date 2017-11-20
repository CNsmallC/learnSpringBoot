package learnspringboot.learn.controller.test;

import learnspringboot.learn.bean.ConfigBean;
import learnspringboot.learn.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableConfigurationProperties({ConfigBean.class})
public class NameTestController {


    @Autowired
    private ConfigBean configBean;
//    @Value("${my.name}")
//    private String name;
//
//    @Value("${my.age}")
//    private int age;
//
    @RequestMapping("/name")
    public String name(){
        return configBean.getGreeting()+" >>>>"
                +configBean.getName()+" >>>>"+ configBean.getUuid()
                +" >>>>"+configBean.getMax();
    }

    @Autowired
    private User user;
    @RequestMapping("/user")
    public String user(){
        return user.getName() + user.getAge();
    }

}
