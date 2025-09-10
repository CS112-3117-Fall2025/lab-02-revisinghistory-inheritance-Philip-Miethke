public class HistoricalEvent {
    private String description;
    private Date date;

    
    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = new Date(date); 
    }

   
    @Override
    public String toString() {
        return "Date: " + date + "\nDescription: " + description;
    }

    
    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return new Date(date);
    }
}
