package butryojantho.sirawitch.lab6;

import java.util.Comparator;

public class SortMobileDevicesByPrice implements Comparator<MobileDevice> {
    public int compare(MobileDevice a, MobileDevice b) {
        return (int) (a.getPrice() - b.getPrice());
    }
}
