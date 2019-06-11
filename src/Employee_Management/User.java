
package Employee_Management;


class User {
     private String id;
    private String fname,lname,category, address, gender,birthdate,mobile,email,joining;
    
    public User(String id,String fname,String lname,String gender,String category, String birthdate, String mobile, String email,String joining,String address)
    {
       this.id=id;
        this.fname=fname;
        this.lname=lname;
        this.category=category;
        this.address=address;
        this.gender=gender;
        this.birthdate = birthdate;
        this.mobile=mobile;
        this.email=email;
        this.joining=joining;
       
    }
   public String getid(){
        return id;
    }
    public String getfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String getcategory(){
        return category;
    }
    public String getaddress(){
        return address;
    }
    public String getgender(){
        return gender;
    }
    public String getbirthdate(){
        return birthdate;
    }
    public String getmobile(){
        return mobile;
    }
    public String getemail(){
        return email;
    }
    public String getjoining(){
        return joining;
    }
    
}
