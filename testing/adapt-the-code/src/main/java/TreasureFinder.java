public class TreasureFinder {
    //private final Geolocator geolocator;
    private final LocationSetter location; //new service

    // There MUST be a parameterless constructor,
    // it is used by our Super-Fancy-Framework-That-Does-Not-Support-Parameters™
    public TreasureFinder() {
        //geolocator = new Geolocator();
        location = new AdaptorForLocation(); //new service
    }

    /*
    We create another constructor with a passable parameter of the interface
    We do this so we can call the treasure finder and edit it's position in the test
    code (we do this by overwriting the interface Position method)
     */

    public TreasureFinder(LocationSetter newLocation) {
        location = newLocation;
    }
    /*
    We can overwrite the code of getUserPosition to allow us to access
    and set our own arbitrary position to customize user Position
    This can be done in the test code. We have to use the interface object
    as the global variable becuase its sole purpose is to allow overrides
    The adaptor is exclusively used to connect the native location service
    to the app.

    When testing we would intialize variable = TreasureFinder();
    This would use the current device location as the user location
    variable.getHint() - based on device location
    Now variable = TreasureFinder(LocationSetter Object{
        OVERRIDE METHOD HERE TO SET POSITION OF CHOICE
    })
    variable.getHint() - based on custom location

     */

    public String getHint(Position treasurePos) {
        //Position userPos = geolocator.getUserPosition(); //old way
        Position userPos = location.ManualGetUserPosition(); //new way with an indirect way access GeoLocator
        if (userPos.latitude > 70) {
            return "Nope, the treasure is not at the North Pole.";
        }

        // Not accurate because of the Earth's curvature. Better calculation coming next sprint!
        double diff = Math.sqrt(Math.pow(treasurePos.latitude - userPos.latitude, 2) + Math.pow(treasurePos.longitude - userPos.longitude, 2));

        if (diff < 0.005) {
            return "You're right there!";
        }

        if (diff < 0.05) {
            return "Close...";
        }

        if (diff < 0.5) {
            return "Not too far.";
        }

        return "Far away.";
    }
}
