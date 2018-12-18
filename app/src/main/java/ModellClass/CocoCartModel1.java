package ModellClass;

public class CocoCartModel1 {
    String phoneName,rupees;
    Integer phoneImage;

    public CocoCartModel1(String phoneName, String rupees, Integer phoneImage) {
        this.phoneName = phoneName;
        this.rupees = rupees;
        this.phoneImage = phoneImage;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getRupees() {
        return rupees;
    }

    public void setRupees(String rupees) {
        this.rupees = rupees;
    }

    public Integer getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(Integer phoneImage) {
        this.phoneImage = phoneImage;
    }
}
