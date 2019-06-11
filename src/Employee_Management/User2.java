
package Employee_Management;


class User2 {
    private String id,first,last,date,type,cat;
    
    public User2(String id,String first,String last,String type,String cat,String date)
    {
       this.id=id;
      this.first=first;
        this.last=last;
         this.type=type;
          this.date=date;
          this.cat=cat;
        
    }
   public String getid(){
        return id;
    }
    public String getfirst(){
        return first;
    }
    public String getlast(){
        return last;
    }
    public String gettype(){
        return type;
    }
    public String getdate(){
        return date;
    }
    public String getcat(){
        return cat;
    }
    
}

