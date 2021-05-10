package lms.exception;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ApiError {

	private Integer status;
	private String message;
	private OffsetDateTime timestamp;
	private List<Field> fields;

	public ApiError(Integer status, String message, OffsetDateTime timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	@Getter
	@AllArgsConstructor
	public static class Field {
		private String name;
		private String message;
	}

}
