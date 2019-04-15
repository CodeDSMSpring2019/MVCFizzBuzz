package edu.dmacc.codedsm.mvcfizzbuzz;

public class SubmissionControllerImpl implements SubmissionController {

    private FizzBuzzService service;

    public SubmissionControllerImpl(FizzBuzzService service) {
        this.service = service;
    }

    @Override
    public void submit(Integer inputNumber, String userName) {
        Submission submission = new Submission();
        submission.setInputNumber(inputNumber);
        submission.setUserName(userName);

        service.performFizzBuzzLogic(submission);
    }
}
