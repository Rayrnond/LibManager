LibManager (Java)
======

This is a very simple API that can be used to download dependencies from web urls. A simple use example is downloading JDA (Java Discord API) and storing it in a lib folder to reduce the size of your project.

### GitHub Issues

Github issues should only be used to report bugs.

### Usage

Add this to your maven pom.xml, replacing ``VERSION`` with the JitPack version below.

[![](https://jitpack.io/v/Rayrnond/LibManager.svg)](https://jitpack.io/#Rayrnond/LibManager)

```xml

    <repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
    </repositories>

    <dependencies>  
	<dependency>
	    <groupId>com.github.Rayrnond</groupId>
	    <artifactId>LibManager</artifactId>
	    <version>VERSION</version>
	</dependency>
    </dependencies>  
```

### Example Usage

This example will download JDA (Java Discord API) from [GitHub/JDA](https://github.com/DV8FromTheWorld/JDA/releases/download/v4.2.1/JDA-4.2.1_253-withDependencies.jar) then put it in the base folder ``libs``.

```java
    public static void main(String[] args) {
        DownloadUtil.download("https://github.com/DV8FromTheWorld/JDA/releases/download/v4.2.1/JDA-4.2.1_253-withDependencies.jar", "libs", new DownloadCallback() {
            @Override
            public void onSuccess() {
                System.out.println("Downloaded JDA!");
            }

            @Override
            public void onError(int var1) {
                System.out.println("Something went wrong while downloading JDA! " + var1);
            }

            @Override
            public void onExist() {
                System.out.println("Skipped downloading JDA because it already exists!");
            }
        });
    }
```

### Contributing

When contributing changes to the Java API please provide as much detail on the changes and the reasons for them. We will
not accept changes that have no meaningful contribution to the project.
