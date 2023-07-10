package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CollectionUtil {
    public static void main(String[] args) {
        Map<String, String> companyMap = new HashMap<>();
        companyMap.put("F1Soft", "F1Soft Internationals Pvt.Ltd");
        companyMap.put("ESEWA", "esewa Pvt.Ltd");

        System.out.println("Company name for code F1SOFT is: " + companyMap.get("F1Soft"));
    }
}
