package entities;

public class Student {
    public String name;
    //(Quarter)
    public double firstT;
    public double secondT;
    public double thirdT;

 public double finalGrade(){
     return firstT+secondT+thirdT;
}

 public String passed(){
    if(finalGrade()>60){
    return "Pass";
    }
    else {  
    return "Failed" + "\n" + "Missing points: " + (finalGrade() - 60);
    }
} 
}
