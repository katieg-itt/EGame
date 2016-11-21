import java.util.Scanner;

/**
 * Created by Katie on 21/11/2016.
 */
public class Register {

    private String fName, lName, address, userName, password, email;
    int userId, phoneNo;

    public Register(String fName, String lName, String address, String userName, String password, String email, int userId, int phoneNo) {
        this.fName = "";
        this.lName = "";
        this.address = "";
        this.userName = "";
        this.password = "";
        this.userId = 0;
        this.phoneNo = 0;
        this.email = "";
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getaddress() {
        return address;
    }

    public String getuserName() {
        return userName;
    }

    public String getpassword() {
        return password;
    }

    public int getuserId() {
        return userId;
    }

    public int getphoneNo() {
        return phoneNo;
    }

    public String getemail() {
        return email;
    }

    public void setfName(String fName){ this.fName = fName;}

    public void setlName(String lName) { this.lName = lName;}

    public void setaddress(String address) {this.address = address;}

    public void setuserName(String userName) {this.userName = userName;}

    public void setpassword(String password){this.password =  password;}

    public void setuserId(int userId){this.userId = userId;}

    public void setphoneNo(int phoneNo){this.phoneNo = phoneNo;}

    public void setemail(String email) {this.email = email;}





    public String toString(){
        return ( userName + "You have sucessfully registered");
    }
}


