package com.ashu;

import java.util.List;

public class Block {
    private int previousHash;
    private List<Transaction> transactions;

    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Block)) return false;

        Block block = (Block) o;

        if (getPreviousHash() != block.getPreviousHash()) return false;
        return getTransactions().equals(block.getTransactions());
    }

    @Override
    public int hashCode() {
        int result = getPreviousHash();
        result = 31 * result + getTransactions().hashCode();
        return result;
    }
}
