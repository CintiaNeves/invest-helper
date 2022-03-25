package br.com.diamond.investhelper.dto.response;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class StockResponse {

  private String code;

  private BigDecimal price;
}
