# HMKit Utils

This repository contains some of the more commonly used byte utility methods used our libraries. It
also contains a Base64 implementation.

### Install

Releases are pushed to mavenCentral. To include hmkit-oem in your project, add to build.gradle:

```
repositories {
  mavenCentral()
}

dependencies {
  implementation 'com.high-mobility:hmkit-utils:1.4.5'
}
```

Find the latest version names in [mavenCentral](https://search.maven.org/search?q=g:com.high-mobility)

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
