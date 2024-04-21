/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package pdai.demo.cyclicbarrier;

import org.junit.jupiter.api.Test;

/**
 * @author Tao Hong
 * @version 1.0
 * @since 2024/04/21 19:30
 */
class DataProcessingPipelineTest {

    @Test
    void test() {
        double[] data = new double[1000];
        DataProcessingPipeline test = new DataProcessingPipeline(data);
        test.process();
    }
}