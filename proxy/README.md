# Proxy

## Usage

```java
Image image = new ProxyImage("test_10mb.jpg");
// Image will be loaded from disk
image.display();
// Image will not be loaded from disk
image.display();
```