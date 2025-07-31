class idgenerator {
    static String college_name;
    static String address;
    String name;
    int reg_no;
    String program;
    String dob;

    idgenerator(String name, int reg_no, String program, String dob) {
        this.name = name;
        this.reg_no = reg_no;
        this.program = program;
        this.dob = dob;

    }

    static {
        System.out.println("..........Welcome to SNU Chennai ID Generator......");
        college_name = "SNU Chennai";
        address = "Kalavakkam";
    }

    void generator() {
        System.out.println("College Name:" + college_name);
        System.out.println("Address:" + address);
        System.out.println("Name:" + name);
        System.out.println("reg_no:" + reg_no);
        System.out.println("Program:" + program);
        System.out.println("DOB:" + dob);
        System.out.println("............................................");
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        idgenerator stu1 = new idgenerator("rajesh", 123, "BTech", "10.05.2006");
        idgenerator stu2 = new idgenerator("Jhon", 124, "BTech", "12.09.2006");

        stu1.generator();
        stu2.generator();
    }
}
