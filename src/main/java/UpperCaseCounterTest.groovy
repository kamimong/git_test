//import org.junit.jupiter.api.Test
//
//
////import static org.junit.Assert.*;
//class UpperCaseCounterTest {
//    private  UpperCaseCounter upperCaseCounter = new UpperCaseCounter(); //Test를 할 것이 이 클래스라서 객체로 불러옴
//    @Test
//    public void 널체크(){
//        String str = null;
//
//        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
//        assertTrue(condition:result == 0);
//    }
//    @Test
//    public void 빈값체크(){
//        String str = "";
//        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
//
//        assertTrue(condition: result == 0);
//    }
//    @Test
//    public void 대문자_ABC(){
//        String str = "ABC";
//        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
//        System.out.println("result ::"+result);
//        assertTrue(condition: result == 3);
//        assertFalse(condition: result ==2);
//
//    }
//    @Test
//    public void 대소문자_ABCdefGHI(){
//        String str = "ABCdefGHI";
//        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
//        System.out.println("result ::"+result);
//        assertTrue(condition: result == 6);
//        assertFalse(condition: result == 5);
//    }
//}
