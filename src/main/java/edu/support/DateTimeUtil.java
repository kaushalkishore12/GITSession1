/**
 * 
 */
package edu.support;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author k.kishore.agrawal
 *
 */
public class DateTimeUtil {
    public static String getDate(String format){
        Date currDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formatedDate = sdf.format(currDate);
        return formatedDate;
    }
    
    public static String getTime(){
        Date currDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String formatedDate = sdf.format(currDate);
        return formatedDate;
    }
}
