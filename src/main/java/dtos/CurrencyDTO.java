package dtos;

public class CurrencyDTO {
    String id;
    String value;
    String url;


    public CurrencyDTO(String id, String value, String url) {
        this.id = id;
        this.value = value;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
