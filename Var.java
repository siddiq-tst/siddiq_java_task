public class Var {

    int instance_var = 20;
    static int static_var = 10;

    public static void main(String[] args) {
        int local_var = 100;

        Var m = new Var();
        Var m1 = new Var();

        System.out.println(local_var);
        System.out.println(m.instance_var);
        System.out.println(m1.instance_var);
        System.out.println(static_var);
    }
}
