package template_pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ExcelFile obj = new ExcelFile();
        obj.readProcessAnSave();

        TextFile obj2 = new TextFile();
        obj2.readProcessAnSave();


    }
}
