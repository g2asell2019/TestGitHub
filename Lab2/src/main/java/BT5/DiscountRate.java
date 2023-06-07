package BT5;

public class DiscountRate {
    private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold = 0.15;

    private double serviceDiscountSilver = 0.1;

    private double productDiscountPremium = 0.1;
    private double productDiscountGold = 0.1;

    private double productDiscountSilver = 0.1;



    public double getServiceDiscountRate(String type){
        if (type.equals("gold")){
            return serviceDiscountGold;
        } else if (type.equals("premium")) {
            return  serviceDiscountPremium;
        }
        else {
            return serviceDiscountSilver;
        }
    }


    public double getProductDiscountRate(String type){
        if (type.equals("gold")){
            return productDiscountGold;
        } else if (type.equals("premium")) {
            return  productDiscountPremium;
        }
        else {
            return productDiscountSilver;
        }
    }


}
