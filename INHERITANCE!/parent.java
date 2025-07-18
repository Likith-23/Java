public class parent{
    int age, id;
    String name;
    void naming(String name){
        System.out.println("NAME - "+name);
    }
}

class child extends parent{
    void age1(int age){
        System.out.println("Age of student is..."+age);

    }
}

class student{
    public static void main(String []er){
        child obj = new child();
        obj.naming("LIKITH");
        obj.age1(14);
    }
}