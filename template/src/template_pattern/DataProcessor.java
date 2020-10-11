package template_pattern;

public abstract class DataProcessor {
    public void readProcessAnSave(){
        readData();
        processData();
        saveData();
    }

    public abstract void readData();
    public abstract void processData();

    public void saveData(){
        System.out.println("Save data to de Db");
    }
}
