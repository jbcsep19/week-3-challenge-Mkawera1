import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<>();
        int size = jobs.size();
        String name = "";
        String emailAddress = "";
        String userInput = "";
        String company = "";
        String jobTitle = "";
        int startDate = 0;
        int endDate = 0;
        String jobDescription = "";

        System.out.println("Please enter name: ");
        name = sc.nextLine();

        System.out.println("Please enter email address: ");
        emailAddress = sc.nextLine();

        System.out.println("We are creating a list of jobs and if you want to stop enter 'stop'.");
        int counter = 1;
        while(true){
            Job job1 = new Job();
            System.out.println("Please enter the company " +counter);
            company = sc.nextLine();
            job1.setCompany(company);

            System.out.println("Please enter the job title " +counter);
            jobTitle = sc.nextLine();
            job1.setJobTitle(jobTitle);

            System.out.println("Please enter the start date  " +counter);
            startDate = sc.nextInt();
            job1.setStartDate(startDate);

            System.out.println("Please enter the end date " +counter);
            endDate = sc.nextInt();
            job1.setEndDate(endDate);

            System.out.println("Please enter the job description " +counter);
            jobDescription = sc.next();
            job1.setJobDescription(jobDescription);



            jobs.add(job1);
            counter = counter + 1;
            userInput = sc.nextLine();


            System.out.println("Do you want to stop? (stop/n)");
            userInput = sc.nextLine();

            if(userInput.equalsIgnoreCase("stop")){
                break;


            }


        }
        counter = 1;
        for(Job job : jobs){
            System.out.println("Job" + counter);
            System.out.println(job.displayList());
            counter = counter + 1;

        }

        size = jobs.size();
        System.out.println("The number of jobs in the list is: " +size);
        }





    }

