package br.com.diamond.investhelper.service;

import java.math.BigDecimal;

public interface AlphaVantageApiService {

  BigDecimal retrieveStockPrice(String code);
}
