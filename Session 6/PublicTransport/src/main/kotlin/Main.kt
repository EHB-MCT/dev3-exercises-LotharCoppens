import java.sql.*
import java.util.*

fun main() {
    val credentials = Credentials()

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()


// Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

// Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                "2122DEV3014",
        connectionProps
    )
    println("What number is your train?")
    val userAnswer = readLine()
    val statement = connection.prepareStatement("SELECT * FROM trains WHERE id LIKE ?")
// The result of your query will be a type ResultSet
// This is a bit similar to collections in Kotlin
// But since the library is based on Java, we get a type from Java

    statement.setString(1, userAnswer)
    val result = statement.executeQuery()
    while (result.next()) {
        println(result.getString());
    }



}