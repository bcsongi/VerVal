package ro.ubbcluj.scs;

public class Main {
    
	public static void main(String[] args) {
        LogAnalyser logAnalyser = new LogAnalyser();
        System.out.println(logAnalyser.isValidLogFileName("test.filename"));
    }
	
}