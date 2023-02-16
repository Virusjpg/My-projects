package utilities;

public class BankSystem{
                //(Account)
    private int accNumber;
    private String name;
    private double deposit;
    private final int TAX = 5;

 public BankSystem(int number, String name, double deposit){
     this.accNumber = number;
     this.name = name;
     this.deposit = deposit;
}

 public BankSystem(int number, String name){
     this.accNumber = number;
     this.name = name;
}
 
 public String changeName(String name){
     this.name = name;  
     return toString();
}

 public void deposit (double deposit){
     this.deposit += deposit;
}

 public void withdraw (double deposit){
     this.deposit -= deposit + TAX;
}

 public String toString(){
     return "Account " + accNumber + " Holder: " + name + " Balance: $ " + deposit;
}
}