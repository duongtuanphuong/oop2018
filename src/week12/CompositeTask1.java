package week12;

public class CompositeTask1 extends Check {
    String Name,Sex,DateOfBirth;
    int Children;
    boolean Married;
    CompositeTask1(){};
    CompositeTask1(String name,String sex,String dateOfBirth,boolean married,int children){
        this.Name =name;
        this.Sex = sex;
        this.DateOfBirth =dateOfBirth;
        this.Married =married;
        this.Children=children;
    }
    public int getChildren() {
        return Children;
    }

    @Override
    public int children() {
        return Children;
    }

    @Override
    public boolean isMarried() {
        return Married;
    }
    public boolean isMarriedWith(Check task1, Check task2) {
        return false;
    }
    public String getName() {
        return Name;
    }


    public boolean isMarriedWith(CompositeTask1 task1, CompositeTask1 task2) {
        return false;
    }

}
