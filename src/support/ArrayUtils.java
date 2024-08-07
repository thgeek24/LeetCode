/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package support;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Array utils to convert an array to list, etc.
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/07 11:21
 */
public class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> List<T> convert(T[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }
}
