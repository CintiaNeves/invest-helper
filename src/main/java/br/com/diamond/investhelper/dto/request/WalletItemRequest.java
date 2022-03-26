package br.com.diamond.investhelper.dto.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class WalletItemRequest {

  @NotEmpty
  private StockRequest stock;

  @Min(1)
  @Max(10)
  private Integer note;

  @Min(1)
  private Long quantity;
}
