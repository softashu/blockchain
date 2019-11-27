package com.ashu;

public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long sum;

    public Transaction(String sourceName, String destinationName, Long sum) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.sum = sum;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;

        Transaction that = (Transaction) o;

        if (!getSourceName().equals(that.getSourceName())) return false;
        if (!getDestinationName().equals(that.getDestinationName())) return false;
        return getSum().equals(that.getSum());
    }

    @Override
    public int hashCode() {
        int result = getSourceName().hashCode();
        result = 31 * result + getDestinationName().hashCode();
        result = 31 * result + getSum().hashCode();
        return result;
    }
}
