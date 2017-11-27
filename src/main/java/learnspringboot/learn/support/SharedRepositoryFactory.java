package learnspringboot.learn.support;

import learnspringboot.learn.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SharedRepositoryFactory {

    /**
     * 账号仓储
     */
    public static AccountRepository accountRepository;

    public static AccountRepository getAccountRepository() {
        return accountRepository;
    }

    @Autowired
    public void setAccountRepository(AccountRepository accountRepository) {
        SharedRepositoryFactory.accountRepository = accountRepository;
    }
}
