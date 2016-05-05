package ro.ubbcluj.scs;

public class LogAnalyser {

    private FileManager fileManager;

    public LogAnalyser(){}

    public LogAnalyser(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public boolean isValidLogFileName(String name) {
        if (name != null) {
            if (name.length() < fileManager.getLogNameExt().length() + 2) {
                throw new IllegalArgumentException("Name is to short.");
            }
            return name.endsWith("." + fileManager.getLogNameExt());
        }
        return false;
    }

}
