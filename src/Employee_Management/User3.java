package Employee_Management;


class User3 {
    private String id,first,amount,date,mode;
    
    public User3(String id,String first,String amount,String mode,String date)
    {
       this.id=id;
      this.first=first;
        this.amount=amount;
         this.mode=mode;
          this.date=date;
        
    }
   public String getid(){
        return id;
    }
    public String getfirst(){
        return first;
    } 
   public String getamount(){
        return amount;
    }
    public String getmode(){
        return mode;
    }
    public String getdate(){
        return date;
    }
    
}
