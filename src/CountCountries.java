import java.io.*;
import java.util.*;
public class CountCountries {
    public static void main(String[] args) throws IOException {
        File file = new File("Colfuturo-Seleccionados.csv");
        InputStreamReader streamReader = new InputStreamReader(
                new FileInputStream(file),"UTF-8");
        System.out.println(streamReader.getEncoding());
        BufferedReader reader =
                new BufferedReader(streamReader);
        String line;
        String[] splittedLine;
        Map<String,Integer> map =
                new HashMap<String, Integer>();
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            splittedLine = line.split(",");
            Integer freq = map.get(splittedLine[6]);
            map.put(splittedLine[6], freq==null ? 1: freq + 1);
        }
        reader.close();
        List<Pair> list = new ArrayList<Pair>();
        for (String s: map.keySet()) {
            list.add(new Pair(s, map.get(s)));
        }
        Collections.sort(list);
        for (Pair p: list) {
            System.out.println(p);
        }
    }
}