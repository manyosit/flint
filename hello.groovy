// This is an first flintbit tutorial

log.info("Welcome to flintibi!")

response=call.connector("db")
              .set("action","insert" )
              .set("query", "insert into engineers (age,lastname,city) values(27,'ani','mumbai')")
              .sync()

response2=call.connector("db")
 .set("action","select")
 .set("database","user")
 .set("type","mysql")
 .set("target","localhost")
 .set("port",3306)
 .set("driver","com.mysql.jdbc.Driver")
 .set("query","select * from user")
 .sync()

log.info "" + response2

log.info "did it"
output.set("message","Hello World!")
