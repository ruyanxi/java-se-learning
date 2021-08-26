package learn.AbstractLearn.demo3;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: Animal
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/26 11:31
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

    public void show(Animal a){
        System.out.println(a.getName()+", "+a.getAge());
    }

}
