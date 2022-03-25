package br.com.diamond.investhelper.client.alhpavantage.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlphaVantageResponse {

  @JsonProperty("Global Quote")
  private AlphaVantageResponseContent alphaVantageResponseContent;
}
