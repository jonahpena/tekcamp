package template;

import udemytemplate.DataRenderer;

public class XMLDataRenderer extends Template {
    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "Processed " + data;
    }
}
