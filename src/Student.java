public class Student {


    private String name;
    private int age;
    private double gpa;
    // Keep track the range of the GPA
    private boolean isGPAValid;


    public Student(String name, double gpa, int age) {
        this.name = name;
        // Set GPA to check
        setGpa(gpa);
        this.age = age;
    }

    // pass GPA to if conditions and print it
    public String getGpaStatus() {
        if (!isGPAValid) {
           return "Invalid GPA";
        } else if (gpa > 3) {
           return "Excellent!";

        } else if (gpa <= 3 && gpa >= 2) {
           return "Good!";
        } else if (gpa < 2 &&gpa>=0) {
           return "Need Improvement.";
        } else {
             return "Invalid GPA!";

        }
    }

    public void setGpa(double gpa){
            if(gpa>=0.0 && gpa<=4){
            this.gpa=gpa;
            isGPAValid= true;
            }else {
                isGPAValid=false;
            }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
