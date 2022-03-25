package br.com.diamond.investhelper.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.diamond.investhelper.dto.request.StockRequest;
import br.com.diamond.investhelper.dto.response.StockResponse;
import br.com.diamond.investhelper.mapper.StockMapper;
import br.com.diamond.investhelper.service.StockService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {

  private final StockMapper stockMapper;

  private final StockService stockService;

  @PostMapping
  public ResponseEntity<StockResponse> create(@Valid @RequestBody final StockRequest stockRequest) {

    final var stock = stockService.create(stockMapper.stockFromRequest(stockRequest));

    final var uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
        .path("/{stock_id}")
        .buildAndExpand(stock.getId()).toUri();

    return ResponseEntity.created(uri).body(stockMapper.stockToStockResponse(stock));
  }
}
