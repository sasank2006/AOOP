package task_3;

class JSONImporter extends DataImporter {
    @Override
    protected void readData(String filePath) {
        System.out.println("Reading JSON data from " + filePath);
        // Implementation for reading JSON data
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data...");
        // Implementation for parsing JSON data
    }

    @Override
    protected void validateData() {
        System.out.println("Validating JSON data...");
        // Implementation for validating JSON data
    }
}

