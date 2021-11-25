import java.sql.*
import java.util.*

fun main () {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
}

// Prepare credentials
val connectionProps = Properties()
connectionProps["user"] = "your user"
connectionProps["password"] = "your password"

// Create the connection: this will allow us to run queries on it later
val connection =  DriverManager.getConnection(
    "jdbc:" + "mysql" + "://" +
            "your host" +
            ":" + "3306 (this is your port, this is the default)" + "/" +
            credentials.databaseName,
    connectionProps)

val statement = connection.prepareStatement(query)
// The result of your query will be a type ResultSet
// This is a bit similar to collections in Kotlin
// But since the library is based on Java, we get a type from Java
val result = statement.executeQuery()







