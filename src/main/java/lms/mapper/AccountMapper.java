package lms.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import lms.api.contract.request.AccountRequest;
import lms.api.contract.response.AccountResponse;
import lms.domain.model.Account;

@Mapper(config = IgnoreUnmappedMapperConfig.class)
public interface AccountMapper {

	AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

	Account accountRequestToAccount(AccountRequest accountRequest);

	AccountResponse accountToAccountResponse(Account account);

	List<AccountResponse> map(List<Account> accounts);

}
