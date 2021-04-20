package CombinationOfSubjects;

public class combinationOfSubjects {
    private String subject1;
    private String subject2;
    private String subject3;

    public combinationOfSubjects(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    @Override
    public String toString() {
        if(subject1.equalsIgnoreCase("toán")&&subject2.equalsIgnoreCase("lý")&&subject3.equalsIgnoreCase("hoá"))
            return "Khối A";
        else if(subject1.equalsIgnoreCase("toán")&&subject2.equalsIgnoreCase("hoá")&&subject3.equalsIgnoreCase("sinh"))
            return "Khối B";
        else if(subject1.equalsIgnoreCase("văn")&&subject2.equalsIgnoreCase("sử")&&subject3.equalsIgnoreCase("địa"))
            return "Khối C";
        else return "Không có khối nào hợp với các môn này!!";
    }
}