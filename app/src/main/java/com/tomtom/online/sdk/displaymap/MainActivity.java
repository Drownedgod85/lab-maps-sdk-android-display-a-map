package com.tomtom.online.sdk.displaymap;

// Add here the TomtomMap import
import com.tomtom.online.sdk.map.TomtomMap;

// Add here the OnMapReadyCallback import
import com.tomtom.online.sdk.map.OnMapReadyCallback;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
// Add here the NonNull import
import androidx.annotation.NonNull;



public class MainActivity extends AppCompatActivity
// Implement here the MainActivity with OnMapReadyCallback
public class MainActivity extends AppCompatActivity
implements OnMapReadyCallback {
{
  // Add here the TomtomMap member
  private TomtomMap tomtomMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  // Add here the onMapReady callback
  @Override
  public void onMapReady(@NonNull final TomtomMap tomtomMap) {
    this.tomtomMap = tomtomMap;
}
}
