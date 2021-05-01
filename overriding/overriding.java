class parent {
    void show() {
        System.out.println("__THIS IS PARENT CLASS__");
    }
}

class child extends parent {
    void show() {
        System.out.println("__THIS IS child CLASS __");
    }
}

public class overriding {
    public static void main(String args[]) {
        parent ob1 = new parent();
        ob1.show();
        parent ob2 = new child();
        ob2.show();

        // child ob1 = new child();
        // ob1.show();
    }

}