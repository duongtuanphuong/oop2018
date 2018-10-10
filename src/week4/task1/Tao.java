package week4.task1;

public class Tao extends HoaQua {
    private String thiTruong;
    private int canNang;
    /*
    *
    * Setter/getter về thị trường cho táo
    *
     */
    public void setThiTruong(String thiTruong){
        this.thiTruong=thiTruong;
    }
    public String getThiTruong(){
        return thiTruong;
    }
    public void setCanNang(){
        this.canNang=canNang;
    }
    public int getCanNang(){
        return canNang;
    }
    public void Tr(){
        System.out.println("Thi truong " +thiTruong + "tiêu thụ được " +canNang +" kg táo");
    }
}
