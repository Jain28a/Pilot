

// What is In memory Cache = normally we keep key/value paid in the cache inside memory to avoid I/O operation
/// So for Any Cache you need place holder for key (in our case it is accoutn type id) and value (our case it is intereat rate)
// Then for Cache - we need read from cache and write to cache operations / methods 

// IMAP is Concurrent Map so that it is compatible with multi threads / parallele processing 
// It comes with lockign and unlockign feature in built to avoid race conditions associated with multithreading 

Class InMemCache extends IMap {
    int key;
    String interestRate;

    public Object readCache (int AccId){

        // find matching pair for incoming AccId on which Intererate Rate to be return 

        return objInMemCache;

    }

    public boolean writeCache(int AccId, String intRate) {

        this.key = AccId;
        this.interestRate = intRate;

    }
}