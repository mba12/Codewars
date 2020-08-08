package com.michaelahern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KataHelper {

    public static List<Point> testVeryLarge()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<Point> points = new ArrayList();
        try (FileReader reader = new FileReader("src\\main\\java\\com\\michaelahern\\testdata.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray pointList = (JSONArray) obj;

            for(Object o : pointList) {
                JSONObject p = (JSONObject) o;
                double p1 = (Double) p.get("a");
                double p2 = (Double) p.get("b");
                Point point = new Point(p1, p2 );
                points.add(point);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return points;
    }

}
