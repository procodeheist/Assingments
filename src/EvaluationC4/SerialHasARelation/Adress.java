package EvaluationC4.SerialHasARelation;

import java.io.Serializable;

public class Adress implements Serializable {
    private String state;
    private String city;
    private String pinCode;

    public Adress(String state, String city, String pinCode) {
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    public Adress() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
