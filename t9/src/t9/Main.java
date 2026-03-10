package t9;

public class Main {
    public static void main(String[] args) {
        long start;
        long end;
        long duration;
        double ms;

        final int TEN = 10;
        final int THOUSAND = 1000;
        final int TEN_THOUSAND = 10000;
        final int HUNDRED_THOUSAND = 100000;
        final int MILLION = 1000000;
        

        Context ctx = new Context();

        int[] baseSmallthin = generateArray(THOUSAND, TEN);
        int[] baseSmallwide = generateArray(THOUSAND, TEN_THOUSAND);
        int[] baseLargethin = generateArray(HUNDRED_THOUSAND, THOUSAND);
        int[] baseLargewide = generateArray(HUNDRED_THOUSAND, MILLION);

        int[] smallthin;
        int[] smallwide;
        int[] largethin;
        int[] largewide;

        //
        //insertsort 
        //
        ctx.setStrategy(new insertionSort());

        smallthin = baseSmallthin.clone();
        smallwide = baseSmallwide.clone();
        largethin = baseLargethin.clone();
        largewide = baseLargewide.clone();

        start = System.nanoTime();
        ctx.sort(smallthin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("insertsort smallthin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(smallwide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("insertsort smallwide duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largethin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("insertsort largethin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largewide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("insertsort largewide duration in ms: " + ms);
        //
        //selectionsort 
        //
        ctx.setStrategy(new SelectionSort());

        smallthin = baseSmallthin.clone();
        smallwide = baseSmallwide.clone();
        largethin = baseLargethin.clone();
        largewide = baseLargewide.clone();

        start = System.nanoTime();
        ctx.sort(smallthin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("selectionsort smallthin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(smallwide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("selectionsort smallwide duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largethin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("selectionsort largethin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largewide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("selectionsort largewide duration in ms: " + ms);
        //
        //countingsort 
        //
        ctx.setStrategy(new CountingSort());

        smallthin = baseSmallthin.clone();
        smallwide = baseSmallwide.clone();
        largethin = baseLargethin.clone();
        largewide = baseLargewide.clone();


        start = System.nanoTime();
        ctx.sort(smallthin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("countingsort smallthin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(smallwide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("countingsort smallwide duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largethin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("countingsort largethin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largewide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("countingsort largewide duration in ms: " + ms);
        //
        //bucketsort 
        //
        ctx.setStrategy(new BucketSort());

        smallthin = baseSmallthin.clone();
        smallwide = baseSmallwide.clone();
        largethin = baseLargethin.clone();
        largewide = baseLargewide.clone();


        start = System.nanoTime();
        ctx.sort(smallthin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("bucketsort smallthin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(smallwide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("bucketsort smallwide duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largethin);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("bucketsort largethin duration in ms: " + ms);

        start = System.nanoTime();
        ctx.sort(largewide);
        end = System.nanoTime();
        duration = end-start;
        ms = duration / 1_000_000.0;

        System.out.println("bucketsort largewide duration in ms: " + ms);
        

    }


    public static int[] generateArray(int size, int range){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }
    
}
