package com.ashu;

import java.util.Arrays;

public class BlockChainExample {

    public static void main(String[] args) {

        /*
         * Block chain
         * Block -----Hash of previous block + Transactions
         * Chained together
         *
         *
         */
        final Transaction transaction1 = new Transaction("Ashutosh", "Ramanan", 30L);
        final Transaction transaction2 = new Transaction("Ramanan", "Ashutosh", 1000L);
        final Transaction transaction3 = new Transaction("Ashutosh", "Purushottam", 50L);
        final Transaction transaction4 = new Transaction("Ashutosh", "Purushottam", 50L);

        final Block genesisBlock = new Block(0, Arrays.asList(transaction1, transaction2, transaction3));
        System.out.println(genesisBlock.hashCode());
        final Block secondBlock = new Block(genesisBlock.hashCode(), Arrays.asList(transaction2));
        System.out.println(secondBlock.hashCode());
    }
}
