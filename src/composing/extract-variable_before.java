void renderBanner() {
  final boolean foundMac = platform.toUpperCase().indexOf("MAC") != -1;
  final boolean foundIe = platform.toUpperCase().indexOf("IE") != -1;


  if (foundMac && foundIe && wasInitialized() && resize > 0 )
  {
    // do something
  }
}