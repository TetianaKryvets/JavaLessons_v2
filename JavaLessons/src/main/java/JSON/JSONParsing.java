package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * User: tetiana.kryvets
 * Date: 11/21/2017
 */
public class JSONParsing {
    public static void main(String[] args) throws IOException, ParseException {
        String jsonStrusture = "";
        Object JSONFileObject = null;
        //create parser
        JSONParser parser = new JSONParser();
        //create Object
        JSONFileObject = parser.parse(new FileReader
                ("C://Kryvets/TA_development/JavaLessons/JavaLessons/src/main/java/JSON/JSONExample1.json"));
        //create JSON Object
        JSONObject jsonObj = (JSONObject)JSONFileObject;
        //print PageName and PagePic:
        printNameAndPic(jsonObj);

        //print Info for all Users
        printAllInfo(jsonObj);

    }

    public static void printNameAndPic(JSONObject jsonObj) {
        JSONObject pageInfoJSON = (JSONObject)jsonObj.get("pageInfo");

        String pageName = pageInfoJSON.get("pageName").toString();
        String pagePic = pageInfoJSON.get("pagePic").toString();
        System.out.println("pageInfo: Name " + pageName + " Picture: " + pagePic);
    }

    public static void printAllInfo(JSONObject jsonObj) {
        JSONArray postsArr = (JSONArray)jsonObj.get("posts");
        for (int i = 0; i < postsArr.size(); i++ ) {
            JSONObject jsonobject = (JSONObject)postsArr.get(i);
            String postId = jsonobject.get("post_id").toString();
            String nameOfPersonWhoPosted = jsonobject.get("nameOfPersonWhoPosted").toString();
            String message = jsonobject.get("message").toString();
            String likesCount = jsonobject.get("likesCount").toString();
            String comments = jsonobject.get("comments").toString();

            System.out.println("User_ID: " + postId + "\n" + "UserName: " + nameOfPersonWhoPosted + "\n" + "Message: " +
                    message + "\n" + "LikesCount: "+ likesCount + "\n" + "Comments: " + comments + "\n");

            System.out.println("User_ID" + jsonobject.get("post_id") + "UserName " + jsonobject.get("nameOfPersonWhoPosted"));

            System.out.println("---------------------------------");
        }
    }

}
