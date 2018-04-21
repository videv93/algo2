package com.example.algos.segmenttree;

public class SegmentTree {

    /**
     * The array that stores segment tree nodes
     */
    private int st[];

    /**
     * Constructor to construct segment tree from given array. This
     * constructor  allocates memory for segment tree and calls
     * constructSTUtil() to  fill the allocated memory
     */
    public SegmentTree(int[] arr) {
        int n = arr.length;

        // height of segment tree
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

        int maxSize = 2 * (int) Math.pow(2,x) - 1;
        st = new int[maxSize];

        constructSTUtil(arr, 0, n-1, 0);
    }

    /**
     * A recursive function that constructs Segment Tree for array[ss..se].
     * si is index of current node in segment tree st
     */
    private int constructSTUtil(int[] arr, int ss, int se, int si) {
        if (ss == se) {
            st[si] = arr[ss];
            return arr[ss];
        }

        int mid = getMid(ss, se);
        st[si] = constructSTUtil(arr, ss, mid, si * 2 + 1)
                + constructSTUtil(arr, mid + 1, se, si * 2 + 2);
        return st[si];
    }

    /**
     * A utility function to get the middle index from corner indexes.
     */
    private int getMid(int ss, int se) {
        return ss + (se - ss) / 2;
    }

    /**
     * The function to update a value in input array and segment tree.
     * It uses updateValueUtil() to update the value in segment tree
     */
    public void update(int[] arr, int n, int i, int newVal) {
        if (i < 0 || i > n - 1) {
            System.out.println("Invalid Input");
            return;
        }
        int diff = newVal - arr[i];

        arr[i] = newVal;

        updateValueUtil(0, n-1, i, diff, 0);
    }

    /**
     * A recursive function to update the nodes which have the given
     * index in their range. The following are parameters
     * st, si, ss and se are same as getSumUtil()
     * @param i Index of the element to be updated. This index is in
     *          input array.
     * @param diff Value to be added to all nodes which have i in range
     */
    private void updateValueUtil(int ss, int se, int i, int diff, int si) {
        if (i < ss || i > se) {
            return;
        }
        st[si] = st[si] + diff;
        if (se != ss) {
            int mid = getMid(ss, se);
            updateValueUtil(ss, mid, i, diff, 2 * si + 1);
            updateValueUtil(mid + 1, se, i, diff, 2 * si + 2);
        }
    }

    /**
     * Return sum of elements in range from index qs (quey start) to
     * qe (query end).  It mainly uses getSumUtil()
     */
    public int sum(int qs, int qe) {
        if (qs < 0 || qe > st.length - 1 || qs > qe) {
            System.out.println("Invalid Input");
            return -1;
        }
        return getSumUtil(0, st.length-1, qs, qe, 0);
    }

    /**
     * A recursive function to get the sum of values in given range
     * of the array.  The following are parameters for this function.
     * @param ss Starting indexes of the segment represented
     *           by current node, i.e., st[si]
     * @param se Ending indexes of the segment represented
     *           by current node, i.e., st[si]
     * @param qs Starting indexes of query range
     * @param qe Ending indexes of query range
     * @param si Index of current node in the segment tree. Initially
     *           0 is passed as root is always at index 0
     * @return
     */
    private int getSumUtil(int ss, int se, int qs, int qe, int si) {
        if (qs <= ss && qe >= se) {
            return st[si];
        }
        if (se < qs || ss > qe) {
            return 0;
        }
        int mid = getMid(ss, se);
        return getSumUtil(ss, mid, qs, qe, 2 * si + 1) +
                getSumUtil(mid + 1, se, qs, qe, 2 * se + 2);
    }
}
