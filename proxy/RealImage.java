import android.util.Log;

import com.nestle.nescafe.dolcegusto.loyaltyapp.common.Constants;

public final class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    @Override
    public void display() {
        Log.i(Constants.TAG, "Displaying " + fileName);
    }

    // Method that only the real image has with intensive operation
    private void loadImage(String fileName) {
        Log.i(Constants.TAG, "Loading " + fileName);
    }
}
