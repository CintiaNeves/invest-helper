package br.com.diamond.investhelper.client.config;

import feign.Request;
import feign.RetryableException;
import feign.Retryer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FeignConfig extends Retryer.Default {

  public FeignConfig(
      @Value("${feign.client.config.default.retry.period}") long period,
      @Value("${feign.client.config.default.retry.maxPeriod}") long maxPeriod,
      @Value("${feign.client.config.default.retry.maxAttempts}") int maxAttempt) {
    super(period, maxPeriod, maxAttempt);
  }

  @Override
  public void continueOrPropagate(final RetryableException e) {
    if (e.method()
        .equals(Request.HttpMethod.PUT)) {
      super.continueOrPropagate(e);
    } else {
      throw e;
    }
  }

}
