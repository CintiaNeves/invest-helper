package br.com.diamond.investhelper.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class StockRequest {

  @NotEmpty
  private String code;

  @NotEmpty
  private String name;

  @NotEmpty
  private String stockType;

  @NotEmpty
  private String department;

}
