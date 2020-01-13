# HMKit Utils

This repository contains some of the more commonly used byte utility methods used our libraries. It
also contains a Base64 implementation.

### Install

Releases are pushed to jcenter. To include hmkit-oem in your project, add to build.gradle:

```
repositories {
  jcenter()
}

dependencies {
  implementation 'com.highmobility:hmkit-utils:1.4.4'
}
```

Find the latest version name in https://bintray.com/high-mobility/maven/hmkit-utils

### Usage

Convenience methods are in ByteUtils class as static methods. For example you could use

```java
public static String hexFromBytes(byte[] bytes)
```

and

```java
public static byte[] bytesFromHex(String s)
```

Base64 encoder/decoder is in Base64.java
