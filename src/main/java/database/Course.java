package database;

public class Course {
    private String courseId;
    private String subjectId;
    private String courseNumber;
    private String title;
    private String numOfCredits;

    public Course() {
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", title='" + title + '\'' +
                ", numOfCredits='" + numOfCredits + '\'' +
                '}';
    }

    public String getNumOfCredits() {
        return numOfCredits;
    }

    public void setNumOfCredits(String numOfCredits) {
        this.numOfCredits = numOfCredits;
    }



}
