public class AdaptorForLocation implements LocationSetter {
    @Override
    public Position ManualGetUserPosition() {
        return new Geolocator().getUserPosition();
    }
    /*
     this constructor simply is a long way around for us to connect
     treasure finder to the location service Geolocator but since we can
     override getUserPosition from the Location Setter field we can set our
     own custom position for testing and then simply set it back to geolocator
     without changing multiple locations of code.
     */
}
