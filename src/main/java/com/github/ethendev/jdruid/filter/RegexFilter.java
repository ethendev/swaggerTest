package com.github.ethendev.jdruid.filter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;

/**
 * @author: Ethan
 * @Date: 2018/9/14
 */
@Getter
@EqualsAndHashCode(callSuper = true)
public class RegexFilter extends BaseFilter {
    private static final String FILTER_TYPE = "regex";

    private String dimension;
    private String pattern;

    public RegexFilter(@NonNull String dimension, @NonNull String pattern) {
        super(FILTER_TYPE);
        this.dimension = dimension;
        this.pattern = pattern;
    }
}
