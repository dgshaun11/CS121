package weekThirteen.LabTwelve;

public class Main {
    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.addArray(13);
        ds.addArray(14);
        ds.addArray("JP Rogers");
        ds.displayArray();
        ds.addArrayList("Shaun");
        ds.addArrayList("JP");
        ds.addArrayList(15);
        ds.displayArrayList();
        ds.addQueue("Fort Wayne");
        ds.addQueue(14);
        ds.addQueue("Somali");
        ds.displayQueue();
        ds.put("9+10", 21);
        ds.put(22222.1,"no");
        ds.displayHashMap();

    }
}
