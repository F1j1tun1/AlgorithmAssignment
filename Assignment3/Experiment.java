import java.util.Arrays;

public class Experiment {
    private Sorter srt = new Sorter();
    private Searcher srch = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long startTime = System.nanoTime();
        if (type.equalsIgnoreCase("basic")) {
            srt.basicSort(copy);
        } else {
            srt.advancedSort(copy);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        srch.search(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        System.out.println("==============================================================================");
        System.out.println("Size" + " Type");
        System.out.println(" |  " + "  |  ");

        for (int size : sizes) {
            int[] randomArr = srt.generateRandomArrays(size);
            int[] sortedArr = randomArr.clone();
            Arrays.sort(sortedArr);

            long bubbleRandom = measureSortTime(randomArr, "basic");
            long quickRandom = measureSortTime(randomArr, "advanced");
            long searchRandom = measureSearchTime(randomArr, -1);
            System.out.println(size + " |Random - Bubble: " + bubbleRandom + "ns, Quick: " + quickRandom + "ns, Linear: " + searchRandom + "ns.");

            long bubbleSorted = measureSortTime(sortedArr, "basic");
            long quickSorted = measureSortTime(sortedArr, "advanced");
            long searchSorted = measureSearchTime(sortedArr, -1);
            System.out.println(size + " |Sorted - Bubble: " + bubbleSorted + "ns, Quick: " + quickSorted + "ns, Linear: " + searchSorted + "ns.");
        }
        System.out.println("==============================================================================");
    }
}
