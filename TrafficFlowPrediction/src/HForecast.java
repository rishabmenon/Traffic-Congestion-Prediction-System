/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Iterator;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.KeyValueTextInputFormat;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.mapreduce.Mapper.Context;
/**
 *
 * @author Bala J
 */
public class HForecast {
    
      static Main inst;
      public static class Map extends MapReduceBase implements
      Mapper<Text, Text, Text, Text> {
        
         public void map(Text key, Text input,
               OutputCollector<Text, Text> output, Reporter reporter) throws IOException {
    
                String st = key.toString();
                
                double res = inst.predictTraffic(st);
                
                
                String sre = Double.toString(res);
                
                Main.inst.writetolog("The forecast for location " + st + " is " + sre);
                output.collect(new Text(st), new Text(sre)); 
             
             
         }
      }
      
       public static class Reduce extends MapReduceBase implements Reducer<Text, Text, Text, Text> {
     
            public void reduce(Text key, Iterator<Text> values, OutputCollector<Text, Text> output,
        Reporter reporter) throws IOException {
                
                  String res="";
                  while (values.hasNext()) {
                    
                     res = values.next().toString();
                    
                  }
                  output.collect(key, new Text(res));
                
            }
       }
            
      
      
    
}
