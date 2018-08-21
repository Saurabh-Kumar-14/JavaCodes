package com.navis.shipping;

import java.util.Comparator;

public abstract class ContainerIdComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        Container c1 = (Container) o1;
        Container c2 = (Container) o2;

        if (c1.getcId().compareTo( c2.getcId()) < 0) {
            return -1;
        }
        else if (c1.getcId().compareTo( c2.getcId()) > 0) {
            return 1;
        }
        else
            return 0;
    }


}
