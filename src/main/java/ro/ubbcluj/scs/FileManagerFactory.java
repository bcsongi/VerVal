package ro.ubbcluj.scs;

public class FileManagerFactory {

    private static FileManagerFactory INSTANCE;
    private FileManager fileManager;

    private FileManagerFactory(FileManager fileManager){
        this.fileManager = fileManager;
    }

    public static FileManagerFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new FileManagerFactory(new FileManagerImpl());
        }
        return INSTANCE;
    }

    public FileManager getFileManager(){
        return INSTANCE.getFileManager();
    }

    public void setFileManager(FileManager fileManager){
        this.fileManager = fileManager;
    }
	
}
