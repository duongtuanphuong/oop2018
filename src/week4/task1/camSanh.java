package week4.task1;

public class camSanh extends Cam {
    /*
    *
    * class CamSanh kế thừa từ class cam
    *
     */

    private int soLuong,canNang;
    public void setCanNang(){
        this.canNang=canNang;
    }
    public int getCanNang(){
        return canNang;
    }
    public void setSoLuong(){
        this.soLuong=soLuong;
    }
    public int getSoLuong(){

        return soLuong;
    }
    public void khuyenMai(){
        System.out.println("Cam sành đang có đợt khuyến mãi khủng ");
    }
}
