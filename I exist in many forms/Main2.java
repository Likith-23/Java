abstract class object{
    abstract void showshape();
    public void shape(){
        System.out.println("IM FROM ABSTRACT CLASS");
    }
}

class sphere extends object{
    void showshape(){
        System.out.println("OBJECT TYPE IS SHPERE");
    }
}

class cube extends object{
    void showshape(){
        System.out.println("OBJECT TYPE IS CUBE");
    }
}

class prism extends object{
    void showshape(){
        System.out.println("OBJECT TYPE IS PRISM");
    }
}

public class Main2{
    public static void main(String[] args) {
        object obj = new sphere();
        obj.showshape();
        obj = new cube();
        obj.showshape();
        obj = new prism();
        obj.showshape();
        obj.shape();
    }
}