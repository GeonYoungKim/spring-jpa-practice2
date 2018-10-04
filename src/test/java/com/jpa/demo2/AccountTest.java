package com.jpa.demo2;

import com.jpa.demo2.account.Account;
import com.jpa.demo2.account.AccountRepository;
import com.jpa.demo2.account.QAccount;
import com.querydsl.core.types.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class AccountTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void crud() {
        QAccount account = QAccount.account;
        Predicate predicate = account
                .firstname.containsIgnoreCase("keesun")
                .and(account.lastname.startsWith("baik"));
        Optional<Account> one = accountRepository.findOne(predicate);
        assertThat(one).isEmpty();
    }
}
