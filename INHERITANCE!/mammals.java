class mammal{
    void mam(){
        System.out.println("IM INSIDE MAMMAL CLASS");
    }
}

class lion extends mammal{
    void roar(){
        System.out.println("IM INSIDE LION CLASS");
    }
}

class human extends mammal{
    void hum(){
        System.out.println("IM SIDE HUMAN CLASS");
    }
}

class mammals{
    public static void main(String[] args) {
        lion obj = new lion();
        obj.hum();
        obj.roar();
        obj.mam();
    }
}