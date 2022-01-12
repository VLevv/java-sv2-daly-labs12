package day01;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Running {
    public double monthlyResult(String year,String month){
        double sum=0;
        try(Scanner scanner = new Scanner(Paths.get("src/main/resources/running.csv"))){
            String tmp;
            scanner.nextLine();
            while (scanner.hasNextLine()){
                tmp=scanner.nextLine();
                if(tmp.substring(tmp.indexOf(";")+1,tmp.indexOf("-")).equals(year)&&tmp.substring(tmp.indexOf("-")+1,tmp.indexOf("-")+3).equals(month)){
                    sum+=Double.parseDouble(tmp.substring(0,tmp.indexOf(" ")));
                }
            }

        }catch (IOException e){
            throw new IllegalStateException("Can not read file",e);
        }
        return (double)((int)(sum*100))/100;
    }
}
