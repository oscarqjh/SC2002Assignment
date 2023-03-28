package main.Models;

public abstract class Project {
    protected String projectID;
    protected String supervisorName;
    protected String supervisorEmail;
    protected String supervisorID;
    protected String title;
    protected projectStatus status;
    protected String studentName;
    protected String studentEmail;
    protected String studentID;


    public Project(String projectID, String supervisorName,
                    String supervisorEmail, String title,
                    projectStatus status, String studentName,
                    String studentEmail){
        this.projectID = projectID;
        this.supervisorEmail = supervisorEmail;
        this.supervisorID = supervisorEmail.split("@")[0];
        this.supervisorName = supervisorName;
        this.title = title;
        this.status = status;
        this.studentEmail = studentEmail;
        this.studentID = studentEmail.split("@")[0];
        this.studentName = studentName;
    }

    public String getID(){return this.projectID;}
    public String getTitle(){return this.title;}
    public String getStudentID(){return this.studentID;}
    public String getStudentEmail(){return this.studentEmail;}
    public String getStudentName(){return this.studentName;}
    public String getSupervisorID(){return this.supervisorID;}
    public String getSupervisorName(){return this.supervisorName;}
    public String getSupervisorEmail(){return this.supervisorEmail;}
    public projectStatus getStatus(){return this.status;}

    public void setStudent(Student s){this.studentID= s.userID;}
    public void setSupervisor(Supervisor f){this.supervisorID= f.userID;}
    //only supervisor can setTitle
    public abstract void setTitle();

}