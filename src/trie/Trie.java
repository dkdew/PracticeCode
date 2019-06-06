package trie;

import java.util.HashMap;

public class Trie {

	static class TrieNode {

		private char value;
		private HashMap<Character, TrieNode> children;
		private boolean bIsEnd;

		public TrieNode(char ch) {
			value = ch;
			children = new HashMap<Character, TrieNode>();
			bIsEnd = false;
		}

		public HashMap<Character, TrieNode> getChildren() {
			return children;
		}

		public char getValue() {
			return value;
		}

		public void setEnd(boolean isEnd) {
			bIsEnd = isEnd;
		}

		public boolean isEnd() {
			return bIsEnd;
		}

	}

	private TrieNode root;

	public Trie() {
		root = new TrieNode((char) 0);
	}

	public void insert(String word) {
		int length = word.length();
		TrieNode current = root;
		
		for(int i = 0; i< length; i++){
			char ch = word.charAt(i);
			HashMap<Character, TrieNode> child = current.getChildren();
			if(child.containsKey(ch)){
				current = child.get(ch);
			}else{
				TrieNode tn = new TrieNode(ch);
				child.put(ch,  tn);
				current = tn;
			}
		}
		current.setEnd(true);
	}

}
