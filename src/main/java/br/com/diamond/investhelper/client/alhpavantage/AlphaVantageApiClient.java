package br.com.diamond.investhelper.client.alhpavantage;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.diamond.investhelper.client.config.FeignConfig;

@FeignClient(name = "alpha-vantage-api",
    url = "${client.alpha-vantage-api.url}",
    configuration = FeignConfig.class)
public interface AlphaVantageApiClient {

  @GetMapping(value = "/query")
  ResponseEntity<String> get(@RequestParam("function") String function,
                             @RequestParam("symbol") String symbol,
                             @RequestParam("apikey") String apikey);
}
