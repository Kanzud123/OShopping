/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshopping;

/**
 *
 * @author User
 */
class User {
    private int CustomerId,NID;
    private String FirstName,LastName,Email,Addresses,Phone,DateOfBirthDay,DateOfBirthMonth,DateOfBirthYear,UserType;
    public User(int CustomerId,int NID,String FirstName,String LastName,String Email,String Addresses,String Phone,String DateOfBirthDay,String DateOfBirthMonth,String DateOfBirthYear,String UserType)
    {
        this.CustomerId = CustomerId;
        this.FirstName = FirstName;
        this.LastName = LastName ;
        this.Email = Email;
        this.Addresses = Addresses;
        this.Phone=Phone;
        this.DateOfBirthDay = DateOfBirthDay;
        this.DateOfBirthMonth = DateOfBirthMonth;
        this.DateOfBirthYear = DateOfBirthYear;
        this.NID = NID;
        this.UserType = UserType;
    }
   public int getCustomerId(){
           return CustomerId;
   }
   public String getFirstName(){
       return FirstName;
   }
    public String getLastName(){
       return LastName;
   }
    public String getEmail(){
       return Email;
   }
   public String getAddresses(){
       return Addresses;
   } 
   public String getPhone(){
       return Phone;
   }
   public String getDateOfBirthDay(){
       return DateOfBirthDay;
   }
  public String getDateOfBirthMonth(){
       return DateOfBirthMonth;
   }  
   public String getDateOfBirthYear(){
       return DateOfBirthYear;
   } 
   public int getNID(){
           return NID;
   } 
   public String getUserType(){
       return UserType;
   }   
}

