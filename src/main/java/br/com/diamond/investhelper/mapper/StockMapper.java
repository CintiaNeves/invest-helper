package br.com.diamond.investhelper.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.diamond.investhelper.domain.entity.Stock;
import br.com.diamond.investhelper.dto.request.StockRequest;
import br.com.diamond.investhelper.dto.response.StockResponse;

@Mapper(componentModel = "spring")
public interface StockMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "price", ignore = true)
  @Mapping(target = "datCreate", ignore = true)
  @Mapping(target = "datUpdate", ignore = true)
  Stock stockFromRequest(StockRequest stockRequest);

  StockResponse stockToStockResponse(Stock stock);

}
