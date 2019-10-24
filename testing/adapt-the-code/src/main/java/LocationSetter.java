public interface LocationSetter {
    Position ManualGetUserPosition();
    /*
    We know treasure finder needs position to calculate location
    Position is normally (Original received from the Geolocator Class
    But since we cannot see the source code we create an intermediate interface
    that now allows us to manipulate position through a specialized function
    This interface has no implementation thus we can change the implmentation
    to however we see fit - including custom positions
    Also we can call the function from Geolocator instead and it would behave as
    an adapter to get the data from the built-in interface
     */
}
