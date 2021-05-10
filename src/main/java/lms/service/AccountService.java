package lms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms.api.contract.request.AccountRequest;
import lms.api.contract.response.AccountResponse;
import lms.domain.model.Account;
import lms.domain.repository.AccountRepository;
import lms.exception.ResourceNotFoundException;
import lms.mapper.AccountMapper;

@Service
public class AccountService {

	@Autowired
	AccountRepository repository;

	public List<AccountResponse> findAll() {
		return AccountMapper.INSTANCE.map(repository.findAll());
	}

	public AccountResponse findById(Long id) {
		Account account = repository.findById(id).orElseThrow(ResourceNotFoundException::new);
		return AccountMapper.INSTANCE.accountToAccountResponse(account);
	}

	@Transactional
	public AccountResponse create(AccountRequest request) {
		Account account = AccountMapper.INSTANCE.accountRequestToAccount(request);
		return AccountMapper.INSTANCE.accountToAccountResponse(repository.save(account));
	}

}
