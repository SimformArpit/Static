class Staticmain {
    public static void main(String[] args) {
        CountEmployee c1 = new CountEmployee("Arpit" , 198 );
        System.out.println(CountEmployee.count);;
        c1.display();
        CountEmployee.count();
        System.out.println();

        CountEmployee c2 = new CountEmployee("Yash" , 199);
        System.out.println(CountEmployee.count);;
        c2.display();
        CountEmployee.count();
        System.out.println();

        CountEmployee c3 = new CountEmployee("Parth" , 200);
        System.out.println(CountEmployee.count);;
        c3.display();
        CountEmployee.count();
    }

}
