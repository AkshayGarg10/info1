package arraysdemo;



/**
*commiting
 *Hello this has been edited on remote
 *this fetch and merge
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

    public Student(int sId, String sname, String address) {
        this.sId = sId;
        this.sname = sname;
        this.address = address;
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
