package week4.task1;
/*
*
*Class Cam kế thừa từ class HoaQua
*
 */
public class Cam extends HoaQua  {
    private String xuatXu;
    public String taste;
    public int giaBan;
    /*
    *
    * Setter/getter cho nguồn gốc của cam
    *
     */
    public void setXuatXu(String xuatXu){
        this.xuatXu=xuatXu;
    }
    public String getXuatXu(){
        return xuatXu;
    }
    public void setTaste(String taste){
        this.taste=taste;
    }
    public String getTaste(){
        return taste;
    }
    public void setGiaBan(){
        this.giaBan=giaBan;
    }
    public int getGiaBan(){
        return giaBan;
    }

    public void nguonGoc(){
        System.out.println("Cam mua từ "+xuatXu+" có vị "+taste +" với giá tiền "+giaBan);
    }
}
