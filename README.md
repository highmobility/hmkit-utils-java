### What is this repository for? ###

This repository contains some of the more commonly used byte utility methods used in HM java libraries. It also contains a Base64 implementation.

Convenience methods are in Bytes class as static methods. For example you could use

```java
public static String hexFromBytes(byte[] bytes)
```

and

```java
public static byte[] bytesFromHex(String s)
```

Base64 encoder/decoder is in Base64.java