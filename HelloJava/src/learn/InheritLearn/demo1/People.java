package learn.InheritLearn.demo1;

/**
 * @author: 朢曐(雷杨一凡)
 * @Title: People
 * @ProjectName: java-se-learning
 * @Description：
 * @date： 2021/8/25 9:36
 */
public class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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
}
