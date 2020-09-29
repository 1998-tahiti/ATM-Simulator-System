
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class unitTest {
    public double balance;
    
    
    public ArrayList<String> signup(String name, String birthday, String mail, String address){
    ArrayList <String> r=new ArrayList<>();
    r.add(name);
    r.add(birthday);
    r.add(mail);
    r.add(address);
    return r;
}
    
    public boolean login(String u, String p ){
        String username=u;
        String pin=p;
        if(username.equals("root")&&pin.equals("0000"))
            return true;
        else
            return false;
    }
    
    public String PinChange(String a, String b){
        String oldPin=a;
        if(oldPin.equals("0000")){
          String newPin=b;
          return "Pin successfully updated.";
        }
        else
            return "Wrong pin, try again.";
        
    }
    
    
    public String deposit(double d){
        balance=balance+d;
            return d+" taka deposited successfully"; 
        
    }
    
    public String Transactions(String s, double d){
        if(s.equals("Fastcash")){
            balance=balance-d;
            return d+" taka debited successfully";
        }
        else if(s.equals("Withdraw")){
            balance=balance-d;
            return d+" taka debited successfully";
        }
        else if(s.equals("Ministatement")){
            balance=balance+d;
            return balance+" taka balance currently.";
        }
        else
            return "";
    }
    
    
    public String CreatePin(String username){
      Random ran = new Random();
        long l = (ran.nextLong() % 90000000L) + 5040936000000000L; 
        return "Pin successfully created";
    }
    
        public static void main(String[] args){
        }
   
   
}
