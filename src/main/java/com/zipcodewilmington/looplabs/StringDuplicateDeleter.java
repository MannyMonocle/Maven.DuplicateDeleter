package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {



    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(ele -> countFrequency(ele) < maxNumberOfDuplications).toArray(String[] :: new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(ele -> countFrequency(ele) != exactNumberOfDuplications).toArray(String[] :: new);
    }

    public Long countFrequency(String lookingFor){
        return Arrays.stream(array).filter(element -> element == lookingFor).count();
    }

}
