package testAndfun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class wordLadder {
	int len = 0;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		wordLadder wl = new wordLadder();
		// Set<String> set = {"hit","hog","hig","dog","fog"};
		Set<String> set = new HashSet<String>();
		set.add("hit");
		set.add("jit");
		set.add("doo");
		set.add("hog");
		set.add("hig");
		set.add("dog");
		set.add("dug");
		set.add("kmq");
		String begin = "hit";
		String end = "dug";
		System.out.println(wl.ladderLength3(begin, end, set));
		// System.out.print(compare("hig","hit"));
	}

	public int ladderLength3(String beginWord, String endWord, Set<String> wordList){
		// Use queue to help BFS
        if (wordList == null || wordList.size() == 0) {
            return 0;
        }

        HashSet<String> hash = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.offer(beginWord);
        hash.add(beginWord);
        
        int length = 1;
        while(!queue.isEmpty()) {
            length++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                for (String nextWord: getNextWords(word, wordList)) {
                    if (hash.contains(nextWord)) {
                        continue;
                    }
                    if (nextWord.equals(endWord)) {
                        return length;
                    }
                    System.out.println(nextWord);
                    hash.add(nextWord);
                    queue.offer(nextWord);
                }
            }
        }
        return 0;
	}
	
	private static String replace(String s, int index, char c) {
        char[] chars = s.toCharArray();
        chars[index] = c;
        return new String(chars);
    }
    
    private static ArrayList<String> getNextWords(String word, Set<String> dict) {
        ArrayList<String> nextWords = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < word.length(); i++) {
                if (c == word.charAt(i)) {
                    continue;
                }
                String nextWord = replace(word, i, c);
                if (dict.contains(nextWord)) {
                    nextWords.add(nextWord);
                }
            }
        }
        return nextWords;
    }
	
	public int ladderLength2(String beginWord, String endWord,
			Set<String> wordList) {
		LinkedList<String> queue = new LinkedList<String>();
		if (beginWord.equals(endWord)) {
			return 0;
		}
		if (wordList.isEmpty())
			return Integer.MAX_VALUE;
		queue.offer(beginWord);
		Set<String> list = new HashSet<String>(wordList);
		while (!queue.isEmpty()) {
			int size = queue.size();
			
			for (int i = 0; i < size; i++) {
				String tmp = queue.poll();
				System.out.println(tmp);
				if (tmp.equals(endWord)) {
					if (min > len)
						min = len + 1;
				}
				
				list.remove(tmp);
				System.out.println(list);
				for (String s : list) {
					if (compare(s, tmp) == 1) {
						queue.offer(s);
					}
				}
			}
			len++;
		}
		if(min==Integer.MAX_VALUE || min <0)
			return 0;
		return min;
	}

	// Down there, DFS
	public int ladderLengthHelper(String beginWord, String endWord,
			Set<String> wordList) {
		int min = ladderLength(beginWord, endWord, wordList) + 1;
		if(min==Integer.MAX_VALUE || min <0)
			return 0;
		return min;
	}

	public int ladderLength(String beginWord, String endWord,
			Set<String> wordList) {
		Set<String> wordList2 = new HashSet<String>(wordList);
		int path = Integer.MAX_VALUE;
		// if(!wordList.contains(beginWord) || !wordList.contains(endWord))
		// return 0;
		if (beginWord.equals(endWord))
			return 0;
		if (wordList2.isEmpty())
			return Integer.MAX_VALUE;
		wordList2.remove(beginWord);
		for (String s : wordList2) {
			if (compare(s, beginWord) == 1) {
				int tmp = ladderLength(s, endWord, wordList2) + 1;
				if (path > tmp) {
					path = tmp;
					System.out.println(s);
				}
			}
		}

		return path;
	}

	private static int compare(String str1, String str2) {
		int cnt = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i))
				cnt++;
		}
		return cnt;
	}
}
