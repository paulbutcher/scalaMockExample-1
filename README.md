This repo demonstrates that this example code produces the error:


[info] Resolving org.scalatest#scalatest_2.10.0;2.0.M5 ...
[info] Done updating.
[info] Compiling 1 Scala source to /home/local/RAD/craddie/dev/sm/target/scala-2.10/test-classes...
[error] /home/local/RAD/craddie/dev/sm/src/test/scala/ScannerTest.scala:18: overriding method nestedSuites in trait SuiteMixin of type => scala.collection.immutable.IndexedSeq[org.scalatest.Suite];
[error]  method nestedSuites in trait Suite of type => List[org.scalatest.Suite] has incompatible type
[error] class ScannerTest extends FunSuite with MockFactory {
[error]       ^
[error] one error found
[error] (test:compile) Compilation failed
[error] Total time: 4 s, completed 14/01/2013 1:26:57 PM

When running sbt test
