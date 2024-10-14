/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode.m433;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * LeetCode 433
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/10/14 09:12
 */
public class MinimumGeneticMutation {
    private static class GeneStep {
        String gene;
        int step;

        GeneStep(String gene, int step) {
            this.gene = gene;
            this.step = step;
        }
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> geneSet = new HashSet<>(Arrays.asList(bank));
        if (!geneSet.contains(endGene)) return -1;

        Queue<GeneStep> queue = new LinkedList<>();
        queue.offer(new GeneStep(startGene, 0));

        char[] genes = new char[]{'A', 'C', 'G', 'T'};

        while (!queue.isEmpty()) {
            GeneStep current = queue.poll();
            String gene = current.gene;
            int step = current.step;

            if (gene.equals(endGene)) {
                return step;
            }

            for (int i = 0; i < gene.length(); i++) {
                char[] geneArray = gene.toCharArray();
                for (char ch : genes) {
                    geneArray[i] = ch;
                    String newGene = new String(geneArray);
                    if (geneSet.contains(newGene)) {
                        queue.offer(new GeneStep(newGene, step + 1));
                        geneSet.remove(newGene); // avoid revisiting
                    }
                }
            }
        }
        return -1;
    }
}
