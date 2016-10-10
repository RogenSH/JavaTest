import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
  Map���ڴ洢��ֵ�ԣ����ݼ��õ�ֵ����˲�������ظ���ֵ�����ظ���
   ��1��HashMap���ݼ���hashCodeֵ�洢���ݣ����ݼ�����ֱ�ӻ�ȡ����ֵ�����кܿ�ķ����ٶȡ�
     HashMap���ֻ����һ����¼�ļ�Ϊnull�������������¼��ֵΪnull��
     HashMap��֧���̵߳�ͬ��������һʱ�̿����ж���߳�ͬʱдHashMap�����ܻᵼ�����ݵĲ�һ�¡������Ҫͬ����������Collections.synchronizedMap(HashMap map)����ʹHashMap����ͬ����������
  
   ��2��Hashtable��HashMap���ƣ���ͬ���ǣ����������¼�ļ�����ֵΪ�գ�
             ��֧���̵߳�ͬ��������һʱ��ֻ��һ���߳���дHashtable��
             Ȼ������Ҳ������Hashtable��д��ʱ��Ƚ�����
             
   ��3��LinkedHashMap�����˼�¼�Ĳ���˳��
              ����Iteraor����LinkedHashMapʱ���ȵõ��ļ�¼�϶����Ȳ���ġ�
              �ڱ�����ʱ����HashMap������HashMap��ȫ�����ԡ�
   
   ��4��TreeMap�ܹ���������ļ�¼���ݼ�����Ĭ���ǰ���������Ҳ����ָ������ıȽ�����
               ����Iteraor����TreeMapʱ���õ��ļ�¼���Ź���ġ�TreeMap�ļ���ֵ������Ϊ�ա�
 */

public class _TestMap {
	public static void init(Map map) {
		if (map != null) {
			String key = null;
			for (int i = 5; i > 0; i--) {
				key = new Integer(i).toString() + ".0";
				map.put(key, key.toString());
				// Map�еļ��ǲ��ظ��ģ��������������ֵһ���ļ�¼��
				// ��ô�����ļ�¼�Ḳ���Ȳ���ļ�¼
				map.put(key, key.toString() + "0");
			}
		}
	}

	public static void output(Map map) {
		if (map != null) {
			Object key = null;
			Object value = null;
			// ʹ�õ���������Map�ļ������ݼ�ȡֵ
			Iterator it = map.keySet().iterator();
			while (it.hasNext()) {
				key = it.next();
				value = map.get(key);
				System.out.println("key: " + key + "; value: " + value);
			}
			// ����ʹ�õ���������Map�ļ�¼Map.Entry
			Map.Entry entry = null;
			it = map.entrySet().iterator();
			while (it.hasNext()) {
				// һ��Map.Entry����һ����¼
				entry = (Map.Entry) it.next();
				// ͨ��entry���Ի�ü�¼�ļ���ֵ
				// System.out.println("key: " + entry.getKey() + "; value: " +
				// entry.getValue());
			}
		}
	}

	public static boolean containsKey(Map map, Object key) {
		if (map != null) {
			return map.containsKey(key);
		}
		return false;
	}

	public static boolean containsValue(Map map, Object value) {
		if (map != null) {
			return map.containsValue(value);
		}
		return false;
	}

	public static void testHashMap() {
		Map myMap = new HashMap();
		init(myMap);
		// HashMap�ļ�����Ϊnull
		myMap.put(null, "ddd");
		// HashMap��ֵ����Ϊnull
		myMap.put("aaa", null);
		output(myMap);
	}

	public static void testHashtable() {
		Map myMap = new Hashtable();
		init(myMap);
		// Hashtable�ļ�����Ϊnull
		// myMap.put(null,"ddd");
		// Hashtable��ֵ����Ϊnull
		// myMap.put("aaa", null);
		output(myMap);
	}

	public static void testLinkedHashMap() {
		Map myMap = new LinkedHashMap();
		init(myMap);
		// LinkedHashMap�ļ�����Ϊnull
		myMap.put(null, "ddd");
		myMap.put(null, "aaa");
		// LinkedHashMap��ֵ����Ϊnull
		myMap.put("aaa", null);
		output(myMap);
	}

	public static void testTreeMap() {
		Map myMap = new TreeMap();
		init(myMap);
		// TreeMap�ļ�����Ϊnull
		// myMap.put(null,"ddd");
		// TreeMap��ֵ����Ϊnull
		// myMap.put("aaa", null);
		output(myMap);
	}

	public static void main(String[] args) {
		System.out.println("����HashMap");
		_TestMap.testHashMap();
		System.out.println("����Hashtable");
		_TestMap.testHashtable();
		System.out.println("����LinkedHashMap");
		_TestMap.testLinkedHashMap();
		System.out.println("����TreeMap");
		_TestMap.testTreeMap();

		Map myMap = new HashMap();
		_TestMap.init(myMap);
		System.out.println("�³�ʼ��һ��Map: myMap");
		_TestMap.output(myMap);
		// ���Map
		myMap.clear();
		System.out.println("��myMap clear��myMap����ô?  " + myMap.isEmpty());
		_TestMap.output(myMap);
		myMap.put("aaa", "aaaa");
		myMap.put("bbb", "bbbb");
		// �ж�Map�Ƿ����ĳ������ĳֵ
		System.out
				.println("myMap������aaa?  " + _TestMap.containsKey(myMap, "aaa"));
		System.out.println("myMap����ֵaaaa?  "
				+ _TestMap.containsValue(myMap, "aaaa"));
		// ���ݼ�ɾ��Map�еļ�¼
		myMap.remove("aaa");
		System.out.println("ɾ����aaa��myMap������aaa?  "
				+ _TestMap.containsKey(myMap, "aaa"));
		// ��ȡMap�ļ�¼��
		System.out.println("myMap�����ļ�¼��:  " + myMap.size());
	}
}
