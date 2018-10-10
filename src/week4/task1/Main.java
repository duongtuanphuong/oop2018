package week4.task1;

public class Main {
    public static void main(String [] args){
        Cam cam= new Cam();
        cam.setXuatXu("Trung Quốc");
        cam.setTaste("rất chua ");
        System.out.println("Cam mua từ "+cam.getXuatXu()+" có mùi vị "+cam.getTaste());
        Tao tao =new Tao();
        tao.setSoLuong(100);
        tao.setThiTruong("Chợ Đông Xuân");
        System.out.println("Khu vực "+tao.getThiTruong() + " tiêu thụ được  "+tao.getSoLuong() +" quả ");
        camCaoPhong cam1=new camCaoPhong(5,2);
        camCaoPhong cam2=new camCaoPhong(5,2);
        System.out.println(" Cam Cao Phong có id "+cam1.getId());
        System.out.println("KO BIẾT VIẾT CÁI J VÀO ĐÂY NỮA LUÔN ");
    }
}
