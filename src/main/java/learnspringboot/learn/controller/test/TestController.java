package learnspringboot.learn.controller.test;

import learnspringboot.learn.common.MKLogBack;
import learnspringboot.learn.entity.account.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "Hello World!";
    }


    public static void main(String[] args) {
//        String s = "[aaaaa[\"[[[]]\"][\"]bbbbb]";
//
//        MKLogBack.getInstance().debug(s);
//        MKLogBack.getInstance().debug(s.replaceAll("[\\[\\]]","").replaceAll("[\"]",""));
//
//
        List<Account> list = new ArrayList<>();

        list.add(new Account(2,"name2",2));
        list.add(new Account(1,"name1",1));
        list.add(new Account(3,"name3",3));

        MKLogBack.getInstance().debug(list);

//        Collections.sort(list, new Comparator<Account>() {
//            @Override
//            public int compare(Account o1, Account o2) {
//                return o2.getId()-o1.getId();
//
//            }
//        });

//        list.sort((Account a1,Account a2) -> a1.getId() - a2.getId());

        list.sort(Comparator.comparing(Account::getId));
        MKLogBack.getInstance().debug(list);

        Collections.reverse(list);
        MKLogBack.getInstance().debug(list);

    }



}
