# Object-oriented Programming with Java (CS252)

All instructions are written for Ubuntu 16.04 that you learned in Software Development Tools (CS165). it's your responsibility to make the necessary changes if you are using anything else (macOS, Windows, other flavors of Linux). The image you used in Software Development Tools (CS165) comes with [Netbeans](https://netbeans.org/) and [OpenJDK](http://openjdk.java.net/) preinstalled. If you need to install JDK and Netbeans, use the [Netbeans/JDK bunle](http://www.oracle.com/technetwork/java/javase/downloads/index.html) specific for your platform.

1. Check the version of Java you have installed: `java -version` and `javac -version` should return something like `1.8.0_144`. It's fine to see a different version, but if `java` is not a recognized command, you need to install JDK.
1. Fork [this](https://github.com/yasiro01/java-class-pub/) repository.
1. Start Netbeans and choose *Team\Remote\Clone* from the menu.
1. Enter **your** repository's URL. I'm going to use *git@github.com:yasiro01/java-class-pub.git* in this tutorial.
1. Choose authentication with Private/Public Key and browse to pick your **id_rsa** file. Mine is in */home/yasiro01/.ssh/id_rsa*. Enter the passphrase you used when generated the keys.
1. Specify the target **parent** directory. Mine is */home/yasiro01/Projects*.
1. Click **Next** and proceed to the branch selection.
1. You should see a single branch, **master**, already selected. Click **Next** to proceed to the final step.
1. You will see you parent directory, clone name, checkout branch, and the remote name. Click **Finish** to complete the process.
1. The repository contains project configuration files, so it should be immediately recognized by Netbeans as a valid project.
