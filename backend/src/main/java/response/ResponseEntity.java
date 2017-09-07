package response;

public class ResponseEntity {
	private int responseType;
	private String messenge;
	private Object data;
	
	public ResponseEntity(ResponseType responseType, String messenge,  Object data) {
		this.setResponseType(responseType);
		this.setMessenge(messenge);
		this.setData(data);
	}

	public int getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType.getValue();
	}

	public String getMessenge() {
		return messenge;
	}

	public void setMessenge(String messenge) {
		this.messenge = messenge;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
