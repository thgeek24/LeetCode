/*
 * Copyright (c) 2024 THGEEK.COM. All rights reserved.
 */

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * LeetCode 721
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2024/05/27 10:00
 */
public class AccountsMerge_721 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        UnionFind unionFind = new UnionFind(accounts);
        unionFind.union();
        return unionFind.getAccounts();
    }

    private static class UnionFind {
        private final int[] roots;
        private final List<String> names;
        private final List<Set<String>> emails;
        private int count;

        private UnionFind(List<List<String>> accounts) {
            this.count = accounts.size();
            this.names = accounts.stream()
                    .map(item -> item.get(0))
                    .collect(Collectors.toList());
            this.emails = accounts.stream()
                    .map(item -> item.stream()
                            .skip(1)
                            .collect(Collectors.toSet()))
                    .collect(Collectors.toList());
            this.roots = new int[count];
            for (int i = 0; i < count; i++) {
                roots[i] = i;
            }
        }

        private void union() {
            for (int i = 1; i < emails.size(); i++) {
                for (int j = 0; j < i; j++) {
                    int rootI = getRoot(i);
                    int rootJ = getRoot(j);
                    if (rootI != rootJ) {
                        if (haveSameEmails(emails.get(i), emails.get(j))) {
                            roots[rootI] = rootJ;
                            count--;
                        }
                    }
                }
            }
        }

        private int getRoot(int i) {
            if (i == roots[i]) {
                return i;
            }
            return roots[i] = getRoot(roots[i]);
        }

        private boolean haveSameEmails(Set<String> emails1, Set<String> emails2) {
            Set<String> intersection = new HashSet<>(emails1);
            intersection.retainAll(emails2);
            return !intersection.isEmpty();
        }

        private List<List<String>> getAccounts() {
            Map<Integer, Set<String>> accountMap = new HashMap<>();
            for (int i = 0; i < this.emails.size(); i++) {
                int root = getRoot(i);
                Set<String> emailSet = accountMap.getOrDefault(root, new TreeSet<>());
                emailSet.addAll(this.emails.get(i));
                accountMap.put(root, emailSet);
            }
            return accountMap.entrySet().stream()
                    .map(item -> {
                        List<String> account = new ArrayList<>();
                        account.add(this.names.get(item.getKey()));
                        account.addAll(item.getValue());
                        return account;
                    })
                    .collect(Collectors.toList());
        }
    }
}
