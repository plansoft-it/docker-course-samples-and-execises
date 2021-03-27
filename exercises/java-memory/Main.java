class Main {
    public static void main(String[] args) {
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        System.out.println("max memory is "+heapMaxSize);
    }
}