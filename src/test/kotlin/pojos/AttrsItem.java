package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AttrsItem{
	@JsonProperty("entitle")
	private String entitle;
	@JsonProperty("type")
	private String type;
	@JsonProperty("title")
	private String title;
	@JsonProperty("value")
	private String value;
	@JsonProperty("envalue")
	private String envalue;
	@JsonProperty("order")
	private int order;

}
