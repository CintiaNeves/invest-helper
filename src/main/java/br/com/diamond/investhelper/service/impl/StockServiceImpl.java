package br.com.diamond.investhelper.service.impl;

import br.com.diamond.investhelper.domain.entity.Stock;
import br.com.diamond.investhelper.repository.StockRepository;
import br.com.diamond.investhelper.service.StockService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

  private final StockRepository stockRepository;

  @Override
  public Stock create(Stock stock) {
    return stockRepository.save(stock);
  }
}
