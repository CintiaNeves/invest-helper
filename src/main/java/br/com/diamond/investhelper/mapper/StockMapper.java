package br.com.diamond.investhelper.mapper;

import br.com.diamond.investhelper.domain.entity.Stock;
import br.com.diamond.investhelper.dto.request.StockRequest;
import br.com.diamond.investhelper.dto.response.StockResponse;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockMapper {

  Stock stockFromRequest(StockRequest stockRequest);

  StockResponse stockToStockResponse(Stock stock);

}
