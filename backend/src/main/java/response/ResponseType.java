package response;

public enum ResponseType {
	SUCCESS(200);
	
	private final int value;

    private ResponseType(int value) {
        this.value = value;
    }
    
    public int getValue() {
    	return this.value;
    }
}
