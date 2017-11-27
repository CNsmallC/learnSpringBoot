package learnspringboot.learn.dao;

import learnspringboot.learn.entity.Account;

import java.util.List;

public interface IAccountDao {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountByID(int id);

    List<Account> findAccountList();

}
