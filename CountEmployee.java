class CountEmployee {
    static int count = 0;
    String name;
    int id;
    static String companyName = "SimformSolutions";

    static {
        System.out.println("Hello");
    }



    CountEmployee(String name, int id) {
        count++;
        this.name = name;
        this.id = id;

    }

    static void count() {
        System.out.println("Count of the Employee " + count);
    }

    void display() {
        System.out.println("Name of the employeee : " + name + " \\ Id : " + id + " \\ Company Name : " + companyName);
    }

}



