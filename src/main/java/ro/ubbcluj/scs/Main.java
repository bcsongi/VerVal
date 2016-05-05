package ro.ubbcluj.scs;

public class Main {

    public static void main(String[] args) {
        LogAnalyser logAnalyser = new LogAnalyser(new AtomReactorImpl());
        System.out.println(logAnalyser.isValidLogFileName("test.filename"));
    }

}