class animal {
    void eat(){
        System.out.println("IM EAT METHOD");
    } 
}

class lion extends animal{
    void roar(){
        System.out.println("IM INSIDE ROAR METHOD");
    }
}

class baby extends lion{
    void weep(){
        System.out.println("IM INSIDE WEEP CLASS");
    }
}

class animals{
    public static void main(String[] args) {
        baby obj = new baby();
        obj.eat();
        obj.roar();
        obj.weep();
    }
}