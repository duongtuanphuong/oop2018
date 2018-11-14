package week9;


import java.io.*;


public class Utils {
    public static String readContentFromFile(String path){
        String s="";

        try {
            FileReader fr =new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            while ((s=br.readLine())!= null){
                System.out.println(s);

            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
    public static void writeContentToFile(String path,String s){

        try{
            FileWriter f = new FileWriter(path);
            f.write(s);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void addContentToFile(String path,String s){
        try{
            FileWriter f = new FileWriter(path,true);
            f.write("\n");
            f.write(s);
            f.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static File findFileByeName(String folderPath,String fileName){
        try{
            File a = new File(folderPath);
            File[] arr = a.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.startsWith(fileName)&&name.endsWith(".txt");
                }

            });
            return arr[0];
        }catch (Exception e){

        }
        return null;
    }
    public static void main(String[] args){
       //Utils.writeContentToFile("src/test.txt","sdsdsdsdsdsd");
        Utils.addContentToFile("src/test.txt","dddddd");
       System.out.println(Utils.readContentFromFile("src/test.txt"));

        File d = Utils.findFileByeName("src","test11");

        if (d == null)System.out.println("File ko tìm được");
        else  System.out.println("File đã tìm thấy");


    }

}
