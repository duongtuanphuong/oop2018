package week4.task1;

public class camCaoPhong extends HoaQua {
    /*
    *
    * Class camCaoPhong kế thừa từ class hoa quả
    *
     */
    private int id,group;
    camCaoPhong(int id,int group){
        id=id;
        group=group;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setGroup(int group){
        this.group=group;
    }
    public int getGroup(){
        return group;
    }
    /*
    *
    * Id là mã số của cam
    * Group là nhóm hàng
     */
    public void sameGroup(String group1,String group2){
        if (group1.equals(group1)) System.out.println("Đây là cùng 1 nhóm hàng");
        else System.out.println("Đây ko phải cùng một nhóm hàng");
    }
}
