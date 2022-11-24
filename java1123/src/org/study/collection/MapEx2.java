package org.study.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class MapSub {

	private String keyId;
	private String userId;

	public MapSub(String keyId, String userId) {
		super();
		this.keyId = keyId;
		this.userId = userId;
	}

	public String getKeyId() {
		return keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}

public class MapEx2{
	public static void main(String[] args) {
		
		HashMap<String, String> keyVal = new HashMap<String, String>();
		
		keyVal.put("key1", "m1");
		keyVal.put("key2", "m2");
		keyVal.put("key3", "m3");
		keyVal.put("key4", "m4");
		keyVal.put("key5", "m5");
		
		Set<String> keys = keyVal.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();	// key
			String val = keyVal.get(key);	// value
			
			System.out.println("{"+key+":"+val+"}");	// {키(key):값(value)}
		}
	}
}
	



