package ListSetMap;

import javax.xml.bind.annotation.XmlType;
import java.util.EnumSet;

public enum Week {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7),DEFAULT(0);

    private int id;

    Week (int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public static Week getDayById(int day) {
        Week result = DEFAULT;
        for (Week week : Week.values()) {
            if (week.getId() == day) {
                result = week;
                break;
            }
        }
        return result;
    }
}
