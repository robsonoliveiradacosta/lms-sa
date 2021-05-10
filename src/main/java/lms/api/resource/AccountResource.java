package lms.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lms.api.contract.request.AccountRequest;
import lms.api.contract.response.AccountResponse;
import lms.service.AccountService;

@RestController
@RequestMapping("/v1/accounts")
public class AccountResource {

	@Autowired
	AccountService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AccountResponse create(@RequestBody @Valid AccountRequest request) {
		return service.create(request);
	}

	@GetMapping
	public List<AccountResponse> findAll() {
		return service.findAll();
	}

	@GetMapping(path = "/{id}")
	public AccountResponse findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
