public class Human {
    int age = 20;

    public static void main(String[] args) {
        //System.out.println("Hello, world!");
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getSecretAge(30));
    }

    int getAge() {
        return age;
    }

    int getSecretAge(int i) {
        return i;
    }
}
