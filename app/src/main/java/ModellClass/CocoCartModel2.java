package ModellClass;

public class CocoCartModel2 {

    String deliverType,noOfDays,amount;


    public CocoCartModel2(String deliverType, String noOfDays, String amount) {
        this.deliverType = deliverType;
        this.noOfDays = noOfDays;
        this.amount = amount;

    }

    public String getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(String deliverType) {
        this.deliverType = deliverType;
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


}
