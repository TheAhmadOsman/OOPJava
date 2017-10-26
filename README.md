# Object-oriented Programming with Java (CS252)

All instructions are written for Ubuntu 16.04 that you started using in Software Development Tools (CS165). The Luther College Ubuntu image comes with [Netbeans](https://netbeans.org/) and [OpenJDK](http://openjdk.java.net/) preinstalled. If you need to install JDK and Netbeans, use the [Netbeans/JDK bunle](http://www.oracle.com/technetwork/java/javase/downloads/index.html) specific for your platform. It's your responsibility to make the necessary changes if you are using a different OS (macOS, Windows, other flavors of Linux) or IDE.

1. Check the version of Java you have installed: `java -version` and `javac -version` should return something like `1.8.0_144`. It's fine to see a different version, but if `java` is not a recognized command, you need to install JDK.
1. Fork [java-class-pub](https://github.com/yasiro01/java-class-pub/) repository on GitHub. If you are going to access your repository via SSH, add your **public** key to your GitHub account. See [Adding a new SSH key to your GitHub account - User Documentation](https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/) for details.
1. Start Netbeans and choose *Team\Remote\Clone* from the menu.
1. Enter **your** repository's URL. As I'm going to use SSH authentication, my URL is `git@github.com:yasiro01/java-class-pub.git` in this tutorial. It's `https://github.com/yasiro01/java-class-pub.git` for HTTPS access. If you don't have SSH keys, follow the GitHub tutorials on [Generating a new SSH key and adding it to the ssh-agent - User Documentation](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/) or [Using PuTTYgen on Windows to generate SSH key pairs | SSH.COM](https://www.ssh.com/ssh/putty/windows/puttygen). You can also use HTTPS access and authenticate via username/password.
1. If you are using SSH, choose authentication with Private/Public Key and browse to pick your **id_rsa** file. Mine is in `/home/yasiro01/.ssh/id_rsa`. Enter the passphrase you used when generated the keys.
1. If you are using HTTPS, choose authentication with username/password and enter your GitHub credentials.
1. Specify the target **parent** directory. Mine is `/home/yasiro01/Projects`.
1. Click **Next** and proceed to the branch selection.
1. You should see a single branch, **master**, already selected. Click **Next** to proceed to the final step.
1. You will see you parent directory, clone name, checkout branch, and the remote name. Click **Finish** to complete the process.
1. The repository contains project configuration files, so it should be immediately recognized by Netbeans as a valid project.
1. Netbeans has a graphical interface to Git that you can access either via *Team* menu or the project context menu. You can also use terminal and execute [git commands](https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf) there.
1. I recommend that you keep my code templates from the **upstream** as a separate branch (master) of your repository. See [git - Pull new updates from original GitHub repository into forked GitHub repository - Stack Overflow](https://stackoverflow.com/questions/3903817/pull-new-updates-from-original-github-repository-into-forked-github-repository) for an answer or [Syncing a fork - User Documentation](https://help.github.com/articles/syncing-a-fork/) for more details. The following command should work: `git remote add upstream https://github.com/yasiro01/java-class-pub.git`.
1. Create a separate branch (exercise1, exercise2, etc.) for each assignment. See [Create a new branch with git and manage branches · Kunena/Kunena-Forum Wiki](https://github.com/Kunena/Kunena-Forum/wiki/Create-a-new-branch-with-git-and-manage-branches) for details. Don't do it in advance, wait until I publish the relevant code.
1. Once you feel comfortable about Git, GitHub, and branching, look at [GitHub: How to make a fork of public repository private? - Stack Overflow](https://stackoverflow.com/questions/10065526/github-how-to-make-a-fork-of-public-repository-private). Create a new **private** repository *java-class-yourname* and add `https://github.com/yasiro01/java-class-pub.git` as an upstream so you could pull the latest code templates from me. 

## References

### Tools

* [Installing Linux in Our Lab | The Pages of Kent D. Lee](http://knuth.luther.edu/~leekent/stories/installing-linux-in-our-lab.html)
* [NetBeans IDE Java Quick Start Tutorial](https://netbeans.org/kb/docs/java/quickstart.html)
* [Git Cheat Sheet](https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf)
* [Fork A Repo - User Documentation](https://help.github.com/articles/fork-a-repo/)

### Java Overview

* [Java (programming language) - Wikipedia](https://en.wikipedia.org/wiki/Java_\(programming_language\))
* [Java Resources for Students, Hobbyists and More | go.Java | Oracle](https://go.java/index.html)
* [Home: Java Platform, Standard Edition (Java SE) 8 Release 8](https://docs.oracle.com/javase/8/index.html)
* [Overview (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/overview-summary.html)
* [Oracle JDK 9 Documentation](https://docs.oracle.com/javase/9/index.html)
* [Overview (Java SE 9 &amp; JDK 9 )](https://docs.oracle.com/javase/9/docs/api/overview-summary.html)
* [Oracle JDK 9 Documentation](https://docs.oracle.com/javase/9/)
* [Java Technology Reference](http://www.oracle.com/technetwork/java/index-jsp-142903.html)
* [Java String Format Examples - DZone Java](https://dzone.com/articles/java-string-format-examples)
* **[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)**

### Java Basics
* **[Welcome to Java for Python Programmers — Java for Python Programmers](https://runestone.academy/runestone/static/java4python/index.html)**
* [The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/)
* [Trail: Learning the Java Language (The Java™ Tutorials)](https://docs.oracle.com/javase/tutorial/java/)
* [Primitive Data Types (The Java™ Tutorials > Learning the Java Language > Language Basics)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

### File I/O
* [Reading, Writing, and Creating Files (The Java™ Tutorials > Essential Classes > Basic I/O)](https://docs.oracle.com/javase/tutorial/essential/io/file.html)
* [Java - Write to File | Baeldung](http://www.baeldung.com/java-write-to-file)
* **[Lesson: Basic I/O (The Java™ Tutorials > Essential Classes)](https://docs.oracle.com/javase/tutorial/essential/io/index.html)**
* [Java Files and I/O](https://www.tutorialspoint.com/java/java_files_io.htm)
* [Pattern (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
* [Lesson: Regular Expressions (The Java™ Tutorials > Essential Classes)](https://docs.oracle.com/javase/tutorial/essential/regex/)
* [Java Regex - Tutorial](http://www.vogella.com/tutorials/JavaRegularExpressions/article.html)
* [Java Regular Expressions](https://www.tutorialspoint.com/java/java_regular_expressions.htm)

### Collections
* **[Collections (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)**
* [Lesson: Interfaces (The Java™ Tutorials > Collections)](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html)
* [Collections in Java - javatpoint](https://www.javatpoint.com/collections-in-java)
* [HashMap vs. TreeMap vs. HashTable vs. LinkedHashMap - DZone Java](https://dzone.com/articles/hashmap-vs-treemap-vs)

### Testing
* [JUnit 5](http://junit.org/junit5/)
* **[Unit Testing with JUnit - Tutorial](http://www.vogella.com/tutorials/JUnit/article.html)**
* [JUnit Test Framework](https://www.tutorialspoint.com/junit/junit_test_framework.htm)
* [How I Write Tests - Made of Bugs](https://blog.nelhage.com/2016/12/how-i-test/)

### OOP

#### Abstraction
* **[Lesson: Classes and Objects (The Java™ Tutorials > Learning the Java Language)](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)**
* [Java 101: Classes and objects in Java | JavaWorld](https://www.javaworld.com/article/2979739/learn-java/java-101-classes-and-objects-in-java.html)

#### Encapsulation
* [Encapsulation in Java - GeeksforGeeks](http://www.geeksforgeeks.org/encapsulation-in-java/)
* [Java Encapsulation Concept not clear - Stack Overflow](https://stackoverflow.com/questions/19044362/java-encapsulation-concept-not-clear)

#### Inheritance
* **[Inheritance (The Java™ Tutorials > Learning the Java Language > Interfaces and Inheritance)](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)**
* [Java Inheritance](https://www.tutorialspoint.com/java/java_inheritance.htm)
* [Inheritance - Learn Java - Free Interactive Java Tutorial](http://www.learnjavaonline.org/en/Inheritance)
* [Java 101: Inheritance in Java, Part 1 | JavaWorld](https://www.javaworld.com/article/2987426/core-java/java-101-inheritance-in-java-part-1.html)

#### Polymorphism
* **[Polymorphism (The Java™ Tutorials > Learning the Java Language > Interfaces and Inheritance)](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)**
* [Quick Guide To Polymorphism In Java](https://www.sitepoint.com/quick-guide-to-polymorphism-in-java/)
* [Java Polymorphism](https://www.tutorialspoint.com/java/java_polymorphism.htm)

#### Interfaces
* [What Is an Interface? (The Java™ Tutorials > Learning the Java Language > Object-Oriented Programming Concepts)](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
* [Interfaces (The Java™ Tutorials > Learning the Java Language > Interfaces and Inheritance)](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
* [Java Interfaces](http://tutorials.jenkov.com/java/interfaces.html)

### GUI
* **[Trail: Creating a GUI With JFC/Swing (The Java™ Tutorials)](http://docs.oracle.com/javase/tutorial/uiswing/)**
* [Introduction to GUI Building - NetBeans IDE Tutorial](https://netbeans.org/kb/docs/java/gui-functionality.html)
* [GUI Programming - Java Programming Tutorial](https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html)

### Generics
* **[Lesson: Generics (Updated) (The Java™ Tutorials > Learning the Java Language)](https://docs.oracle.com/javase/tutorial/java/generics/index.html)**
* [Lesson: Generics (The Java™ Tutorials > Bonus)](https://docs.oracle.com/javase/tutorial/extra/generics/index.html)
* [Java Generics Tutorial](http://tutorials.jenkov.com/java-generics/index.html)

### Data Structures
* [Data Structures - GeeksforGeeks](http://www.geeksforgeeks.org/data-structures/)
* [Data Structures | Coursera](https://www.coursera.org/learn/data-structures)
