package utilities;

public class CurrencyConverter{

    public static double tax = 0.06;

 public static double amountInReais(double dollarPrice,double dollarsBought){
    return dollarPrice*dollarsBought+((dollarPrice*dollarsBought)*tax);
}
}