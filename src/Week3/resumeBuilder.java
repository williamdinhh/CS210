package Week3;

import java.util.Scanner;

public class resumeBuilder {
    public static void main(String[] args) {
        //Suggestions:  One design is to create a scanner object in main,
        // and pass it to each method as a parameter argument.

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Resume Builder. Press enter to continue.");
        String name = getName(scan);
        String contact = getContactInfo(scan);
        String education = getEducation(scan);
        String work = getWorkExperience(scan);
        String skills = getSkills(scan);

        buildResume(name, contact, education, work, skills);
    }

    public static String getName(Scanner scan){
        // Prompts the user for their first and last name, and returns the values as a concatenated string value
        System.out.println("Please enter your first name!");
        String fir = scan.nextLine();
        System.out.println("Please enter your last name!");
        String las = scan.nextLine();
        return fir + " " + las;
    }

    public static String getContactInfo(Scanner scan){
        // Prompts the user for their contact info, and returns the values as a concatenated string value
        System.out.println("Please enter one of your contact information!");
        String contact = scan.nextLine();
        System.out.println("Please enter your second contact information!");
        String contact2 = scan.nextLine();
        return contact + ", " + contact2;
    }

    public static String getEducation(Scanner scan){
        // Prompts the user for their education school, major and graduation year
        // Returns the values as a concatenated string value.
        System.out.println("Please enter your education (HS, College, University, etc...!");
        String edu = scan.nextLine();
        System.out.println("Please enter your major, if you have one.");
        String major = scan.nextLine();
        System.out.println("Please enter your graduation year!");
        String gradYear = scan.nextLine();

        return edu + ", " + major + ", " + gradYear;
    }

    public static String getWorkExperience(Scanner scan){
        // Prompts the user for their most recent work experience, and returns the data as a string.
        System.out.println("Please enter your most recent work experience!");
       String work = scan.nextLine();

        return work;
    }

    public static String getSkills(Scanner scan){
        // Prompts the user for their list of skills, and returns them as a concatenated string.
        System.out.println("You will be prompted to enter 5 skills. Please select your first skill!");

        String skills = scan.nextLine();
        System.out.println("Please select your second skill!");

        String skills2 = scan.nextLine();
        System.out.println("Please select your third skill!");
        String skills3 = scan.nextLine();
        System.out.println("Please select your fourth skill!");

        String skills4 = scan.nextLine();
        System.out.println("Please select your fifth skill!");
        String skills5 = scan.nextLine();
        return skills + ", " + skills2 + ", " + skills3 + ", "+ skills4 + ", " + skills5;
    }

    public static void buildResume(String name, String contact, String education, String work, String skills){
        // Accepts the various data fields to the method as string parameter arguments.
        // The buildResume method will print and output the data to produce a formatted resume.
        System.out.println("Generating your resume!");
        System.out.println("Below is your formatted resume.");
        System.out.println("Name: " + name);
        System.out.println("Contact Information: " + contact);
        System.out.println("Education: " + education);
        System.out.println("Work: " + work);
        System.out.println("Skills: " + skills);

    }
}


