package br.com.diamond.investhelper.client.alhpavantage.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlphaVantageResponseContent {

  @JsonProperty("01. symbol")
  private String code;

  @JsonProperty("02. open")
  private BigDecimal openPrice;

  @JsonProperty("03. high")
  private BigDecimal highPrice;

  @JsonProperty("04. low")
  private BigDecimal lowPrice;

  @JsonProperty("05. price")
  private BigDecimal price;

  @JsonProperty("06. volume")
  private Long volume;

  @JsonProperty("07. latest trading day")
  private LocalDate latestTradingDay;

  @JsonProperty("08. previous close")
  private BigDecimal previousClose;

  @JsonProperty("09. change")
  private BigDecimal changeAmount;

  @JsonProperty("10. change percent")
  private BigDecimal changePercent;

  public void setChangePercent(String changePercent) {
    this.changePercent = new BigDecimal(
        changePercent.replace("%", ""));
  }
}
