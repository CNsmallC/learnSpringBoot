package learnspringboot.learn.repository;

import learnspringboot.learn.common.db.IRepository;
import learnspringboot.learn.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IAccountRepository extends IRepository<Account>{

    int transfer(@Param("money") double money, @Param("id") int id);
}
