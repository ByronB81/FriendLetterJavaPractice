import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/hello", (request,response) ->
    "<!DOCTYPE html>" +
    "<html>" +
      "<head>" +
        "<title>Hello Friend!</title>" +
        "<link rel='stylesheet' + href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
          "<h1>Hello from afar</h1>" +
          "<p>Dear Friend,</p>" +
          "<p>How are you? I hope that you are having a nice weekend. I'm vacationing in Iceland while I learn programming!</p>" +
          "<p>You would not believe how cold it is here. I should have gone to Hawaii instead.</p>" +
          "<p>I do like programming a lot... so I got that going for me.</p>" +
          "<p>Looking forward to seeing you soon. I will bring you back a souvenir.</p>" +
          "<p>Cheers!</p>" +
          "<p>-Travel Master Blocker</p>" +
        "</body>" +
      "/html>"
    );

    get("/favorite_photos", (request,response) ->
    "<DOCTYPE html>" +
    "<html>" +
    "<head>" +
      "<title>Favorite Photos</title>" +
      "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
    "</head>" +
    "<body>" +
      "<h1>Favorite Photos of Mine</h1>" +
      "<ul>" +
        "<li><img src='/images/foggymountain.jpeg' alt='A photo of a mountain.'/></li>" +
        "<li><img src='/images/rockycoast.jpeg' alt='A photo of a a rocky beach.'/></li>" +
      "</ul>" +
    "</body>" +
    "</html>"
    );

  }
}
