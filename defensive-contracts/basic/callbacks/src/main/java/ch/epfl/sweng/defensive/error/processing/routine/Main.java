package ch.epfl.sweng.defensive.error.processing.routine;

import ch.epfl.sweng.defensive.error.processing.routine.callback.Callback;
import ch.epfl.sweng.defensive.error.processing.routine.exception.NoJokeException;
import ch.epfl.sweng.defensive.error.processing.routine.model.Joke;
import ch.epfl.sweng.defensive.error.processing.routine.repository.JokeRepository;

public class Main {
    public static void main(String[] args) throws NoJokeException {
        JokeRepository repository = new JokeRepository();
        Callback<Joke> errorHandler = new Callback<Joke>(){
            @Override
            public void onSuccess(Joke joke) {
                System.out.println(joke);
            }

            @Override
            public void onError(Exception e) {
                System.out.println(e);
            }
        };
        repository.random(errorHandler);
    }
}