package emailapp;

import java.util.Scanner;
public class Email
{
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailboxcapacity=20;
    private String alternateemail;
    private  int randomLength =10;
    private String companySuffix="Cognizant.com";
    private String email;
    
     //This is constructor to get values
    public Email(String firstname,String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname; 
        
        System.out.println("Name is " + this.firstname+ " "+ this.lastname);
        this.department = setdepartment();
        
        this.password=randomPassword(randomLength);
        System.out.println("Your password is :"+ this.password);
        
        email=firstname.toLowerCase()+ "."+lastname.toLowerCase()+ "@"+ department+"."+companySuffix;
        
    }
    
    private String setdepartment()
    {
        System.out.print("Enter the department \n1 for Sales\n2 for Developement\n3 for Accounts\n0 for None\n Enter the Department code :");
        Scanner sc=new Scanner(System.in);
        int deptchoice=sc.nextInt();
        if(deptchoice==1){return "Sales";}
        else if(deptchoice==2){return "Developement";}
        else if(deptchoice==3){return "Accounts";}
        else{return "";}
        
        
    }
    private String randomPassword(int length)
    {
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
           int rand= (int) (Math.random() * passwordSet.length());
           password[i]=passwordSet.charAt(rand);  
        }
        return new String(password);
    }
    
    public void setmailboxcapacity(int capacity)
    {
        this.mailboxcapacity= capacity;
    }
    public void setalternateemail(String altemail)
    {
        this.alternateemail=altemail;
    }
    public void changePassword(String password)
    {
        this.password=password;
        
    }
  
   public int getmailboxcapacitiy(){return mailboxcapacity;}
    public String getalternateemail(){return alternateemail;}
     public String getpassword(){return password;}
     
     public String showinfo() {
    	 return "Display Name:" + firstname+ lastname+
    			 "\n Company email:"+ email+
    			 "\n MAilbox Capacity:"+ mailboxcapacity+ "mb";
     }
   
   
    
}


