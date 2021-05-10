package lms.api.contract.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {

	@NotBlank
	private String name;

	@Email
	private String email;

	@NotBlank
	private String password;

}
