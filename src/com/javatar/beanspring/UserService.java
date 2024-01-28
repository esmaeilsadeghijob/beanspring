package com.javatar.beanspring;

import com.javatar.beanspring.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
}
