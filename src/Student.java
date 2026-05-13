public class Student extends Person{
    private String name;
    private int id;
    private int age;
    private char geder;
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGeder() {
        return geder;
    }

    public void setGeder(char geder) {
        this.geder = geder;
    }

    public void setName(String name){
        this.name = name;
    }
    public void move(){
        super.move();
        System.out.println("student has moved");
        System.out.println("student");
        System.out.println("-----------------------");
    }

}
//alt+insert:自动生成getset方法
//这里是封装思想

/*instanceof判断一个对象是什么类型判断有无父子关系
*实例：  X instanceof Y，如果XY是继承关系就会返回ture，负责为false，如果是继承同一个父类的两个子类，在instanceof两端，会返回false，因为他两个没有关系
*
* */