package learnspringboot.learn.controller.account;

import learnspringboot.learn.entity.Account;
import learnspringboot.learn.support.SharedRepositoryFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {



//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    public Account getAccountById(@PathVariable("id") int id){
//        Account account = SharedRepositoryFactory.getAccountRepository().get(id);
//        return account;
//    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Account get(int id){
        Account account = SharedRepositoryFactory.getAccountRepository().get(id);
        return account;
    }

    @PostMapping("/transfer")
    public String transfer(){
        SharedRepositoryFactory.getAccountRepository().transfer();
        return "成功";
    }




}
