package week1;

public class Student {
    private String name,id,group,email;
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(String n){
        this.id= n;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String n){
        this.group= n;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String n){
        this.email= n;
    }
    public String getEmail(){
        return email;
    }

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student( ) {
        name="Student";
        id="000";
        email="uet@vnu.edu.vn";
        group="INT22042";
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        name=n;
        id=sid;
        email=em;
        group="INT22042";
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name=s.getName();
        id=s.getId();
        group=s.getGroup();
        email=s.getEmail();
        // TODO:
    }

    String getInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
