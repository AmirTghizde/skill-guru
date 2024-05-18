package com.taghizadeh.skillguru;

import com.taghizadeh.skillguru.model.Admin;
import com.taghizadeh.skillguru.model.Users;
import com.taghizadeh.skillguru.model.Wallet;
import com.taghizadeh.skillguru.repository.AdminRepository;
import com.taghizadeh.skillguru.service.WalletService;
import com.taghizadeh.skillguru.service.impl.WalletServiceImpl;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SkillGuruApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillGuruApplication.class, args);
    }
}
