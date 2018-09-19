package week1;

public class Student {
    private String name,id,group,email;
    public void setName(){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(){
        this.id=n;
    }
    public String getId(){
        return id;
    }
    public void setGroup(){
        this.group=n;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(){
        this.email=n;
    }
    public String getEmail(){
        return email;
    }


    Student( ) {
        name="Student";
        id="000"
        email="uet@vnu.edu.vn"
        group="INT22042"
        // TODO:
    }


    Student(String n, String sid, String em) {
        name=n;
        id=sid;
        email=em;
        group="INT22042";
        // TODO:
    }

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
        return null;
    }
}
