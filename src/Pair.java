class Pair implements Comparable<Pair> {
    String country;
    Integer frequency;
    public Pair(String country, Integer freq) {
        this.country = country;
        frequency = freq;
    }
    @Override
    public int compareTo(Pair other) {
        if (frequency<other.frequency) {
            return -1;
        } else {
            if (frequency>other.frequency) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public String toString() {
        return country + ": " + frequency;
    }
}