// class Account<T>{}
// Account<Gold> g1=new Account<Gold>();
// Account<Silver> g2=new Account<Silver>();


class Gen < T > {
    T obj;
    Gen (T obj) {
        this.obj = obj;
    }
    public void show () {
        System.out.println ("The type of object is :" + obj.getClass ().getName ());
    }
    public T getObject () {
        return obj;
    }
}

class LaunchGen1 {
    public static void main (String[]args) {
        Gen < Integer > g1 = new Gen < Integer > (10);
        g1.show ();
        System.out.println (g1.getObject ());
        
        
        Gen < String > g2 = new Gen < String > ("iNeuron");
        g2.show ();
        System.out.println (g2.getObject ());
        
        
        Gen < Double > g3 = new Gen < Double > (10.5);
        g3.show ();
        System.out.println (g3.getObject ());
        
    }
}


// The type of object is :java.lang.Integer
// 10
// The type of object is :java.lang.String
// iNeuron
// The type of object is :java.lang.Double
// 10.5
