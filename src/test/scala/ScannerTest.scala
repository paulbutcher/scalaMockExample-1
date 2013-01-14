trait SocketClient {
  def frobnicate(): Unit
}

class ScannerBase(path: String)

class XScanner[T <: SocketClient](
  confPath: String = "/etc/default/configPath",
  socketClientFactory: String => T
) extends ScannerBase(confPath) {
  val socket = socketClientFactory("Some Socket Name")
  socket.frobnicate
}

import org.scalatest.FunSuite
import org.scalamock.scalatest.MockFactory

class ScannerTest extends FunSuite with MockFactory {

  test("scanner") {
    val mockFactory = mockFunction[String, SocketClient]
    val mockClient = mock[SocketClient]
    mockFactory.expects("Some Socket Name").returning(mockClient)
    (mockClient.frobnicate _).expects()
    val scanner = new XScanner("path/to/config", mockFactory)
  }
}
