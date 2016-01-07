# discou-indexer-archetype
Maven archetype project for a DiscOU indexer.

To use it, be sure you included the [DiscOU Maven Repository](https://github.com/the-open-university/discou/) in your settings.xml.

To setup a project:
```
$  mvn archetype:generate -DarchetypeGroupId=discou -DarchetypeArtifactId=discou-indexer-archetype \\
-DarchetypeVersion=0.0.2-SNAPSHOT -DgroupId=my-group -DartifactId=my-artifact -Dversion=1-SNAPSHOT 
```

