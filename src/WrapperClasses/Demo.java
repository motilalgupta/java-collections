package WrapperClasses;

public class Demo {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        Integer i1 = Integer.valueOf("123");

        System.out.println(i);
        System.out.println(i1);

        int obj = Integer.parseInt("1234");         // autoboxing and unboxing
       boolean bol = Boolean.parseBoolean("true");
//        System.out.println(obj);
//        System.out.println(bol);

       Double d = 9.23;
       int i2 = d.intValue();
        System.out.println(i2);

        Integer s = 66;
        String ks = s.toString();
//        System.out.println(ks);

        Integer a = 100;
        Integer b = 100;
        System.out.println(a==b);   // Note: -128 - 127 primitive class maintain cache.
        // instead of assigning new object it assign the same one. And == compare reference

        Integer pb = 128;
        Integer bp = 128;
        System.out.println(pb.equals(bp)); // compare content
    }
}
