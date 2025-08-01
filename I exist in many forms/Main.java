class hillstation{
    void location(){
        System.out.println("LOCATION IS...");
    }
    void famous_for(){
        System.out.println("FAMOUS FOR...");
    }
}

class Manali extends hillstation{
    void location(){
        System.out.println("Manali is in himachal pradesh");
    }
    void famous_for(){
        System.out.println("Temple and adventure sports");
    }
}

class Massori extends hillstation{
    void location(){
        System.out.println("Massori is in Uttrakad");
    }
    void famous_for(){
        System.out.println("Education Instituions");
    }
}

class Gunmard extends hillstation{
    void location(){
        System.out.println("Gunmard is in J & K");
    }
    void famous_for(){
        System.out.println("Skiing");
    }
}

class Main{
    public static void main(String[] args) {
        hillstation a=new hillstation();
        hillstation m=new Manali();
        hillstation ma=new Massori();
        hillstation g = new Gunmard();
        a.location();
        a.famous_for();
        m.location();
        m.famous_for();
        ma.location();
        ma.famous_for();
        g.location();
        g.famous_for();
    }
}