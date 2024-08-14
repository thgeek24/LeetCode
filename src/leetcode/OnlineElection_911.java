/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

/**
 * LeetCode 911
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/08/14 09:14
 */
public class OnlineElection_911 {
    public static class TopVotedCandidate {
        private final int[] times;
        private final int[] timedLeading;

        public TopVotedCandidate(int[] persons, int[] times) {
            this.times = times;
            this.timedLeading = new int[times.length];

            int[] votes = new int[persons.length];
            int topVoted = persons[0];
            int topVotes = 1;
            votes[topVoted] = topVotes;
            for (int i = 1; i < persons.length; i++) {
                int candidate = persons[i];
                votes[candidate]++;

                if (votes[candidate] >= topVotes) {
                    topVotes = votes[candidate];
                    topVoted = candidate;
                }
                timedLeading[i] = topVoted;
            }
        }

        public int q(int t) {
            int left = 0;
            int right = times.length - 1;
            int index = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (times[mid] == t) {
                    index = mid;
                    break;
                } else if (times[mid] < t) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (index == -1) {
                index = left == 0 ? 0 : left - 1;
            }

            return timedLeading[index];
        }
    }
}