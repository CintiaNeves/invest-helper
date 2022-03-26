package br.com.diamond.investhelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.diamond.investhelper.domain.entity.Wallet;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
