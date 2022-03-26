package br.com.diamond.investhelper.dto.response;

import lombok.Data;

@Data
public class WalletResponse {

  private String name;

  private WalletItemResponse walletItemResponse;

  private StockResponse stockResponse;

}
