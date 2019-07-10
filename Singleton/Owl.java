public class Owl
{
    private static Owl uniqueInstance = null;
    private String name;
    private float age;

    private Owl() {}

    public static Owl getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Owl();
        }
        return uniqueInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }
}
