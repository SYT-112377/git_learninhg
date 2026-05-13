public class Person {
    public String name="gugugaga";
    public void move(){
        System.out.println("sb.has moved");
        System.out.println(name);
        System.out.println("----------------------------");
    }
}


/*
* 使用static
* 1、static  静态的；
* 2、static可以用来修饰属性、方法、类甚至代码块。
* 3、在修饰属性时，属性可以直接通过类名调用而非实例化后的实例名称，如
*
*
* pubic class Student(){
* public static age；
* public name；
* }
* Student s1=new student；
* s1.name;
* Student.age;
*
* 因为static在类加载的时候已经加载了，比name先加载出来，跟着类而非跟着实例化对象
*
*
* 当static修饰方法时，同样，跟着类加载，先于其他方法，所以可以在其他方法中调用static静态方法
* 也可以在静态方法中调用其他静态方法，但是不能在静态方法中调用非静态方法。
*
* 被static静态修饰总是最先被加载出来，在代码块中，存在静态代码块（可以在类中使用）如static{******}
他是被优先加载的，还有匿名代码块如{*****}，在类的加载顺序中静态>匿名>普通
*
* 对于类的方法，静态方法就相当于在给草纸的时候已经有了这个方法，其他方法要现画，这样可以方便其他代码的构建* */