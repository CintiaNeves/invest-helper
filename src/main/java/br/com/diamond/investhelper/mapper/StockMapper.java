package br.com.diamond.investhelper.mapper;

import br.com.diamond.investhelper.domain.entity.Stock;
import br.com.diamond.investhelper.dto.request.StockRequest;
import br.com.diamond.investhelper.dto.response.StockResponse;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StockMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "name", ignore = true)
  @Mapping(target = "stockType", ignore = true)
  @Mapping(target = "department", ignore = true)
  @Mapping(target = "price", ignore = true)
  @Mapping(target = "datCreate", ignore = true)
  @Mapping(target = "datUpdate", ignore = true)
  Stock stockFromRequest(StockRequest stockRequest);

  StockResponse stockToStockResponse(Stock stock);

}
