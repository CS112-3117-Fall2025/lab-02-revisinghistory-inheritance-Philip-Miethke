public class RevisedHistoricalEvent extends HistoricalEvent{
    private String revisedDescription;
    private String citation;

    
    public RevisedHistoricalEvent(String description, Date date, String revisedDescription, String citation) {
        super(description, date);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    
    public void teach() {
        System.out.println("Original Description:\n" + getDescription());
        System.out.println("\nRevised Description:\n" + revisedDescription);
        System.out.println("\nCitation: " + citation);
    }
}
