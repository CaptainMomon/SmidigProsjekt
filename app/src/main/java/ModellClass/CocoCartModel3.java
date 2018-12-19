package ModellClass;

public class CocoCartModel3 {

    String paymentType;
    Integer logoImage;

    public CocoCartModel3(String paymentType, Integer logoImage) {
        this.paymentType = paymentType;
        this.logoImage = logoImage;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(Integer logoImage) {
        this.logoImage = logoImage;
    }
}
