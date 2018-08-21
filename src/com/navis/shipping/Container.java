package com.navis.shipping;

import java.util.Comparator;
import java.util.Objects;

public class Container extends ContainerIdComparator implements Comparable {

    private String cId;
    private String status;
    private int isoType;
    private int seal;
    private int cTareWeight;
    private int cPayWeight;
    private boolean cDamage;

    public void setToChe(String cheId){

    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIsoType() {
        return isoType;
    }

    public void setIsoType(int isoType) {
        this.isoType = isoType;
    }

    public int getSeal() {
        return seal;
    }

    public void setSeal(int seal) {
        this.seal = seal;
    }

    public int getcTareWeight() {
        return cTareWeight;
    }

    public void setcTareWeight(int cTareWeight) {
        this.cTareWeight = cTareWeight;
    }

    public int getcPayWeight() {
        return cPayWeight;
    }

    public void setcPayWeight(int cPayWeight) {
        this.cPayWeight = cPayWeight;
    }

    public boolean iscDamage() {
        return cDamage;
    }

    public void setcDamage(boolean cDamage) {
        this.cDamage = cDamage;
    }

    @Override
    public String toString() {
        return "Container{" +
                "cId='" + cId + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {

        Container ref = (Container)o;
        if(this.getcId() == ref.getcId()){

            return true;
        }
        return false;

       /* if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return Objects.equals(cId, container.cId);*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId);
    }

    @Override
    public int compareTo(Object o){

        Container ref = (Container) o;
        if (this.getcId().compareTo(ref.getcId()) < 0)
                return -1;
        else if (this.getcId().compareTo(ref.getcId()) > 0)
                return 1;
        else
                return 0;
    }
}
