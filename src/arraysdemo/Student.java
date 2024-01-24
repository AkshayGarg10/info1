package arraysdemo;



/**
 *Hello this has been edited on remote
 
 * Commenting for modification on jan 17 2024 at 9:48 AM
 * @author gaksh
 */
public class Student {
    private int sId;
    private String sname;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }
    
    

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
}
