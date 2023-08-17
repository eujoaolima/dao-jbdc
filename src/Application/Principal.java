package Application;

import Model.Entities.Department;

public class Principal {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);
    }
}
