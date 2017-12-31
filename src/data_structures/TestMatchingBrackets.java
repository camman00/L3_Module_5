package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		//assertTrue(doBracketsMatch("{}"));
		//assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<Character> brackets = new Stack<Character>();
		for(char a : b.toCharArray()) {
			System.out.println(a);
			brackets.push(a);
		}
		int avg = 0;
		for(int x = 0; x < brackets.size(); x++) {
			char chare = brackets.pop();
			if(chare == '{') {
				avg++;
			}
			else if(chare == '}') {
				avg--;
			}
		}
		if(avg == 0) {
			return true;
		}
		return false;
	}

}