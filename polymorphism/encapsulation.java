class en {
    private String name;
    private int roll;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRoll(int newRoll) {
        roll = newRoll;
    }
}

public class encapsulation {
    public static void main(String args[]) {
        en obj = new en();
        obj.setName("shreyansh tyagi");
        obj.setAge(21);
        obj.setRoll(36);

        System.out.println(" Student name = " + obj.getName());
        System.out.println(" Student age = " + obj.getAge());
        System.out.println(" Student roll = " + obj.getRoll());
    }

}