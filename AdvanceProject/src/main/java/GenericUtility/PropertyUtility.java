//package GenericUtility;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertyUtility implements Iautoconstants {
//	public FileInputStream file;
//	public Properties prop;
//	/**
//	 * this method is used for fetch the details from properties file
//	 * @param key
//	 * @return
//	 */
//	public String readingDataFromPropertyfile(String key)
//	{
//		try {
//			 file=new FileInputStream(PROPERTYFILE);
//			Properties prop=new Properties();
//			try {
//				prop.load(file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return (prop.getProperty(key).toString()) ;
//
//	}
//
//}
package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements Iautoconstants {
    public FileInputStream file;
    public Properties prop;

    /**
     * This method is used for fetching the details from the properties file.
     *
     * @param key The key whose value needs to be fetched.
     * @return The value corresponding to the key in the properties file, or null if key is not found.
     */
    public String readingDataFromPropertyfile(String key) {
        try {
            file = new FileInputStream(PROPERTYFILE);
            prop = new Properties();
            prop.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(key); // No need to convert to String explicitly, getProperty returns a String or null.
    }
}
