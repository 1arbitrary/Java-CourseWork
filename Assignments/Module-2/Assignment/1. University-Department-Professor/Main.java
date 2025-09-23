class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName;
    private String hodName;
    private Professor professors[]; 
    private int professorCount;     

    public Department(String deptName, String hodName, int maxProfessors) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new Professor[maxProfessors];
        this.professorCount = 0;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getHodName() { return hodName; }
    public void setHodName(String hodName) { this.hodName = hodName; }

    public Professor[] getProfessors () { return professors; }

    public void addProfessor(Professor p) {
        if (professorCount < professors.length) {
            professors[professorCount++] = p;
        } else {
            System.out.println("Cannot add more professors. Array is full.");
        }
    }

    @Override
    public String toString() {
        String result = "Department: " + deptName + "\nHOD: " + hodName + "\nProfessors:\n";
        for (int i = 0; i < professorCount; i++) {
            result += professors[i].toString() + "\n";
        }
	
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science", "Dr. Mehta", 5);

        Professor p1 = new Professor("Arjun", "P101", "AI");
        Professor p2 = new Professor("Neha", "P102", "ML");

        dept.addProfessor(p1);
        dept.addProfessor(p2);

        System.out.println("\n" + dept);
    }
}
