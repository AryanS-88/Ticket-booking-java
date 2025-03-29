package ticket.booking.entities;

import java.util.Map;
import java.util.List;


public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String,String> stationTimes;
    private List<String> stations;
}
