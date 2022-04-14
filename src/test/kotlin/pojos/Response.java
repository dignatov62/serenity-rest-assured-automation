package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Response{
	@JsonProperty("entitle")
	private String entitle;
	@JsonProperty("expiredAt")
	private String expiredAt;
	@JsonProperty("isCertFound")
	private boolean isCertFound;
	@JsonProperty("serviceUnavailable")
	private boolean serviceUnavailable;
	@JsonProperty("certId")
	private String certId;
	@JsonProperty("validFrom")
	private String validFrom;
	@JsonProperty("title")
	private String title;
	@JsonProperty("isExpired")
	private boolean isExpired;
	@JsonProperty("isBeforeValidFrom")
	private boolean isBeforeValidFrom;
	@JsonProperty("attrs")
	private List<AttrsItem> attrs;

}