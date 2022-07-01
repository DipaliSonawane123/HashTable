/*Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but
 * because they keep putting themselves deliberately into paranoid avoidable situations”
 * - Use LinkedList to do the Hash Table Operation like here the removal of word avoidable
 * - To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode
 */
package com.hashtable;
public class HashTableMain {

    public static void main(String[] args) {

        MyHashTable<String, Integer> hashTable = new MyHashTable();
        String sentence = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        // Storing given sentence in an array.
        //Converting the sentence to lower case and removing spaces.

        String[] sentenceArray = sentence.toLowerCase().split(" ");

        //  Iterating over the array.
        for (String word : sentenceArray) {
            Integer value = hashTable.get(word);

            if( value == null) // //frequency of the word StayWith 1
                value = 1;
            else
                value = value + 1; //frequency of the word increases by 1
            hashTable.add(word , value);
            System.out.println("Value = "+value);
        }
        System.out.println(hashTable);

        //Remove "avoidable" from the hashtable
        hashTable.remove("avoidable");

        System.out.println(hashTable);
    }
}
