package template;

public abstract class Template {
    public void render() {
        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);

    }

    public abstract String readData();

    public abstract String processData(String data);
}
