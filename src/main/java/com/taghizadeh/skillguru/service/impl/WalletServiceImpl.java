package com.taghizadeh.skillguru.service.impl;

import com.taghizadeh.skillguru.model.Wallet;
import com.taghizadeh.skillguru.repository.WalletRepository;
import com.taghizadeh.skillguru.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletServiceImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public void save(Wallet wallet) {
        walletRepository.save(wallet);
    }
}
