public class Job {

    private String company;
    private String jobTitle;
    private int startDate;
    private int endDate;
    private String jobDescription;

    public Job() {
    }

    public Job(String company, String jobTitle, int startDate, int endDate, String jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    public String displayList(){
        String display = "Company: " + getCompany() + "\nJob Title: " + getJobTitle() +
                "\nStart Date: " + getStartDate() + "\nEnd Date: " + getEndDate() +
                "\nJob Description: " + getJobDescription();
        return display;

    }

}
