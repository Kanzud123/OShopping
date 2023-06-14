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
class Users {
    private int P_Id,P_Price,P_Rating,CountryCode;
    private String P_Model,P_Catagories,P_Details,P_StoreName;
    private byte[] picture;
    public Users(int P_Id ,int P_Price ,int P_Rating ,int CountryCode,String P_Model,String P_Catagories,String P_Details,String P_StoreName,byte[] image)
    {
        this.P_Id = P_Id;
        this.P_Price = P_Price;
        this.P_Rating = P_Rating;
        this.CountryCode=CountryCode;
        this.P_Model = P_Model;
        this.P_Catagories = P_Catagories;
         this.P_Details = P_Details;
        this.P_StoreName = P_StoreName;
        this.picture = image;
    }
   public int getP_Id(){
           return P_Id;
   }
   public int getP_Price(){
       return P_Price;
   }
   public int getP_Rating(){
       return P_Rating;
   } 
   public int getCountryCode(){
       return CountryCode;
   }
    public String getP_Model(){
       return P_Model;
   }
  public String getP_Catagories(){
       return P_Catagories;
   }  
   public String getP_Details(){
       return P_Details;
   }
      public String getP_StoreName(){
       return P_StoreName;
   } 
   public byte[] getImage(){
       return picture;
   }
}
