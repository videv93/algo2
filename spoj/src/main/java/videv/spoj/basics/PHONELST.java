package videv.spoj.basics;

import java.util.Scanner;

public class PHONELST {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int t = scanner.nextInt();
       while (t-- > 0) {
           int n = scanner.nextInt();
           scanner.nextLine();

           Trie trie = new Trie();
           boolean b = true;
           for (int i = 0; i < n; i++) {
               String s = scanner.nextLine();
               if (!trie.insertAndCheckingDuplicatte(s)) {
                   b = false;
                   break;
               }
           }
           if (b) {
               System.out.println("YES");
           } else {
               System.out.println("NO");
           }
       }

    }
    public static class Trie {
        // Alphabet size (# of symbols)
        static final int ALPHABET_SIZE = 10;

        private TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        private static class TrieNode {

            TrieNode[] children = new TrieNode[ALPHABET_SIZE];

            // isEndOfWord is true if the node represents
            // end of a word
            boolean isEndOfWord;

            private TrieNode() {
                isEndOfWord = false;
                for (int i = 0; i < ALPHABET_SIZE; i++)
                    children[i] = null;
            }
        }

        // If not present, inserts key into trie
        // If the key is prefix of trie node,
        // just marks leaf node
        public void insert(String key) {
            int level;
            int length = key.length();
            int index;

            TrieNode pCrawl = root;

            for (level = 0; level < length; level++) {
                index = key.charAt(level) - '0';
                if (pCrawl.children[index] == null)
                    pCrawl.children[index] = new TrieNode();

                pCrawl = pCrawl.children[index];
            }

            // mark last node as leaf
            pCrawl.isEndOfWord = true;
        }

        /**
         * If not present, inserts key into trie
         * If the key is prefix of trie node,
         * just marks leaf node
         * @param key
         * @return
         */
        public boolean insertAndCheckingDuplicatte(String key) {
            int level;
            int length = key.length();
            int index;

            TrieNode pCrawl = root;

            for (level = 0; level < length; level++) {
                index = key.charAt(level) - '0';
                if (pCrawl.children[index] != null  && pCrawl.children[index].isEndOfWord)
                    return false;

                if (pCrawl.children[index] == null) {
                    pCrawl.children[index] = new TrieNode();
                }

                pCrawl = pCrawl.children[index];
            }

            // mark last node as leaf
            pCrawl.isEndOfWord = true;
            return true;
        }

        /**
         * Returns true if key presents in trie, else false
         * @param key
         * @return
         */
        public boolean search(String key) {
            int level;
            int length = key.length();
            int index;
            TrieNode pCrawl = root;

            for (level = 0; level < length; level++) {
                index = key.charAt(level) - '0';

                if (pCrawl.children[index] == null)
                    return false;

                pCrawl = pCrawl.children[index];
            }

            return (pCrawl != null && pCrawl.isEndOfWord);
        }

    }
}
