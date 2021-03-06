package learnspringboot.learn.repository;

import learnspringboot.learn.common.db.Repository;
import learnspringboot.learn.entity.account.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountRepository extends Repository<Account,IAccountRepository> {

    @Transactional
    public void transfer(){
        repository.transfer(90,1);
//        int i=1/0;
        repository.transfer(110,2);
    }

}
