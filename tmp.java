import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;

public class MyClass {
    
    public static class InterviewItem {
        String question;
        String answer;
        public InterviewItem( String question,  String answer){
            this.question =  question;
            this.answer =  answer;
        }
    }
    
    final MyClass.InterviewItem[] interviewItemsArray = new InterviewItem[]{
            new MyClass.InterviewItem("Abc ?", "Xyz"),
            new MyClass.InterviewItem("Abc ?", "Good"),
            new MyClass.InterviewItem("Abc ??", "Maybe C?"),
            new MyClass.InterviewItem("Abc ?", null),
            new MyClass.InterviewItem("Is this real?", "Maybe Yes"),
            new MyClass.InterviewItem("Is this real?", "Maybe NO"),
    };
    
    public static void main(String args[]) {
        List<MyClass.InterviewItem> resultList = emptyList();

        /* TODO create a list containing all InterviewItem objects from the interviewItemsArray, for which:
           - the answer property contains 'y' character
           - the question property ends with a single '?' character and
        */
        System.out.println("Size: " + resultList.size());
    }
}
