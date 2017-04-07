package Transformation;

import cucumber.api.Transformer;

/**
 * Created by Shaju on 07/04/2017.
 */
public class SalaryCountTransformer extends Transformer<Integer> {

    @Override
    public Integer transform(String salary) {
        return salary.length();
    }
}
