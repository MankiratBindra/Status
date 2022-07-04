package status;
public enum StatusEnum {
    REJECTED("REJECTED"),
    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    APPROVED("APPROVED");
    public final String status;

    private StatusEnum(String status){
        this.status=status;
    }
}
