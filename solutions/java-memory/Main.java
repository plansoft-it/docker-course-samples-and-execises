class Main {
    public static void main(String[] args) {
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        System.out.println("max memory is "+heapMaxSize);

        int size = 200*1024*1024;

        byte[] buffer = new byte[size];
    }
}