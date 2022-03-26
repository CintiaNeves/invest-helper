package br.com.diamond.investhelper.mapper;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.diamond.investhelper.domain.entity.Wallet;
import br.com.diamond.investhelper.domain.entity.WalletItem;
import br.com.diamond.investhelper.dto.request.WalletItemRequest;
import br.com.diamond.investhelper.dto.request.WalletRequest;
import br.com.diamond.investhelper.dto.response.WalletResponse;

@Mapper(componentModel = "spring")
public interface WalletMapper {

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "datCreate", ignore = true)
  @Mapping(target = "datUpdate", ignore = true)
  @Mapping(target = "walletItemSet", source = "itemRequestSet")
  Wallet walletFromRequest(WalletRequest walletRequest);

  Set<WalletItem> walletItemFromRequest(Set<WalletItemRequest> itemRequestSet);

  WalletResponse walletToWalletResponse(Wallet wallet);
}
