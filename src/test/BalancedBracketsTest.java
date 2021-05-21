package test;

import main.BalancedBrackets;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;


public class BalancedBracketsTest {



    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyNonBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalBrackets("LaunchCode"));
    }

    @Test
    public void onlyEmptyReturnFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyLettersBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void onlyLettersOneBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void onlyTwoBackBrackets(){
        assertFalse(BalancedBrackets.hasTwoBackBrackets("]["));
    }
    @Test
    public void onlyTwoBackWithLettersBrackets(){
        assertFalse(BalancedBrackets.hasTwoBackBrackets("Launch]Code["));
    }
    @Test
    public void hasCurlyBracketsInsteadOfSquareBracket(){
        assertFalse(BalancedBrackets.hasBalBrackets("{LaunchCode}"));
    }
    @Test
    public void hasBracketsInsteadOfSquareBracket(){
        assertFalse(BalancedBrackets.hasBalBrackets("(LaunchCode)"));
    }
    @Test
    public void hasSpaceInsteadOfSquareBracket(){
        assertFalse(BalancedBrackets.hasBalBrackets("Launch Code"));
    }



}
