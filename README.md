# Google Code Jam - Client API

[![Build Status](https://travis-ci.org/Faylixe/googlecodejam-client.svg)](https://travis-ci.org/Faylixe/googlecodejam-client) [![Coverage Status](https://coveralls.io/repos/Faylixe/googlecodejam-client/badge.svg?branch=master&service=github)](https://coveralls.io/github/Faylixe/googlecodejam-client?branch=master) [![Codacy Badge](https://api.codacy.com/project/badge/grade/a69abad9e6d14c81b62b9deeb99b8e7d)](https://www.codacy.com/app/Faylixe/googlecodejam-client) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/fr.faylixe/googlecodejam-client/badge.svg)](https://maven-badges.herokuapp.com/maven-central/fr.faylixe/googlecodejam-client)

Java client API for Google Code Jam contest.

## Maven dependencies

Following dependency could be added to your *POM.xml* if you want to use the client API into your project.

```xml
<dependency>
    <groupId>fr.faylixe</groupId>
    <artifactId>googlecodejam-client</artifactId>
    <version>1.0.0</version>
</dependency>
```
The API entry point is the **CodeJamSession** class, which could be instantiated as following :

```java
//
final HttpTransport transport = new NetHttpTransport();
final HttpRequestFactory factory = transport.createRequestFactory();
final HTTPRequestExecutor executor = new HTTPRequestExecutor(CODEJAM_HOSTNAME, factory);
//
final Round round = ...;
//
final CodeJamSession session = CodeJamSession.createSession(executor, round);
```

## Command line application

A command line application which consists in the client JAR and a running script is also available. Here is the usage description :

```bash
./codejamclient.sh action parameter
```

Where action belongs to the following option list :

* *--init*
* *--download*
* *--submit*

### Initialization action

This action does not take any parameters, and will open up a Firefox instance
in order to authenticate to Google services. Once Firefox is opened into the login page,
please proceed to the authentication process, and when you will be logged and redirected
to the code jam home page, Firefox will be closed automatically.

```bash
./codejamclient.sh --init
```

Once logged you will be prompted to choose a contest and a round. Those will become contextual round and session
for the current directory you are running the script in, meaning that if you run another time the script with another
action, it will use the created contextual logged session and round.

### Download action

As it name suggests, the *download* action allows logged user to download an input file for a given problem.
If the contest is active, then it will trigger the submission timer depending of the input difficulty you have
choosen (usually 4 minutes for a *small* input, 8 for a *large* one).

The following exemple will download the *small* input file for the first problem.

```bash
./codejamclient.sh --download --problem A --inputtype small
```

### Submit action

Once input file is downloaded, and algorithm solved all test cases, *submit* action could be used in order
to send either the output file as the source file of your algorithm as well.

```bash
./codejamclient.sh --submit --problem A --inputtype small --output path/to/output --sourcefile path/to/sourcefile
```
