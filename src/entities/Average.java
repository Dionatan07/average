package entities;

public class Average {

    private double grade;

    public Average(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%.2f", grade);
    }

  
    
       
}
