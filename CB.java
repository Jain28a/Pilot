
// Psuedo Code for Circuit Breaker to implement Resiliency patterns 

// CLass for CB
// Method which will open CB which will return True if condition matches 
// Pre defined confi - ErrorFrequncy = 5 ; ErrorDensity = 600000 ; ErrorCode = 403 

function handle403Error():
    currentTimestamp = getCurrentTimestamp()
    lastErrorTimestamp = getLastErrorTimestamp()
    errorCount = getErrorCount()

    if (currentTimestamp - lastErrorTimestamp <= ERROR_DENSITY_MILLIS):
        // Within the error density window
        errorCount++
        if (errorCount >= ERROR_THRESHOLD):
            // Open the circuit
            setLastErrorTimestamp(currentTimestamp)
    else:
        // Reset the error count if the density window has passed
        setErrorCount(1)
        setLastErrorTimestamp(currentTimestamp)

function isCircuitOpen():
    currentTimestamp = getCurrentTimestamp()
    lastErrorTimestamp = getLastErrorTimestamp()
    
    return (currentTimestamp - lastErrorTimestamp) <= ERROR_DENSITY_MILLIS && getErrorCount() >= ERROR_THRESHOLD

function executeRequest():
    if (isCircuitOpen()):
        // Circuit is open, return a user-friendly message
        return "Try after sometime..."
    try:
        // Make a request, and if it results in a 403 error, call handle403Error()
    catch (Exception e):
        // Handle other exceptions here


handleError () {

long currentTime = System.currentTimeMillis();
long lastErrorTimestamp = lastErrorTime.get();

        if (currentTime - lastErrorTimestamp <= ERROR_DENSITY_MILLIS) {
            errorCount.incrementAndGet();
            if (errorCount.get() >= ERROR_THRESHOLD) {
                // Open the circuit
                lastErrorTime.set(currentTime);
            }
        } else {
            // Reset the error count if the density window has passed
            errorCount.set(1);
            lastErrorTime.set(currentTime);
        }

}


getBalance API 

    doCheck() {

        error = connectDB();

    }


Class CB {

    public  errorFrequency = 5; 
    public errorDensity = 600000;
    public  errorCode = 403

    public boolen OpenCB (String errorCode) {

        If erroCode == 403 && errorFrequency >= 5 && errorDensity == 60000{
                        return  True 

        } 


    }

}