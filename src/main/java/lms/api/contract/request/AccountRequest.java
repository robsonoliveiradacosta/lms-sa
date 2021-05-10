package lms.api.contract.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequest {

	@NotBlank
	private String name;

	@NotEmpty
	@Email
	private String email;

	@NotBlank
	private String password;

}
