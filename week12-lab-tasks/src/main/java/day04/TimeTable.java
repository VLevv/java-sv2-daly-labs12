package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TimeTable {
    private List<String> data=new ArrayList<>();

    public void readFile(){
        try{
            data= Files.readAllLines(Paths.get("src/main/resources/beosztas.txt"));
        }catch (IOException e){
            throw new IllegalStateException("can not read file",e);
        }

    }

    public int getNumberOfClassesByName(String name){
        int sum=0;
        for(int i = 0;i<data.size();++i){
            if(name.equals(data.get(i))){
                sum+=Integer.parseInt(data.get(i+3));
            }
        }
        return sum;
    }
}
