package br.com.diamond.investhelper.service.impl;

import org.springframework.stereotype.Service;

import br.com.diamond.investhelper.domain.entity.Wallet;
import br.com.diamond.investhelper.repository.WalletRepository;
import br.com.diamond.investhelper.service.WalletService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

  private final WalletRepository walletRepository;

  @Override
  public Wallet create(Wallet wallet) {
    return walletRepository.save(wallet);
  }
}
