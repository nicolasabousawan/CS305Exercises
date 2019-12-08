package ex4;

public class KVtoDBAdaptor implements KeyValueStore {
    
    //We want to keep the old system working with the new system so we adapt the 
    // new features to work with the old using KeyValueStore interface
    DatabaseImpl newDB;

    public KVtoDBAdaptor(DatabaseImpl old){
        newDB =old;
    }

    @Override
    public void put(int key, int value) {
        newDB.insert("Table",Integer.toString(key),Integer.toString(value));
    }

    @Override
    public Integer get(int key) {
        String result = newDB.retrieve("Table", Integer.toString(key));
        return Integer.valueOf(result);
    }

    @Override
    public int remove(int key) {
        boolean result = newDB.delete("Table", Integer.toString(key));
        return result? 1:0;
    }
}
/*
 all the places in the code that expect a KeyValueStore can receive a
 DatabaseImplToKeyValueStoreAdapter because it implements the interface KeyValueStore.
 */