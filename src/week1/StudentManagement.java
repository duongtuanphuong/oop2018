package week1;

public class StudentManagement {
    Student[] St1 = new Student[100];
    int a=0;
    void add(Student sv)
        {
            St1[a++]=sv;
        }
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
        // TODO:
         // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        for (int i=0;i<St1.length-1;i++){
            for (int j=0;j<St1.length;j++){
                if(St1[i].getGroup().compareTo(St1[j].getGroup())<0){
                    Student A = new Student();
                    A=St1[i];
                    St1[i]=St1[j];
                    St1[j]=A;
                }
            }
        }
        String group=" ";
        int i=0,n=St1.length;
        while (i<n){
            if (St1[i].getGroup().equals(group)== false){
                group =St1[i].getGroup();
                System.out.println("cac sinh vien thuoc lop " +group +": ");
                System.out.println(St1[i]);
            }
            else {
                System.out.println(St1[i]);
            }
            i++;
        }

        // TODO:
    }

    void removeStudent(String id) {
          for (int i=0;i<a;i++){
              if (St1[i].getId().equals(id)){
                  for (int j=i;j<a-1;j++){
                      St1[j]=St1[j+1];

                  }
                a--;
              }

        }

        // TODO:
    }

    public static void main(String[] args) {
        Student a = new Student();
        a.setName("Duong Tuan Phuong");
        a.setId("17020965");
        a.setGroup("INT2204");
        a.setEmail("binonljne04@gmail.com");
        System.out.println("ten sv :" +a.getName());
        System.out.println("thong tin sinh vien :");
        a.getInfo();

        Student b= new Student();
        Student c= new Student("Duong Tuan Phuong","17020965","abcxyz@vnu.edu.vn");
        Student d=new Student (c);

        Student s01 = new Student ("Ten1","17020965","abcxyz@vnu.edu.vn");
        Student s02 = new Student ("Ten2","17020966","abcxzy@vnu.edu.vn");
        Student s03 =new Student();
        s03.setGroup("INT22041");
        StudentManagement ss =new StudentManagement();
        System.out.println("Student s01 va s02  " +ss.sameGroup(s01,s02));
        System.out.println("Student s01 va s03  " +ss.sameGroup(s01,s03));
        System.out.println("Student s02 va s03  " +ss.sameGroup(s02,s03));








        // TODO:
    }
}
