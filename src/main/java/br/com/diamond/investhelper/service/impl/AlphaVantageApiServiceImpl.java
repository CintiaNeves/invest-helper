package br.com.diamond.investhelper.service.impl;

import br.com.diamond.investhelper.restclient.alhpavantage.AlphaVantageApiClient;
import br.com.diamond.investhelper.service.AlphaVantageApiService;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlphaVantageApiServiceImpl implements AlphaVantageApiService {

  private final AlphaVantageApiClient alphaVantageApiClient;

  @Value("${client.alpha-vantage-api.function}")
  private String function;

  @Value("${client.alpha-vantage-api.key}")
  private String key;

  @Value("${client.alpha-vantage-api.suffix}")
  private String suffix;

  @Override
  public BigDecimal retrieveStockPrice(final String code) {

    final var symbol = codeNormalize(code);

    final var response = alphaVantageApiClient.retrieveStock(function, symbol, key);

    return response.getAlphaVantageResponseContent().getPrice();
  }

  private String codeNormalize(final String code) {
    return code.concat(suffix);
  }
}
