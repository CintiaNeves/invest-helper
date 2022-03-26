package br.com.diamond.investhelper.dto.request;

import java.util.Set;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class WalletRequest {

  @NotEmpty
  private String name;

  private Set<WalletItemRequest> itemRequestSet;

}
