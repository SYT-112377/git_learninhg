public static void main(String[] args) {
    Student s1 =new Student();
    s1.setName("gugugaga111");
    System.out.println(s1.getName());
    s1.move();
}
/*多态：Father s1=new Son
* 这时：s1可以访问父类方法，如果子类有父类方法的重写，是
* s1访问子类重写后的方法，但是s1无法访问独属于子类的方法
*
* 不能被重写的方法：
* 1、static方法，属于类不属于对象
* 2、final方法，无法重写（相当于const）
* 3、private方法
* */