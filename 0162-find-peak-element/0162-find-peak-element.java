class Solution {
        public int findPeakElement(int[] arr) {
                int start = 0;
                        int end = arr.length - 1;

                                while (start < end) {
                                            int mid = start + end >> 1;

                                                        if (arr[mid] < arr[mid + 1]) {
                                                                        start = mid + 1;
                                                                                    } else {
                                                                                                    end = mid;
                                                                                                                }
                                                                                                                        }

                                                                                                                                return start;
                                                                                                                                    }
                                                                                                                                    }