package week4.task1;
/**
 * Đây là class HoaQua gồm các thuộc tính và phương thức về Hoa Quả
 *
 * @author TuanPhuong
 * @version 0.0
 * @since 9/10/2018 10:00
 */
public class HoaQua {
    public String ngayNhap;
    public int soLuong;
    /*
    *Phương thức về loại quả và mùi vị
    *
    *
     */

    public void setNgayNhap(String a){
        this.ngayNhap=a;
    }
    public String getNgayNhap(){
        return ngayNhap;
    }
    public void setSoLuong(int b){
        this.soLuong=b;
    }
    public int getSoLuong(){
        return soLuong;
    }
    public void gioiThieu(){
        System.out.println("Mua hoa quả vào "+ngayNhap+"với số lượng"+soLuong);


    }

}
