package DSA;

public class employee_structure {

    public String name;
    public int joining_year;
    public String address;

    public employee_structure(String n, int y , String addr)
    {
        this.name = n;
        this.joining_year = y;
        this. address = addr;
    }

    public void display_data()
    {
        System.out.print(name+"\t\t"+joining_year+"\t\t"+address+"\n");
    }

    public static void main(String[] args) {
        employee_structure emp1 = new employee_structure("Aman",2022,"H14 H'Block Panaji");
        employee_structure emp2 = new employee_structure("Vishal",2023,"k7 k'Block Margao");
        employee_structure emp3 = new employee_structure("Arun",2020,"A3 A'Block Vasco");
        System.out.println("Name\t\tYear of Joining\t\tAddress\n");
        emp1.display_data();
        emp2.display_data();
        emp3.display_data();
    }

}
