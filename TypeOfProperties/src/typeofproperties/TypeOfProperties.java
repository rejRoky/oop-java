package typeofproperties;

public class TypeOfProperties {

    public static void main(String[] args) {

    }

}

//// Type od Properties 
// 1. Read & Writeable  set and get method 
// 2. Read Only : only get method 
// 3. Write only : only set method 
class Student {

    private String roll;

    public String getRoll() //Read Only : only get method 
    {
        return roll;
    }

}

class Anccount {

    private String accountNo;

    public String getAccountNo() {//Read Only : only get method  
        return accountNo;

    }
    

}

class Producer {
    private int shareData;
    
    public void setData (int d)
    {
        shareData = d;
        
    }
    
}
