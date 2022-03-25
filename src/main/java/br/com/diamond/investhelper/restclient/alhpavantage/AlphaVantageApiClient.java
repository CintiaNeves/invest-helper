package br.com.diamond.investhelper.restclient.alhpavantage;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.diamond.investhelper.restclient.alhpavantage.response.AlphaVantageResponse;
import br.com.diamond.investhelper.restclient.config.FeignConfig;

@FeignClient(name = "alpha-vantage-api",
    url = "${client.alpha-vantage-api.url}",
    configuration = FeignConfig.class)
public interface AlphaVantageApiClient {

  @GetMapping(value = "/query")
  AlphaVantageResponse retrieveStock(@RequestParam("function") String function,
                                     @RequestParam("symbol") String symbol,
                                     @RequestParam("apikey") String apikey);
}
