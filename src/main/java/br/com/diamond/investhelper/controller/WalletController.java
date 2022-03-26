package br.com.diamond.investhelper.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.diamond.investhelper.dto.request.WalletRequest;
import br.com.diamond.investhelper.dto.response.WalletResponse;
import br.com.diamond.investhelper.mapper.WalletMapper;
import br.com.diamond.investhelper.service.WalletService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wallets")
public class WalletController {

  private final WalletMapper walletMapper;

  private final WalletService walletService;

  @PutMapping
  public ResponseEntity<WalletResponse> create(@RequestBody final WalletRequest walletRequest) {
    final var wallet = walletService.create(walletMapper.walletFromRequest(walletRequest));

    final var uri = ServletUriComponentsBuilder
        .fromCurrentRequestUri()
        .path("/{stock_id}")
        .buildAndExpand(wallet.getId()).toUri();

    return ResponseEntity.created(uri).body(walletMapper.walletToWalletResponse(wallet));
  }
}
