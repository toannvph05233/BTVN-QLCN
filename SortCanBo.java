package BTVN2;

import java.util.Comparator;

public class SortCanBo implements Comparator<CanBo> {
    @Override
    public int compare(CanBo o1, CanBo o2) {
        return o1.getHoTen().compareTo(o2.getHoTen());
    }
}
