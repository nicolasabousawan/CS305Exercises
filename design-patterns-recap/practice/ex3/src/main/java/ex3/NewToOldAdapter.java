package ex3;

import java.time.LocalDateTime;
import java.util.Date;

public class NewToOldAdapter implements FacebookPoster{
    NewFacebookPosterImpl newInterface;

    public NewToOldAdapter(NewFacebookPosterImpl newInterface){
        this.newInterface = newInterface;
    }

    //converts from String to Post object
    public static Post StringToPost(String message){
        return new Post(message, new Date());
    }


    //gets string message from the post
    public static String PostToString(Post post){
        return post.getMessage();
    }


    @Override
    //gets thee string message from old interface and then
    //posts it using the new interface using the static methods above
    public long postMessage(String message) {
        return newInterface.post(StringToPost(message));
    }

    @Override
    //gets the post id from old interface and then
    //gets the message from the new interface and extracts the string
    public String getMessage(long postId) {
        return PostToString(newInterface.get(postId));
    }
}
