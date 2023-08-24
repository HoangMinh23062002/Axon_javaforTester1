public class Programming {
    private String language;
    boolean LearningComplete = false;

    public Programming(String language) {
        this.language = language;

    }

    public void CompeletLearning() {
        if (LearningComplete) {
            System.out.println("This is not " + language);
        }
        else {
            System.out.println("This is "+ language);
        }
    }

    public void learningStatus() {
        LearningComplete = true;
    }
}
