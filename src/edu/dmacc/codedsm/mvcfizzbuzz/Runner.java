package edu.dmacc.codedsm.mvcfizzbuzz;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username:");
        String userName = in.next();
        System.out.println("Enter a number:");
        Integer inputNumber = in.nextInt();

        MapRepository repository = new FizzBuzzMapRepository();
        FizzBuzzService service = new FizzBuzzServiceImpl(repository);
        SubmissionController controller = new SubmissionControllerImpl(service);

        controller.submit(inputNumber, userName);
    }

}
